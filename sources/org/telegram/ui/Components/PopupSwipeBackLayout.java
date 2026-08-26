package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;

public class PopupSwipeBackLayout extends FrameLayout {
    private static final int DURATION = 300;
    private int currentForegroundIndex;
    private GestureDetectorCompat detector;
    private ValueAnimator foregroundAnimator;
    private int foregroundColor;
    private Paint foregroundPaint;
    private Rect hitRect;
    private boolean isAnimationInProgress;
    private boolean isProcessingSwipe;
    private boolean isSwipeBackDisallowed;
    private boolean isSwipeDisallowed;
    private int lastHeightReported;
    float lastToProgress;
    float lastTransitionProgress;
    private Path mPath;
    private RectF mRect;
    private AnimationNotificationsLocker notificationsLocker;
    private Runnable onForegroundOpen;
    private IntCallback onHeightUpdateListener;
    private ArrayList<OnSwipeBackProgressListener> onSwipeBackProgressListeners;
    private Paint overlayPaint;
    private float overrideForegroundHeight;
    SparseIntArray overrideHeightIndex;
    Theme.ResourcesProvider resourcesProvider;
    public boolean stickToRight;
    private float toProgress;
    public float transitionProgress;

    public interface IntCallback {
        void run(int i);
    }

    public interface OnSwipeBackProgressListener {
        void onSwipeBackProgress(PopupSwipeBackLayout popupSwipeBackLayout, float f, float f2);
    }

