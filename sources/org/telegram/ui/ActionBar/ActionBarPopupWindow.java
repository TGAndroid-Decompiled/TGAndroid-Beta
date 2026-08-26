package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PopupSwipeBackLayout;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda22;

public class ActionBarPopupWindow extends PopupWindow {
    public static final ActionBarPopupWindow$$ExternalSyntheticLambda0 NOP;
    public static final DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
    public static Method layoutInScreenMethod;
    public static final Field superListenerField;
    public boolean animationEnabled;
    public int dismissAnimationDuration;
    public boolean isClosingAnimated;
    public ViewTreeObserver.OnScrollChangedListener mSuperScrollListener;
    public ViewTreeObserver mViewTreeObserver;
    public final AnimationNotificationsLocker notificationsLocker;
    public final long outEmptyTime;
    public boolean pauseNotifications;
    public boolean scaleOut;
    public AnimatorSet windowAnimatorSet;

    public final class AnonymousClass2 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ActionBarPopupWindow this$0;

        public AnonymousClass2(ActionBarPopupWindow actionBarPopupWindow, int i) {
            this.$r8$classId = i;
            this.this$0 = actionBarPopupWindow;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ActionBarPopupWindowLayout actionBarPopupWindowLayout;
            switch (this.$r8$classId) {
                case 0:
                    ActionBarPopupWindow actionBarPopupWindow = this.this$0;
                    ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = null;
                    actionBarPopupWindow.windowAnimatorSet = null;
                    ViewGroup viewGroup = (ViewGroup) actionBarPopupWindow.getContentView();
                    if (viewGroup instanceof ActionBarPopupWindowLayout) {
                        actionBarPopupWindowLayout = (ActionBarPopupWindowLayout) viewGroup;
                        actionBarPopupWindowLayout.startAnimationPending = false;
                    } else {
                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
                            if (viewGroup.getChildAt(i) instanceof ActionBarPopupWindowLayout) {
                                actionBarPopupWindowLayout2 = (ActionBarPopupWindowLayout) viewGroup.getChildAt(i);
                                actionBarPopupWindowLayout2.startAnimationPending = false;
                            }
                        }
                        actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
                    }
                    int itemsCount = actionBarPopupWindowLayout.getItemsCount();
                    for (int i2 = 0; i2 < itemsCount; i2++) {
                        View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(i2);
                        if (!(childAt instanceof GapView)) {
                            childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                        }
                    }
                    break;
                default:
                    ActionBarPopupWindow actionBarPopupWindow2 = this.this$0;
                    actionBarPopupWindow2.windowAnimatorSet = null;
                    actionBarPopupWindow2.isClosingAnimated = false;
                    actionBarPopupWindow2.setFocusable(false);
                    try {
                        ActionBarPopupWindow.super.dismiss();
                        break;
                    } catch (Exception unused) {
                    }
                    actionBarPopupWindow2.unregisterListener();
                    if (actionBarPopupWindow2.pauseNotifications) {
                        actionBarPopupWindow2.notificationsLocker.unlock();
                    }
                    break;
            }
        }
    }

    public class ActionBarPopupWindowLayout extends FrameLayout {
        public boolean animationEnabled;
        public int backAlpha;
        public float backScaleX;
        public float backScaleY;
        public int backgroundColor;
        public Drawable backgroundDrawable;
        public final Rect bgPaddings;
        public boolean clipChildren;
        public boolean fitItems;
        public int gapEndY;
        public int gapStartY;
        public ArrayList itemAnimators;
        public int lastStartedChild;
        public final AnonymousClass2 linearLayout;
        public OnDispatchKeyEventListener mOnDispatchKeyEventListener;
        public onSizeChangedListener onSizeChangedListener;
        public Path path;
        public final HashMap positions;
        public float reactionsEnterProgress;
        public Rect rect;
        public final ScrollView scrollView;
        public boolean shownFromBottom;
        public boolean startAnimationPending;
        public boolean swipeBackGravityBottom;
        public boolean swipeBackGravityRight;
        public final PopupSwipeBackLayout swipeBackLayout;
        public View topView;
        public boolean updateAnimation;
        public ActionBarPopupWindow window;

        public ActionBarPopupWindowLayout(Context context) {
            this(R.drawable.popup_fixed_alert2, 0, context, null);
        }

        @Override
        public final void addView(View view) {
            addView(view);
        }

        public final int addViewToSwipeBack(ViewGroup viewGroup) {
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-2, -2, this.shownFromBottom ? 80 : 48);
            PopupSwipeBackLayout popupSwipeBackLayout = this.swipeBackLayout;
            popupSwipeBackLayout.addView(viewGroup, layoutParamsCreateFrame);
            return popupSwipeBackLayout.getChildCount() - 1;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            AnonymousClass2 anonymousClass2;
            int i;
            boolean z;
            int i2;
            Rect rect;
            int i3;
            float f;
            float f2;
            Canvas canvas2;
            boolean z2;
            boolean z3 = this.swipeBackGravityRight;
            PopupSwipeBackLayout popupSwipeBackLayout = this.swipeBackLayout;
            if (z3) {
                setTranslationX((1.0f - this.backScaleX) * getMeasuredWidth());
                View view = this.topView;
                if (view != null) {
                    view.setTranslationX((1.0f - this.backScaleX) * getMeasuredWidth());
                    this.topView.setAlpha(1.0f - popupSwipeBackLayout.transitionProgress);
                    float f3 = (-(this.topView.getMeasuredHeight() - AndroidUtilities.dp(16.0f))) * popupSwipeBackLayout.transitionProgress;
                    this.topView.setTranslationY(f3);
                    setTranslationY(f3);
                }
            }
            if (this.swipeBackGravityBottom) {
                setTranslationY((1.0f - this.backScaleY) * getMeasuredHeight());
            }
            if (this.backgroundDrawable != null) {
                int i4 = this.gapStartY;
                ScrollView scrollView = this.scrollView;
                int scrollY = i4 - (scrollView == null ? 0 : scrollView.getScrollY());
                int scrollY2 = this.gapEndY - (scrollView == null ? 0 : scrollView.getScrollY());
                int i5 = 0;
                while (true) {
                    anonymousClass2 = this.linearLayout;
                    i = 1;
                    if (i5 >= anonymousClass2.getChildCount()) {
                        z = false;
                        break;
                    } else {
                        if ((anonymousClass2.getChildAt(i5) instanceof GapView) && anonymousClass2.getChildAt(i5).getVisibility() == 0) {
                            z = true;
                            break;
                        }
                        i5++;
                    }
                }
                int i6 = 0;
                for (float f4 = 16.0f; i6 < 2 && (i6 != i || scrollY >= (-AndroidUtilities.dp(f4))); f4 = 16.0f) {
                    int saveCount = canvas.getSaveCount();
                    Rect rect2 = this.bgPaddings;
                    if (!z || this.backAlpha == 255) {
                        i2 = saveCount;
                        rect = rect2;
                        i3 = -1000000;
                        f = 16.0f;
                        f2 = 1.0f;
                        canvas2 = canvas;
                        if (this.gapStartY != -1000000) {
                            canvas2.save();
                            canvas2.clipRect(0, rect.top, getMeasuredWidth(), getMeasuredHeight());
                        }
                        z2 = true;
                    } else {
                        i2 = saveCount;
                        rect = rect2;
                        i3 = -1000000;
                        f = 16.0f;
                        f2 = 1.0f;
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, rect2.top, getMeasuredWidth(), getMeasuredHeight(), this.backAlpha, 31);
                        z2 = false;
                    }
                    this.backgroundDrawable.setAlpha(z2 ? this.backAlpha : 255);
                    if (this.shownFromBottom) {
                        int measuredHeight = getMeasuredHeight();
                        AndroidUtilities.rectTmp2.set(0, (int) ((f2 - this.backScaleY) * measuredHeight), (int) (getMeasuredWidth() * this.backScaleX), measuredHeight);
                    } else {
                        if (scrollY > (-AndroidUtilities.dp(f))) {
                            int measuredHeight2 = (int) (getMeasuredHeight() * this.backScaleY);
                            if (i6 == 0) {
                                if (popupSwipeBackLayout == null || !popupSwipeBackLayout.stickToRight) {
                                    Rect rect3 = AndroidUtilities.rectTmp2;
                                    int iDp = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.gapStartY != i3 ? AndroidUtilities.dp(f2) : 0);
                                    int measuredWidth = (int) (getMeasuredWidth() * this.backScaleX);
                                    if (this.gapStartY != i3) {
                                        measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f) + scrollY);
                                    }
                                    rect3.set(0, iDp, measuredWidth, measuredHeight2);
                                } else {
                                    Rect rect4 = AndroidUtilities.rectTmp2;
                                    int measuredWidth2 = getMeasuredWidth() - ((int) (getMeasuredWidth() * this.backScaleX));
                                    int iDp2 = (scrollView == null ? 0 : -scrollView.getScrollY()) + (this.gapStartY != i3 ? AndroidUtilities.dp(f2) : 0);
                                    int measuredWidth3 = getMeasuredWidth();
                                    if (this.gapStartY != i3) {
                                        measuredHeight2 = Math.min(measuredHeight2, AndroidUtilities.dp(f) + scrollY);
                                    }
                                    rect4.set(measuredWidth2, iDp2, measuredWidth3, measuredHeight2);
                                }
                            } else if (measuredHeight2 < scrollY2) {
                                if (this.gapStartY != i3) {
                                    canvas2.restore();
                                }
                            } else if (popupSwipeBackLayout == null || !popupSwipeBackLayout.stickToRight) {
                                AndroidUtilities.rectTmp2.set(0, scrollY2, (int) (getMeasuredWidth() * this.backScaleX), measuredHeight2);
                            } else {
                                AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.backScaleX)), scrollY2, getMeasuredWidth(), measuredHeight2);
                            }
                        } else if (popupSwipeBackLayout == null || !popupSwipeBackLayout.stickToRight) {
                            AndroidUtilities.rectTmp2.set(0, this.gapStartY < 0 ? 0 : -AndroidUtilities.dp(f), (int) (getMeasuredWidth() * this.backScaleX), (int) (getMeasuredHeight() * this.backScaleY));
                        } else {
                            AndroidUtilities.rectTmp2.set(getMeasuredWidth() - ((int) (getMeasuredWidth() * this.backScaleX)), this.gapStartY < 0 ? 0 : -AndroidUtilities.dp(f), getMeasuredWidth(), (int) (getMeasuredHeight() * this.backScaleY));
                        }
                        i6++;
                        i = 1;
                    }
                    if (this.reactionsEnterProgress != f2) {
                        if (this.rect == null) {
                            this.rect = new Rect();
                        }
                        Rect rect5 = this.rect;
                        Rect rect6 = AndroidUtilities.rectTmp2;
                        int i7 = rect6.right;
                        int i8 = rect6.top;
                        rect5.set(i7, i8, i7, i8);
                        AndroidUtilities.lerp(this.rect, rect6, this.reactionsEnterProgress, rect6);
                    }
                    Drawable drawable = this.backgroundDrawable;
                    Rect rect7 = AndroidUtilities.rectTmp2;
                    drawable.setBounds(rect7);
                    this.backgroundDrawable.draw(canvas2);
                    if (this.clipChildren) {
                        rect7.left += rect.left;
                        rect7.top += rect.top;
                        rect7.right -= rect.right;
                        rect7.bottom -= rect.bottom;
                        canvas2.clipRect(rect7);
                    }
                    if (z) {
                        canvas2.save();
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(this.backgroundDrawable.getBounds());
                        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        Path path = this.path;
                        if (path == null) {
                            this.path = new Path();
                        } else {
                            path.rewind();
                        }
                        this.path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                        canvas2.clipPath(this.path);
                        for (int i9 = 0; i9 < anonymousClass2.getChildCount(); i9++) {
                            if ((anonymousClass2.getChildAt(i9) instanceof GapView) && anonymousClass2.getChildAt(i9).getVisibility() == 0) {
                                canvas2.save();
                                GapView gapView = (GapView) anonymousClass2.getChildAt(i9);
                                float x = 0.0f;
                                View view2 = gapView;
                                float y = 0.0f;
                                while (view2 != this) {
                                    x += view2.getX();
                                    y += view2.getY();
                                    view2 = (View) view2.getParent();
                                    if (view2 == null) {
                                        break;
                                    }
                                }
                                canvas2.translate(x, (y * (scrollView == null ? 1.0f : scrollView.getScaleY())) - (scrollView == null ? 0 : scrollView.getScrollY()));
                                gapView.draw(canvas2);
                                canvas2.restore();
                            }
                        }
                        canvas2.restore();
                    }
                    canvas2.restoreToCount(i2);
                    i6++;
                    i = 1;
                }
            }
            float f5 = this.reactionsEnterProgress;
            if (f5 == 1.0f) {
                super.dispatchDraw(canvas);
                return;
            }
            Rect rect8 = AndroidUtilities.rectTmp2;
            canvas.saveLayerAlpha(rect8.left, rect8.top, rect8.right, rect8.bottom, (int) (f5 * 255.0f), 31);
            float f6 = (this.reactionsEnterProgress * 0.5f) + 0.5f;
            canvas.scale(f6, f6, rect8.right, rect8.top);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            OnDispatchKeyEventListener onDispatchKeyEventListener = this.mOnDispatchKeyEventListener;
            if (onDispatchKeyEventListener != null) {
                onDispatchKeyEventListener.onDispatchKeyEvent(keyEvent);
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        public int getBackAlpha() {
            return this.backAlpha;
        }

        public float getBackScaleX() {
            return this.backScaleX;
        }

        public float getBackScaleY() {
            return this.backScaleY;
        }

        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        public Drawable getBackgroundDrawable() {
            return this.backgroundDrawable;
        }

        public int getItemsCount() {
            return getChildCount();
        }

        public Rect getPadding() {
            return this.bgPaddings;
        }

        public PopupSwipeBackLayout getSwipeBack() {
            return this.swipeBackLayout;
        }

        public int getViewsCount() {
            return getChildCount();
        }

        public int getVisibleHeight() {
            return (int) (getMeasuredHeight() * this.backScaleY);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            PopupSwipeBackLayout popupSwipeBackLayout = this.swipeBackLayout;
            if (popupSwipeBackLayout != null) {
                popupSwipeBackLayout.invalidateTransforms(!this.startAnimationPending);
            }
        }

        public final void precalculateHeight() {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE);
            AnonymousClass2 anonymousClass2 = this.linearLayout;
            anonymousClass2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            anonymousClass2.getMeasuredHeight();
        }

        public void setAnimationEnabled(boolean z) {
            this.animationEnabled = z;
        }

        public void setBackAlpha(int i) {
            if (this.backAlpha != i) {
                invalidate();
            }
            this.backAlpha = i;
        }

        public void setBackScaleX(float f) {
            if (this.backScaleX != f) {
                this.backScaleX = f;
                invalidate();
                onSizeChangedListener onsizechangedlistener = this.onSizeChangedListener;
                if (onsizechangedlistener != null) {
                    onsizechangedlistener.onSizeChanged();
                }
            }
        }

        public void setBackScaleY(float f) {
            if (this.backScaleY != f) {
                this.backScaleY = f;
                if (this.animationEnabled && this.updateAnimation) {
                    int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(16.0f);
                    boolean z = this.shownFromBottom;
                    HashMap map = this.positions;
                    AnonymousClass2 anonymousClass2 = this.linearLayout;
                    if (z) {
                        for (int i = this.lastStartedChild; i >= 0; i--) {
                            View childAt = anonymousClass2.getChildAt(i);
                            if (childAt != null && childAt.getVisibility() == 0 && !(childAt instanceof GapView)) {
                                Integer num = (Integer) map.get(childAt);
                                if (num != null) {
                                    if (OKLCH.m$1(32.0f, AndroidUtilities.dp(48.0f) * num.intValue(), measuredHeight) > measuredHeight * f) {
                                        break;
                                    }
                                }
                                this.lastStartedChild = i - 1;
                                startChildAnimation(childAt);
                            }
                        }
                    } else {
                        int itemsCount = getItemsCount();
                        int i2 = 0;
                        for (int i3 = 0; i3 < itemsCount; i3++) {
                            View childAt2 = anonymousClass2.getChildAt(i3);
                            if (childAt2.getVisibility() == 0) {
                                int measuredHeight2 = childAt2.getMeasuredHeight() + i2;
                                if (i3 >= this.lastStartedChild) {
                                    if (((Integer) map.get(childAt2)) != null && measuredHeight2 - AndroidUtilities.dp(24.0f) > measuredHeight * f) {
                                        break;
                                    }
                                    this.lastStartedChild = i3 + 1;
                                    startChildAnimation(childAt2);
                                }
                                i2 = measuredHeight2;
                            }
                        }
                    }
                }
                invalidate();
                onSizeChangedListener onsizechangedlistener = this.onSizeChangedListener;
                if (onsizechangedlistener != null) {
                    onsizechangedlistener.onSizeChanged();
                }
            }
        }

        @Override
        public void setBackgroundColor(int i) {
            Drawable drawable;
            if (this.backgroundColor == i || (drawable = this.backgroundDrawable) == null) {
                return;
            }
            this.backgroundColor = i;
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }

        @Override
        public void setBackgroundDrawable(Drawable drawable) {
            this.backgroundColor = -1;
            this.backgroundDrawable = drawable;
            if (drawable != null) {
                drawable.getPadding(this.bgPaddings);
            }
        }

        public void setDispatchKeyEventListener(OnDispatchKeyEventListener onDispatchKeyEventListener) {
            this.mOnDispatchKeyEventListener = onDispatchKeyEventListener;
        }

        public void setFitItems(boolean z) {
            this.fitItems = z;
        }

        public void setOnSizeChangedListener(onSizeChangedListener onsizechangedlistener) {
            this.onSizeChangedListener = onsizechangedlistener;
        }

        public void setParentWindow(ActionBarPopupWindow actionBarPopupWindow) {
            this.window = actionBarPopupWindow;
        }

        public void setReactionsTransitionProgress(float f) {
            this.reactionsEnterProgress = f;
            invalidate();
        }

        public void setShownFromBottom(boolean z) {
            this.shownFromBottom = z;
        }

        public void setSwipeBackForegroundColor(int i) {
            getSwipeBack().setForegroundColor(i);
        }

        public void setTopView(View view) {
            this.topView = view;
        }

        public void setupRadialSelectors(int i) {
            AnonymousClass2 anonymousClass2 = this.linearLayout;
            int childCount = anonymousClass2.getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = anonymousClass2.getChildAt(i2);
                int i3 = 6;
                int i4 = i2 == 0 ? 6 : 0;
                if (i2 != childCount - 1) {
                    i3 = 0;
                }
                childAt.setBackground(Theme.createRadSelectorDrawable(i, i4, i3));
                i2++;
            }
        }

        public final void startChildAnimation(View view) {
            int i = 1;
            if (this.animationEnabled) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, view.isEnabled() ? 1.0f : 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(this.shownFromBottom ? 6.0f : -6.0f), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.addListener(new EmojiView.AnonymousClass35(this, animatorSet, view, i));
                animatorSet.setInterpolator(ActionBarPopupWindow.decelerateInterpolator);
                animatorSet.start();
                if (this.itemAnimators == null) {
                    this.itemAnimators = new ArrayList();
                }
                this.itemAnimators.add(animatorSet);
            }
        }

        public final void addView(View view, LinearLayout.LayoutParams layoutParams) {
            addView(view, layoutParams);
        }

        public ActionBarPopupWindowLayout(int i, int i2, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.backScaleX = 1.0f;
            this.backScaleY = 1.0f;
            this.startAnimationPending = false;
            this.backAlpha = 255;
            this.lastStartedChild = 0;
            this.animationEnabled = true;
            this.positions = new HashMap();
            this.gapStartY = -1000000;
            this.gapEndY = -1000000;
            Rect rect = new Rect();
            this.bgPaddings = rect;
            this.reactionsEnterProgress = 1.0f;
            this.backgroundColor = -1;
            if (i != 0) {
                this.backgroundDrawable = getResources().getDrawable(i).mutate();
                setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            Drawable drawable = this.backgroundDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
                setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, resourcesProvider));
            }
            setWillNotDraw(false);
            if ((i2 & 2) > 0) {
                this.shownFromBottom = true;
            }
            if ((i2 & 1) > 0) {
                PopupSwipeBackLayout popupSwipeBackLayout = new PopupSwipeBackLayout(context, resourcesProvider);
                this.swipeBackLayout = popupSwipeBackLayout;
                addView(popupSwipeBackLayout, LayoutHelper.createFrame(-2.0f, -2));
            }
            if ((i2 & 4) == 0) {
                try {
                    ScrollView scrollView = new ScrollView(context);
                    this.scrollView = scrollView;
                    scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
                        @Override
                        public final void onScrollChanged() {
                            ActionBarPopupWindowLayout.this.invalidate();
                        }
                    });
                    scrollView.setVerticalScrollBarEnabled(false);
                    PopupSwipeBackLayout popupSwipeBackLayout2 = this.swipeBackLayout;
                    if (popupSwipeBackLayout2 != null) {
                        popupSwipeBackLayout2.addView(scrollView, LayoutHelper.createFrame(-2, -2, this.shownFromBottom ? 80 : 48));
                    } else {
                        addView(scrollView, LayoutHelper.createFrame(-2.0f, -2));
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            ?? r7 = new LinearLayout(context) {
                @Override
                public final boolean drawChild(Canvas canvas, View view, long j) {
                    if (!(view instanceof GapView) || ActionBarPopupWindowLayout.this.backgroundDrawable == null) {
                        return super.drawChild(canvas, view, j);
                    }
                    return false;
                }

                @Override
                public final void onMeasure(int i3, int i4) {
                    AnonymousClass2 anonymousClass2 = this;
                    ActionBarPopupWindowLayout actionBarPopupWindowLayout = ActionBarPopupWindowLayout.this;
                    if (actionBarPopupWindowLayout.fitItems) {
                        actionBarPopupWindowLayout.gapStartY = -1000000;
                        actionBarPopupWindowLayout.gapEndY = -1000000;
                        int childCount = anonymousClass2.getChildCount();
                        ArrayList arrayList = null;
                        int i5 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        while (i5 < childCount) {
                            View childAt = anonymousClass2.getChildAt(i5);
                            if (childAt.getVisibility() != 8) {
                                Object tag = childAt.getTag(R.id.width_tag);
                                Object tag2 = childAt.getTag(R.id.object_tag);
                                Object tag3 = childAt.getTag(R.id.fit_width_tag);
                                if (tag != null) {
                                    childAt.getLayoutParams().width = -2;
                                }
                                anonymousClass2.measureChildWithMargins(childAt, i3, 0, i4, 0);
                                if (tag3 == null) {
                                    boolean z = tag instanceof Integer;
                                    if (z || tag2 != null) {
                                        if (z) {
                                            iMax2 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                            actionBarPopupWindowLayout.gapStartY = childAt.getMeasuredHeight();
                                            actionBarPopupWindowLayout.gapEndY = AndroidUtilities.dp(6.0f) + actionBarPopupWindowLayout.gapStartY;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(childAt);
                                    } else {
                                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                                    }
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(childAt);
                                }
                            }
                            i5++;
                            anonymousClass2 = this;
                        }
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((View) arrayList.get(i6)).getLayoutParams().width = Math.max(iMax, iMax2);
                            }
                        }
                    }
                    super.onMeasure(i3, i4);
                }
            };
            this.linearLayout = r7;
            r7.setOrientation(1);
            ScrollView scrollView2 = this.scrollView;
            if (scrollView2 != 0) {
                scrollView2.addView((View) r7, new FrameLayout.LayoutParams(-2, -2));
                return;
            }
            PopupSwipeBackLayout popupSwipeBackLayout3 = this.swipeBackLayout;
            if (popupSwipeBackLayout3 != 0) {
                popupSwipeBackLayout3.addView((View) r7, LayoutHelper.createFrame(-2, -2, this.shownFromBottom ? 80 : 48));
            } else {
                addView((View) r7, LayoutHelper.createFrame(-2.0f, -2));
            }
        }
    }

    public final class GapView extends FrameLayout {
        public final Drawable shadowDrawable;

        public GapView(Context context, Theme.ResourcesProvider resourcesProvider) {
            this(context, Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Drawable drawable = this.shadowDrawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                drawable.draw(canvas);
            }
        }

        public void setColor(int i) {
            setBackgroundColor(i);
        }

        public GapView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int color = Theme.getColor(i, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_windowBackgroundGrayShadow, resourcesProvider);
            this.shadowDrawable = Theme.getThemedDrawable(getContext(), R.drawable.greydivider, color2);
            setBackgroundColor(color);
        }
    }

    public interface OnDispatchKeyEventListener {
        void onDispatchKeyEvent(KeyEvent keyEvent);
    }

    public interface onSizeChangedListener {
        void onSizeChanged();
    }

    static {
        Field declaredField;
        try {
            declaredField = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            try {
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            declaredField = null;
        }
        superListenerField = declaredField;
        NOP = new ActionBarPopupWindow$$ExternalSyntheticLambda0(0);
    }

    public ActionBarPopupWindow(Context context) {
        super(context);
        this.animationEnabled = true;
        this.dismissAnimationDuration = 150;
        this.outEmptyTime = -1L;
        this.notificationsLocker = new AnimationNotificationsLocker();
        init();
    }

    public static void startAnimation(ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        int i = 3;
        int i2 = 1;
        actionBarPopupWindowLayout.startAnimationPending = true;
        actionBarPopupWindowLayout.setTranslationY(0.0f);
        float f = 1.0f;
        actionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindowLayout.setPivotX(actionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindowLayout.getItemsCount();
        HashMap map = actionBarPopupWindowLayout.positions;
        map.clear();
        int i3 = 0;
        for (int i4 = 0; i4 < itemsCount; i4++) {
            View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(i4);
            if (!(childAt instanceof GapView)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    map.put(childAt, Integer.valueOf(i3));
                    i3++;
                }
            }
        }
        if (actionBarPopupWindowLayout.shownFromBottom) {
            actionBarPopupWindowLayout.lastStartedChild = itemsCount - 1;
        } else {
            actionBarPopupWindowLayout.lastStartedChild = 0;
        }
        if (actionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindowLayout.getSwipeBack().invalidateTransforms(true);
            f = actionBarPopupWindowLayout.backScaleY;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabs$$ExternalSyntheticLambda2(actionBarPopupWindowLayout, i));
        actionBarPopupWindowLayout.updateAnimation = false;
        actionBarPopupWindowLayout.clipChildren = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindowLayout, "backAlpha", 0, 255), valueAnimatorOfFloat);
        animatorSet.setDuration((i3 * 16) + 150);
        animatorSet.addListener(new ActionBar.AnonymousClass7.AnonymousClass1(actionBarPopupWindowLayout, i2));
        animatorSet.start();
    }

    public final void dimBehind(float f) {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    @Override
    public void dismiss() {
        dismiss(true);
    }

    public final void init() {
        View contentView = getContentView();
        if ((contentView instanceof ActionBarPopupWindowLayout) && ((ActionBarPopupWindowLayout) contentView).getSwipeBack() != null) {
            setTouchInterceptor(new PassportActivity$$ExternalSyntheticLambda22(1, this, (ActionBarPopupWindowLayout) contentView));
        }
        Field field = superListenerField;
        if (field != null) {
            try {
                this.mSuperScrollListener = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, NOP);
            } catch (Exception unused) {
                this.mSuperScrollListener = null;
            }
        }
    }

    public final void registerListener(View view) {
        if (this.mSuperScrollListener != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.mViewTreeObserver;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
                }
                this.mViewTreeObserver = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.mSuperScrollListener);
                }
            }
        }
    }

    public final void setLayoutInScreen() {
        try {
            if (layoutInScreenMethod == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                layoutInScreenMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            layoutInScreenMethod.invoke(this, Boolean.TRUE);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void showAsDropDown(View view, int i, int i2) {
        try {
            super.showAsDropDown(view, i, i2);
            registerListener(view);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        unregisterListener();
    }

    public final void unregisterListener() {
        ViewTreeObserver viewTreeObserver;
        if (this.mSuperScrollListener == null || (viewTreeObserver = this.mViewTreeObserver) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.mViewTreeObserver.removeOnScrollChangedListener(this.mSuperScrollListener);
        }
        this.mViewTreeObserver = null;
    }

    @Override
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        registerListener(view);
    }

    public void dismiss(boolean z) {
        ArrayList arrayList;
        int i = 1;
        setFocusable(false);
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i2 = layoutParams.flags;
                if ((i2 & 2) != 0) {
                    layoutParams.flags = i2 & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }
        AnimatorSet animatorSet = this.windowAnimatorSet;
        ActionBarPopupWindowLayout actionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (z && this.isClosingAnimated) {
                return;
            }
            animatorSet.cancel();
            this.windowAnimatorSet = null;
        }
        this.isClosingAnimated = false;
        if (!this.animationEnabled || !z) {
            try {
                super.dismiss();
            } catch (Exception unused2) {
            }
            unregisterListener();
            return;
        }
        this.isClosingAnimated = true;
        ViewGroup viewGroup = (ViewGroup) getContentView();
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            if (viewGroup.getChildAt(i3) instanceof ActionBarPopupWindowLayout) {
                actionBarPopupWindowLayout = (ActionBarPopupWindowLayout) viewGroup.getChildAt(i3);
            }
        }
        if (actionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindowLayout.itemAnimators) != null && !arrayList.isEmpty()) {
            int size = actionBarPopupWindowLayout.itemAnimators.size();
            for (int i4 = 0; i4 < size; i4++) {
                AnimatorSet animatorSet2 = (AnimatorSet) actionBarPopupWindowLayout.itemAnimators.get(i4);
                animatorSet2.removeAllListeners();
                animatorSet2.cancel();
            }
            actionBarPopupWindowLayout.itemAnimators.clear();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.windowAnimatorSet = animatorSet3;
        long j = this.outEmptyTime;
        if (j > 0) {
            animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
            this.windowAnimatorSet.setDuration(j);
        } else if (this.scaleOut) {
            animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
            this.windowAnimatorSet.setDuration(this.dismissAnimationDuration);
        } else {
            animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.TRANSLATION_Y, AndroidUtilities.dp((actionBarPopupWindowLayout == null || !actionBarPopupWindowLayout.shownFromBottom) ? -5.0f : 5.0f)), ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f));
            this.windowAnimatorSet.setDuration(this.dismissAnimationDuration);
        }
        this.windowAnimatorSet.addListener(new AnonymousClass2(this, i));
        if (this.pauseNotifications) {
            this.notificationsLocker.lock();
        }
        this.windowAnimatorSet.start();
    }

    @Override
    public final void update(View view, int i, int i2) {
        super.update(view, i, i2);
        registerListener(view);
    }

    public ActionBarPopupWindow(View view) {
        super(view, -2, -2);
        this.animationEnabled = true;
        this.dismissAnimationDuration = 150;
        this.outEmptyTime = -1L;
        this.notificationsLocker = new AnimationNotificationsLocker();
        init();
    }

    public final void startAnimation() {
        ActionBarPopupWindowLayout actionBarPopupWindowLayout;
        int i = 0;
        if (this.animationEnabled && this.windowAnimatorSet == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindowLayout) {
                actionBarPopupWindowLayout = (ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindowLayout.startAnimationPending = true;
            } else {
                ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = null;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    if (viewGroup.getChildAt(i2) instanceof ActionBarPopupWindowLayout) {
                        actionBarPopupWindowLayout2 = (ActionBarPopupWindowLayout) viewGroup.getChildAt(i2);
                        actionBarPopupWindowLayout2.startAnimationPending = true;
                    }
                }
                actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            }
            actionBarPopupWindowLayout.setTranslationY(0.0f);
            float f = 1.0f;
            actionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindowLayout.setPivotX(actionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindowLayout.getItemsCount();
            HashMap map = actionBarPopupWindowLayout.positions;
            map.clear();
            int i3 = 0;
            for (int i4 = 0; i4 < itemsCount; i4++) {
                View childAt = actionBarPopupWindowLayout.linearLayout.getChildAt(i4);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    map.put(childAt, Integer.valueOf(i3));
                    i3++;
                }
            }
            if (actionBarPopupWindowLayout.shownFromBottom) {
                actionBarPopupWindowLayout.lastStartedChild = itemsCount - 1;
            } else {
                actionBarPopupWindowLayout.lastStartedChild = 0;
            }
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().invalidateTransforms(true);
                f = actionBarPopupWindowLayout.backScaleY;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.windowAnimatorSet = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.windowAnimatorSet.setDuration((i3 * 16) + 150);
            this.windowAnimatorSet.addListener(new AnonymousClass2(this, i));
            this.windowAnimatorSet.start();
        }
    }
}
