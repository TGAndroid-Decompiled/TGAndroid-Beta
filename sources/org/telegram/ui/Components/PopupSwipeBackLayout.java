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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;

public class PopupSwipeBackLayout extends FrameLayout {
    private GestureDetectorCompat detector;
    private ValueAnimator foregroundAnimator;
    private boolean isAnimationInProgress;
    private boolean isProcessingSwipe;
    private boolean isSwipeBackDisallowed;
    private boolean isSwipeDisallowed;
    private int notificationIndex;
    private IntCallback onHeightUpdateListener;
    private float overrideForegroundHeight;
    Theme.ResourcesProvider resourcesProvider;
    public float transitionProgress;
    SparseIntArray overrideHeightIndex = new SparseIntArray();
    private float toProgress = -1.0f;
    private Paint overlayPaint = new Paint(1);
    private Paint foregroundPaint = new Paint();
    private int foregroundColor = 0;
    private Path mPath = new Path();
    private RectF mRect = new RectF();
    private ArrayList<OnSwipeBackProgressListener> onSwipeBackProgressListeners = new ArrayList<>();
    private int currentForegroundIndex = -1;
    private int lastHeightReported = -1;
    private Rect hitRect = new Rect();

    public interface IntCallback {
        void run(int i);
    }

    public interface OnSwipeBackProgressListener {
        void onSwipeBackProgress(PopupSwipeBackLayout popupSwipeBackLayout, float f, float f2);
    }