    public PopupSwipeBackLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.overrideHeightIndex = new SparseIntArray();
        this.toProgress = -1.0f;
        this.overlayPaint = new Paint(1);
        this.foregroundPaint = new Paint();
        this.foregroundColor = 0;
        this.mPath = new Path();
        this.mRect = new RectF();
        this.onSwipeBackProgressListeners = new ArrayList<>();
        this.currentForegroundIndex = -1;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.lastHeightReported = -1;
        this.hitRect = new Rect();
        this.resourcesProvider = resourcesProvider;
        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.detector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!PopupSwipeBackLayout.this.isAnimationInProgress && !PopupSwipeBackLayout.this.isSwipeDisallowed && f >= 600.0f) {
                    PopupSwipeBackLayout.this.clearFlags();
                    PopupSwipeBackLayout.this.animateToState(0.0f, f / 6000.0f);
                }
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                MotionEvent motionEvent3;
                if (PopupSwipeBackLayout.this.isProcessingSwipe || PopupSwipeBackLayout.this.isSwipeDisallowed) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (PopupSwipeBackLayout.this.isSwipeBackDisallowed || PopupSwipeBackLayout.this.transitionProgress != 1.0f || f > (-scaledTouchSlop) || Math.abs(f) < Math.abs(1.5f * f2)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        PopupSwipeBackLayout popupSwipeBackLayout = PopupSwipeBackLayout.this;
                        motionEvent3 = motionEvent2;
                        if (!popupSwipeBackLayout.isDisallowedView(motionEvent3, popupSwipeBackLayout.getChildAt(popupSwipeBackLayout.transitionProgress > 0.5f ? 1 : 0))) {
                            PopupSwipeBackLayout.this.isProcessingSwipe = true;
                            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i = 0; i < PopupSwipeBackLayout.this.getChildCount(); i++) {
                                PopupSwipeBackLayout.this.getChildAt(i).dispatchTouchEvent(motionEventObtain);
                            }
                            motionEventObtain.recycle();
                        }
                    }
                    PopupSwipeBackLayout.this.isSwipeDisallowed = true;
                }
                if (PopupSwipeBackLayout.this.isProcessingSwipe) {
                    PopupSwipeBackLayout.this.toProgress = -1.0f;
                    PopupSwipeBackLayout.this.transitionProgress = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / PopupSwipeBackLayout.this.getWidth()));
                    PopupSwipeBackLayout.this.invalidateTransforms();
                }
                return PopupSwipeBackLayout.this.isProcessingSwipe;
            }
        });
        this.overlayPaint.setColor(-16777216);
    }

    public void animateToState(final float f, float f2) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.transitionProgress, f).setDuration((long) (Math.max(0.5f, Math.abs(this.transitionProgress - f) - Math.min(0.2f, f2)) * 300.0f));
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.notificationsLocker.lock();
        duration.addUpdateListener(new PopupSwipeBackLayout$$ExternalSyntheticLambda0(this, 0));
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PopupSwipeBackLayout.this.notificationsLocker.unlock();
                PopupSwipeBackLayout popupSwipeBackLayout = PopupSwipeBackLayout.this;
                float f3 = f;
                popupSwipeBackLayout.transitionProgress = f3;
                if (f3 <= 0.0f) {
                    popupSwipeBackLayout.currentForegroundIndex = -1;
                }
                PopupSwipeBackLayout.this.invalidateTransforms();
                PopupSwipeBackLayout.this.isAnimationInProgress = false;
                if (PopupSwipeBackLayout.this.onForegroundOpen == null || Math.abs(f - 1.0f) >= 0.01f) {
                    return;
                }
                PopupSwipeBackLayout.this.onForegroundOpen.run();
            }

            @Override
            public void onAnimationStart(Animator animator) {
                PopupSwipeBackLayout.this.isAnimationInProgress = true;
                PopupSwipeBackLayout.this.toProgress = f;
            }
        });
        duration.start();
    }

    public void clearFlags() {
        this.isProcessingSwipe = false;
        this.isSwipeDisallowed = false;
    }

    private void invalidateVisibility() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (i == 0) {
                if (this.transitionProgress == 1.0f && childAt.getVisibility() != 4) {
                    childAt.setVisibility(4);
                }
                if (this.transitionProgress != 1.0f && childAt.getVisibility() != 0) {
                    childAt.setVisibility(0);
                }
            } else if (i == this.currentForegroundIndex) {
                if (this.transitionProgress == 0.0f && childAt.getVisibility() != 4) {
                    childAt.setVisibility(4);
                }
                if (this.transitionProgress != 0.0f && childAt.getVisibility() != 0) {
                    childAt.setVisibility(0);
                }
            } else {
                childAt.setVisibility(4);
            }
        }
    }

    public boolean isDisallowedView(MotionEvent motionEvent, View view) {
        view.getHitRect(this.hitRect);
        if (this.hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (view.canScrollHorizontally(-1) || (view instanceof ActionBarMenuSlider))) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (isDisallowedView(motionEvent, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void lambda$animateToState$0(ValueAnimator valueAnimator) {
        this.transitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateTransforms();
    }

    public void lambda$setNewForegroundHeight$1(ValueAnimator valueAnimator) {
        this.overrideForegroundHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateTransforms();
    }

    private boolean processTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.isAnimationInProgress) {
            return true;
        }
        if (this.detector.mDetector.onTouchEvent(motionEvent) || !(action == 1 || action == 3)) {
            return this.isProcessingSwipe;
        }
        if (this.isProcessingSwipe) {
            clearFlags();
            animateToState(this.transitionProgress >= 0.5f ? 1.0f : 0.0f, 0.0f);
            return false;
        }
        if (!this.isSwipeDisallowed) {
            return false;
        }
        clearFlags();
        return false;
    }

    public void addOnSwipeBackProgressListener(OnSwipeBackProgressListener onSwipeBackProgressListener) {
        this.onSwipeBackProgressListeners.add(onSwipeBackProgressListener);
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        invalidateTransforms();
    }

    public void closeForeground() {
        closeForeground(true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        float top = childAt.getTop();
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        int i = this.currentForegroundIndex;
        if (i != -1 && i < getChildCount()) {
            View childAt2 = getChildAt(this.currentForegroundIndex);
            float top2 = childAt2.getTop();
            float measuredWidth2 = childAt2.getMeasuredWidth();
            float measuredHeight2 = this.overrideForegroundHeight;
            if (measuredHeight2 == 0.0f) {
                measuredHeight2 = childAt2.getMeasuredHeight();
            }
            if (childAt.getMeasuredWidth() != 0 && childAt.getMeasuredHeight() != 0 && childAt2.getMeasuredWidth() != 0 && childAt2.getMeasuredHeight() != 0) {
                top = AndroidUtilities.lerp(top, top2, this.transitionProgress);
                measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.transitionProgress);
                measuredHeight = AndroidUtilities.lerp(measuredHeight, measuredHeight2, this.transitionProgress);
            }
        }
        int iSave = canvas.save();
        this.mPath.rewind();
        int iDp = AndroidUtilities.dp(12.0f);
        if (this.stickToRight) {
            this.mRect.set(getWidth() - measuredWidth, top, getWidth(), measuredHeight + top);
        } else {
            this.mRect.set(0.0f, top, measuredWidth, measuredHeight + top);
        }
        float f = iDp;
        this.mPath.addRoundRect(this.mRect, f, f, Path.Direction.CW);
        canvas.clipPath(this.mPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
        if (this.onHeightUpdateListener == null || this.lastHeightReported == this.mRect.height()) {
            return;
        }
        IntCallback intCallback = this.onHeightUpdateListener;
        int iHeight = (int) this.mRect.height();
        this.lastHeightReported = iHeight;
        intCallback.run(iHeight);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (processTouchEvent(motionEvent)) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        RectF rectF = this.mRect;
        if (rectF != null) {
            rectF.contains(motionEvent.getX(), motionEvent.getY());
        }
        if (actionMasked == 0 && !this.mRect.contains(motionEvent.getX(), motionEvent.getY())) {
            callOnClick();
            return true;
        }
        int i = this.currentForegroundIndex;
        if (i < 0 || i >= getChildCount()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(this.currentForegroundIndex);
        if (this.transitionProgress > 0.5f) {
            childAt = childAt2;
        }
        boolean zDispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent);
        return (!zDispatchTouchEvent && actionMasked == 0) || zDispatchTouchEvent || onTouchEvent(motionEvent);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2;
        int iIndexOfChild = indexOfChild(view);
        int iSave = canvas.save();
        if (iIndexOfChild != 0) {
            int i = this.foregroundColor;
            if (i == 0) {
                this.foregroundPaint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
            } else {
                this.foregroundPaint.setColor(i);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), this.foregroundPaint);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (iIndexOfChild == 0) {
            this.overlayPaint.setAlpha((int) (this.transitionProgress * 64.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.overlayPaint);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave);
        return zDrawChild;
    }

    public void invalidateTransforms() {
        invalidateTransforms(true);
    }

    public boolean isForegroundOpen() {
        return this.transitionProgress > 0.0f;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                if (this.stickToRight) {
                    int i6 = i3 - i;
                    int i7 = i4 - i2;
                    childAt.layout(i6 - childAt.getMeasuredWidth(), i7 - childAt.getMeasuredHeight(), i6, i7);
                } else {
                    int i8 = i4 - i2;
                    childAt.layout(0, i8 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i8);
                }
            } else if (this.stickToRight) {
                int i9 = i3 - i;
                childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, childAt.getMeasuredHeight());
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateTransforms();
    }

    public void openForeground(int i) {
        if (this.isAnimationInProgress) {
            return;
        }
        this.currentForegroundIndex = i;
        this.overrideForegroundHeight = this.overrideHeightIndex.get(i);
        animateToState(1.0f, 0.0f);
    }

    public void setForegroundColor(int i) {
        this.foregroundColor = i;
    }

    public void setNewForegroundHeight(int i, int i2, boolean z) {
        int i3 = 1;
        this.overrideHeightIndex.put(i, i2);
        int i4 = this.currentForegroundIndex;
        if (i == i4 && i4 >= 0 && i4 < getChildCount()) {
            ValueAnimator valueAnimator = this.foregroundAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.foregroundAnimator = null;
            }
            if (!z) {
                this.overrideForegroundHeight = i2;
                invalidateTransforms();
                return;
            }
            View childAt = getChildAt(this.currentForegroundIndex);
            float measuredHeight = this.overrideForegroundHeight;
            if (measuredHeight == 0.0f) {
                measuredHeight = childAt.getMeasuredHeight();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(measuredHeight, i2).setDuration(240L);
            duration.setInterpolator(Easings.easeInOutQuad);
            duration.addUpdateListener(new PopupSwipeBackLayout$$ExternalSyntheticLambda0(this, i3));
            this.isAnimationInProgress = true;
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PopupSwipeBackLayout.this.isAnimationInProgress = false;
                    PopupSwipeBackLayout.this.foregroundAnimator = null;
                }
            });
            duration.start();
            this.foregroundAnimator = duration;
        }
    }

    public void setOnForegroundOpenFinished(Runnable runnable) {
        this.onForegroundOpen = runnable;
    }

    public void setOnHeightUpdateListener(IntCallback intCallback) {
        this.onHeightUpdateListener = intCallback;
    }

    public void setStickToRight(boolean z) {
        this.stickToRight = z;
    }

    public void setSwipeBackDisallowed(boolean z) {
        this.isSwipeBackDisallowed = z;
    }

    public void closeForeground(boolean z) {
        if (this.isAnimationInProgress) {
            return;
        }
        if (z) {
            animateToState(0.0f, 0.0f);
            return;
        }
        this.currentForegroundIndex = -1;
        this.transitionProgress = 0.0f;
        invalidateTransforms();
    }

    public void invalidateTransforms(boolean z) {
        float measuredWidth;
        float measuredHeight;
        if (this.lastToProgress != this.toProgress || this.lastTransitionProgress != this.transitionProgress) {
            if (!this.onSwipeBackProgressListeners.isEmpty()) {
                for (int i = 0; i < this.onSwipeBackProgressListeners.size(); i++) {
                    this.onSwipeBackProgressListeners.get(i).onSwipeBackProgress(this, this.toProgress, this.transitionProgress);
                }
            }
            this.lastToProgress = this.toProgress;
            this.lastTransitionProgress = this.transitionProgress;
        }
        View childAt = getChildAt(0);
        int i2 = this.currentForegroundIndex;
        View childAt2 = (i2 < 0 || i2 >= getChildCount()) ? null : getChildAt(this.currentForegroundIndex);
        childAt.setTranslationX((-this.transitionProgress) * getWidth() * 0.5f);
        float f = ((1.0f - this.transitionProgress) * 0.05f) + 0.95f;
        childAt.setScaleX(f);
        childAt.setScaleY(f);
        if (childAt2 != null) {
            childAt2.setTranslationX((1.0f - this.transitionProgress) * getWidth());
        }
        invalidateVisibility();
        float measuredWidth2 = childAt.getMeasuredWidth();
        float measuredHeight2 = childAt.getMeasuredHeight();
        if (childAt2 != null) {
            measuredWidth = childAt2.getMeasuredWidth();
            measuredHeight = this.overrideForegroundHeight;
            if (measuredHeight == 0.0f) {
                measuredHeight = childAt2.getMeasuredHeight();
            }
        } else {
            measuredWidth = 0.0f;
            measuredHeight = 0.0f;
        }
        if (childAt.getMeasuredWidth() == 0 || childAt.getMeasuredHeight() == 0) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) getParent();
        float f2 = this.transitionProgress;
        float f3 = ((measuredWidth - measuredWidth2) * f2) + measuredWidth2;
        float fM = DiffUtil.m(measuredHeight, measuredHeight2, f2, measuredHeight2);
        float paddingRight = f3 + actionBarPopupWindowLayout.getPaddingRight() + actionBarPopupWindowLayout.getPaddingLeft();
        float paddingBottom = fM + actionBarPopupWindowLayout.getPaddingBottom() + actionBarPopupWindowLayout.getPaddingTop();
        actionBarPopupWindowLayout.updateAnimation = false;
        actionBarPopupWindowLayout.setBackScaleX(paddingRight / actionBarPopupWindowLayout.getMeasuredWidth());
        if (z) {
            actionBarPopupWindowLayout.setBackScaleY(Math.min(1.0f, paddingBottom / actionBarPopupWindowLayout.getMeasuredHeight()));
        }
        actionBarPopupWindowLayout.updateAnimation = true;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt3 = getChildAt(i3);
            childAt3.setPivotX(0.0f);
            childAt3.setPivotY(0.0f);
        }
        invalidate();
    }
}