    public PopupSwipeBackLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.detector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!PopupSwipeBackLayout.this.isProcessingSwipe && !PopupSwipeBackLayout.this.isSwipeDisallowed) {
                    if (!PopupSwipeBackLayout.this.isSwipeBackDisallowed && PopupSwipeBackLayout.this.transitionProgress == 1.0f && f <= (-scaledTouchSlop) && Math.abs(f) >= Math.abs(1.5f * f2)) {
                        PopupSwipeBackLayout popupSwipeBackLayout = PopupSwipeBackLayout.this;
                        if (!popupSwipeBackLayout.isDisallowedView(motionEvent2, popupSwipeBackLayout.getChildAt(popupSwipeBackLayout.transitionProgress > 0.5f ? 1 : 0))) {
                            PopupSwipeBackLayout.this.isProcessingSwipe = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i = 0; i < PopupSwipeBackLayout.this.getChildCount(); i++) {
                                PopupSwipeBackLayout.this.getChildAt(i).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                        }
                    }
                    PopupSwipeBackLayout.this.isSwipeDisallowed = true;
                }
                if (PopupSwipeBackLayout.this.isProcessingSwipe) {
                    PopupSwipeBackLayout.this.toProgress = -1.0f;
                    PopupSwipeBackLayout.this.transitionProgress = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent2.getX() - motionEvent.getX()) / PopupSwipeBackLayout.this.getWidth()));
                    PopupSwipeBackLayout.this.invalidateTransforms();
                }
                return PopupSwipeBackLayout.this.isProcessingSwipe;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!PopupSwipeBackLayout.this.isAnimationInProgress && !PopupSwipeBackLayout.this.isSwipeDisallowed && f >= 600.0f) {
                    PopupSwipeBackLayout.this.clearFlags();
                    PopupSwipeBackLayout.this.animateToState(0.0f, f / 6000.0f);
                }
                return false;
            }
        });
        this.overlayPaint.setColor(-16777216);
    }

    public void setSwipeBackDisallowed(boolean z) {
        this.isSwipeBackDisallowed = z;
    }

    public void addOnSwipeBackProgressListener(OnSwipeBackProgressListener onSwipeBackProgressListener) {
        this.onSwipeBackProgressListeners.add(onSwipeBackProgressListener);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int indexOfChild = indexOfChild(view);
        int save = canvas.save();
        if (indexOfChild != 0) {
            int i = this.foregroundColor;
            if (i == 0) {
                this.foregroundPaint.setColor(Theme.getColor("actionBarDefaultSubmenuBackground", this.resourcesProvider));
            } else {
                this.foregroundPaint.setColor(i);
            }
            canvas.drawRect(view.getX(), 0.0f, view.getX() + view.getMeasuredWidth(), getMeasuredHeight(), this.foregroundPaint);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (indexOfChild == 0) {
            this.overlayPaint.setAlpha((int) (this.transitionProgress * 64.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.overlayPaint);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public void invalidateTransforms() {
        invalidateTransforms(true);
    }

    public void invalidateTransforms(boolean z) {
        float f;
        float f2;
        if (!this.onSwipeBackProgressListeners.isEmpty()) {
            for (int i = 0; i < this.onSwipeBackProgressListeners.size(); i++) {
                this.onSwipeBackProgressListeners.get(i).onSwipeBackProgress(this, this.toProgress, this.transitionProgress);
            }
        }
        View childAt = getChildAt(0);
        View view = null;
        int i2 = this.currentForegroundIndex;
        if (i2 >= 0 && i2 < getChildCount()) {
            view = getChildAt(this.currentForegroundIndex);
        }
        childAt.setTranslationX((-this.transitionProgress) * getWidth() * 0.5f);
        float f3 = ((1.0f - this.transitionProgress) * 0.05f) + 0.95f;
        childAt.setScaleX(f3);
        childAt.setScaleY(f3);
        if (view != null) {
            view.setTranslationX((1.0f - this.transitionProgress) * getWidth());
        }
        invalidateVisibility();
        float measuredWidth = childAt.getMeasuredWidth();
        float measuredHeight = childAt.getMeasuredHeight();
        if (view != null) {
            f2 = view.getMeasuredWidth();
            f = this.overrideForegroundHeight;
            if (f == 0.0f) {
                f = view.getMeasuredHeight();
            }
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        if (!(childAt.getMeasuredWidth() == 0 || childAt.getMeasuredHeight() == 0)) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) getParent();
            float f4 = this.transitionProgress;
            float paddingTop = measuredHeight + ((f - measuredHeight) * f4) + actionBarPopupWindowLayout.getPaddingTop() + actionBarPopupWindowLayout.getPaddingBottom();
            actionBarPopupWindowLayout.updateAnimation = false;
            actionBarPopupWindowLayout.setBackScaleX(((measuredWidth + ((f2 - measuredWidth) * f4)) + (actionBarPopupWindowLayout.getPaddingLeft() + actionBarPopupWindowLayout.getPaddingRight())) / actionBarPopupWindowLayout.getMeasuredWidth());
            if (z) {
                actionBarPopupWindowLayout.setBackScaleY(paddingTop / actionBarPopupWindowLayout.getMeasuredHeight());
            }
            actionBarPopupWindowLayout.updateAnimation = true;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt2 = getChildAt(i3);
                childAt2.setPivotX(0.0f);
                childAt2.setPivotY(0.0f);
            }
            invalidate();
        }
    }

    public boolean isForegroundOpen() {
        return this.transitionProgress > 0.0f;
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
        if (actionMasked != 0 || this.mRect.contains(motionEvent.getX(), motionEvent.getY())) {
            int i = this.currentForegroundIndex;
            if (i < 0 || i >= getChildCount()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            View childAt = getChildAt(0);
            childAt = getChildAt(this.currentForegroundIndex);
            if (this.transitionProgress > 0.5f) {
            }
            boolean dispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent);
            return (!dispatchTouchEvent && actionMasked == 0) || dispatchTouchEvent || onTouchEvent(motionEvent);
        }
        callOnClick();
        return true;
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateTransforms();
    }

    private boolean processTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.isAnimationInProgress) {
            return true;
        }
        if (this.detector.onTouchEvent(motionEvent) || (action != 1 && action != 3)) {
            return this.isProcessingSwipe;
        }
        if (this.isProcessingSwipe) {
            clearFlags();
            animateToState(this.transitionProgress >= 0.5f ? 1.0f : 0.0f, 0.0f);
            return false;
        } else if (!this.isSwipeDisallowed) {
            return false;
        } else {
            clearFlags();
            return false;
        }
    }

    public void animateToState(final float f, float f2) {
        ValueAnimator duration = ValueAnimator.ofFloat(this.transitionProgress, f).setDuration(Math.max(0.5f, Math.abs(this.transitionProgress - f) - Math.min(0.2f, f2)) * 300.0f);
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        final int i = UserConfig.selectedAccount;
        this.notificationIndex = NotificationCenter.getInstance(i).setAnimationInProgress(this.notificationIndex, null);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PopupSwipeBackLayout.this.lambda$animateToState$0(valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                PopupSwipeBackLayout.this.isAnimationInProgress = true;
                PopupSwipeBackLayout.this.toProgress = f;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getInstance(i).onAnimationFinish(PopupSwipeBackLayout.this.notificationIndex);
                PopupSwipeBackLayout popupSwipeBackLayout = PopupSwipeBackLayout.this;
                float f3 = f;
                popupSwipeBackLayout.transitionProgress = f3;
                if (f3 <= 0.0f) {
                    popupSwipeBackLayout.currentForegroundIndex = -1;
                }
                PopupSwipeBackLayout.this.invalidateTransforms();
                PopupSwipeBackLayout.this.isAnimationInProgress = false;
            }
        });
        duration.start();
    }

    public void lambda$animateToState$0(ValueAnimator valueAnimator) {
        this.transitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateTransforms();
    }

    public void clearFlags() {
        this.isProcessingSwipe = false;
        this.isSwipeDisallowed = false;
    }

    public void openForeground(int i) {
        if (!this.isAnimationInProgress) {
            this.currentForegroundIndex = i;
            this.overrideForegroundHeight = this.overrideHeightIndex.get(i);
            animateToState(1.0f, 0.0f);
        }
    }

    public void closeForeground() {
        closeForeground(true);
    }

    public void closeForeground(boolean z) {
        if (!this.isAnimationInProgress) {
            if (!z) {
                this.currentForegroundIndex = -1;
                this.transitionProgress = 0.0f;
                invalidateTransforms();
                return;
            }
            animateToState(0.0f, 0.0f);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt.getLayoutParams() instanceof FrameLayout.LayoutParams) && ((FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity == 80) {
                int i6 = i4 - i2;
                childAt.layout(0, i6 - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), i6);
            } else {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        invalidateTransforms();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            float top = childAt.getTop();
            float measuredWidth = childAt.getMeasuredWidth();
            float measuredHeight = childAt.getMeasuredHeight();
            int i = this.currentForegroundIndex;
            if (i != -1 && i < getChildCount()) {
                View childAt2 = getChildAt(this.currentForegroundIndex);
                float top2 = childAt2.getTop();
                float measuredWidth2 = childAt2.getMeasuredWidth();
                float f = this.overrideForegroundHeight;
                if (f == 0.0f) {
                    f = childAt2.getMeasuredHeight();
                }
                if (!(childAt.getMeasuredWidth() == 0 || childAt.getMeasuredHeight() == 0 || childAt2.getMeasuredWidth() == 0 || childAt2.getMeasuredHeight() == 0)) {
                    top = AndroidUtilities.lerp(top, top2, this.transitionProgress);
                    measuredWidth = AndroidUtilities.lerp(measuredWidth, measuredWidth2, this.transitionProgress);
                    measuredHeight = AndroidUtilities.lerp(measuredHeight, f, this.transitionProgress);
                }
            }
            int save = canvas.save();
            this.mPath.rewind();
            int dp = AndroidUtilities.dp(6.0f);
            this.mRect.set(0.0f, top, measuredWidth, measuredHeight + top);
            float f2 = dp;
            this.mPath.addRoundRect(this.mRect, f2, f2, Path.Direction.CW);
            canvas.clipPath(this.mPath);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            if (this.onHeightUpdateListener != null && this.lastHeightReported != this.mRect.height()) {
                IntCallback intCallback = this.onHeightUpdateListener;
                int height = (int) this.mRect.height();
                this.lastHeightReported = height;
                intCallback.run(height);
            }
        }
    }

    public void setOnHeightUpdateListener(IntCallback intCallback) {
        this.onHeightUpdateListener = intCallback;
    }

    public boolean isDisallowedView(MotionEvent motionEvent, View view) {
        view.getHitRect(this.hitRect);
        if (this.hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && view.canScrollHorizontally(-1)) {
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

    private void invalidateVisibility() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (i == 0) {
                if (this.transitionProgress == 1.0f && childAt.getVisibility() != 4) {
                    childAt.setVisibility(4);
                }
                if (!(this.transitionProgress == 1.0f || childAt.getVisibility() == 0)) {
                    childAt.setVisibility(0);
                }
            } else if (i == this.currentForegroundIndex) {
                if (this.transitionProgress == 0.0f && childAt.getVisibility() != 4) {
                    childAt.setVisibility(4);
                }
                if (!(this.transitionProgress == 0.0f || childAt.getVisibility() == 0)) {
                    childAt.setVisibility(0);
                }
            } else {
                childAt.setVisibility(4);
            }
        }
    }

    public void setNewForegroundHeight(int i, int i2, boolean z) {
        this.overrideHeightIndex.put(i, i2);
        int i3 = this.currentForegroundIndex;
        if (i == i3 && i3 >= 0 && i3 < getChildCount()) {
            ValueAnimator valueAnimator = this.foregroundAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.foregroundAnimator = null;
            }
            if (z) {
                View childAt = getChildAt(this.currentForegroundIndex);
                float f = this.overrideForegroundHeight;
                if (f == 0.0f) {
                    f = childAt.getMeasuredHeight();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(f, i2).setDuration(240L);
                duration.setInterpolator(Easings.easeInOutQuad);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PopupSwipeBackLayout.this.lambda$setNewForegroundHeight$1(valueAnimator2);
                    }
                });
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
                return;
            }
            this.overrideForegroundHeight = i2;
            invalidateTransforms();
        }
    }

    public void lambda$setNewForegroundHeight$1(ValueAnimator valueAnimator) {
        this.overrideForegroundHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateTransforms();
    }

    public void setForegroundColor(int i) {
        this.foregroundColor = i;
    }
}
