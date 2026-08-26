package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat$Impl30$$ExternalSyntheticApiModelOutline0;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public abstract class AdjustPanLayoutHelper {
    public static boolean USE_ANDROID11_INSET_ANIMATOR = false;
    public static final long keyboardDuration = 250;
    public static final Interpolator keyboardInterpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
    private boolean animationInProgress;
    ValueAnimator animator;
    boolean checkHierarchyHeight;
    private ViewGroup contentView;
    float from;
    private boolean ignoreOnce;
    boolean inverse;
    boolean isKeyboardVisible;
    protected float keyboardSize;
    private boolean needDelay;
    private final View parent;
    View parentForListener;
    private View resizableView;
    private View resizableViewToSet;
    public boolean showingKeyboard;
    long startAfter;
    float to;
    private boolean useInsetsAnimator;
    private boolean usingInsetAnimator = false;
    private Runnable delayedAnimationRunnable = new BottomSheet.AnonymousClass4(this, 1);
    int previousHeight = -1;
    int previousContentHeight = -1;
    int previousStartOffset = -1;
    AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    ArrayList<View> viewsToHeightSet = new ArrayList<>();
    ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
        @Override
        public final boolean onPreDraw() {
            AdjustPanLayoutHelper adjustPanLayoutHelper = AdjustPanLayoutHelper.this;
            int height = adjustPanLayoutHelper.parent.getHeight();
            int iStartOffset = height - adjustPanLayoutHelper.startOffset();
            int i = adjustPanLayoutHelper.previousHeight;
            if (iStartOffset == i - adjustPanLayoutHelper.previousStartOffset || height == i || adjustPanLayoutHelper.animator != null) {
                if (adjustPanLayoutHelper.animator == null) {
                    adjustPanLayoutHelper.previousHeight = height;
                    adjustPanLayoutHelper.previousContentHeight = adjustPanLayoutHelper.contentView.getHeight();
                    adjustPanLayoutHelper.previousStartOffset = adjustPanLayoutHelper.startOffset();
                    adjustPanLayoutHelper.usingInsetAnimator = false;
                }
                return true;
            }
            if (!adjustPanLayoutHelper.heightAnimationEnabled() || Math.abs(adjustPanLayoutHelper.previousHeight - height) < AndroidUtilities.dp(20.0f)) {
                adjustPanLayoutHelper.previousHeight = height;
                adjustPanLayoutHelper.previousContentHeight = adjustPanLayoutHelper.contentView.getHeight();
                adjustPanLayoutHelper.previousStartOffset = adjustPanLayoutHelper.startOffset();
                adjustPanLayoutHelper.usingInsetAnimator = false;
                return true;
            }
            if (adjustPanLayoutHelper.previousHeight == -1 || adjustPanLayoutHelper.previousContentHeight != adjustPanLayoutHelper.contentView.getHeight()) {
                adjustPanLayoutHelper.previousHeight = height;
                adjustPanLayoutHelper.previousContentHeight = adjustPanLayoutHelper.contentView.getHeight();
                adjustPanLayoutHelper.previousStartOffset = adjustPanLayoutHelper.startOffset();
                return false;
            }
            boolean z = height < adjustPanLayoutHelper.contentView.getBottom();
            adjustPanLayoutHelper.isKeyboardVisible = z;
            adjustPanLayoutHelper.animateHeight(adjustPanLayoutHelper.previousHeight, height, z);
            adjustPanLayoutHelper.previousHeight = height;
            adjustPanLayoutHelper.previousContentHeight = adjustPanLayoutHelper.contentView.getHeight();
            adjustPanLayoutHelper.previousStartOffset = adjustPanLayoutHelper.startOffset();
            return false;
        }
    };
    private boolean enabled = true;

    public AdjustPanLayoutHelper(View view, boolean z) {
        this.useInsetsAnimator = z;
        this.parent = view;
        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(this, 5));
    }

    public static Activity getActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return getActivity(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public void OnPanTranslationUpdate(float f, float f2, boolean z) {
        onPanTranslationUpdate(f, f2, z);
    }

    public void OnTransitionEnd() {
        onTransitionEnd();
    }

    public void OnTransitionStart(boolean z, int i) {
        onTransitionStart(z, i);
    }

    public final void animateHeight(int i, int i2, boolean z) {
        if (this.ignoreOnce) {
            this.ignoreOnce = false;
            return;
        }
        if (this.enabled) {
            startTransition(i, i2, z);
            this.animator.addUpdateListener(new BottomSheetTabs$$ExternalSyntheticLambda2(this, 3));
            this.animator.addListener(new ActionBar.AnonymousClass7.AnonymousClass1(this, 2));
            this.animator.setDuration(250L);
            this.animator.setInterpolator(keyboardInterpolator);
            this.notificationsLocker.lock();
            if (!this.needDelay) {
                this.animator.start();
                this.startAfter = -1L;
            } else {
                this.needDelay = false;
                this.startAfter = SystemClock.elapsedRealtime() + 100;
                AndroidUtilities.runOnUIThread(this.delayedAnimationRunnable, 100L);
            }
        }
    }

    public boolean animationInProgress() {
        return this.animationInProgress;
    }

    public boolean applyTranslation() {
        return true;
    }

    public void delayAnimation() {
        this.needDelay = true;
    }

    public View getAdjustingContentView() {
        return this.contentView;
    }

    public View getAdjustingParent() {
        return this.parent;
    }

    public void getViewsToSetHeight(View view) {
        this.viewsToHeightSet.clear();
        while (view != null) {
            this.viewsToHeightSet.add(view);
            if (view == this.resizableView) {
                return;
            } else {
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
        }
    }

    public abstract boolean heightAnimationEnabled();

    public void ignoreOnce() {
        this.ignoreOnce = true;
    }

    public final void lambda$animateHeight$0(ValueAnimator valueAnimator) {
        if (this.usingInsetAnimator) {
            return;
        }
        updateTransition(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void onAttach() {
        View view;
        onDetach();
        Activity activity = getActivity(this.parent.getContext());
        if (activity != null) {
            this.contentView = (ViewGroup) ((ViewGroup) activity.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.parent;
        View view3 = this.resizableViewToSet;
        if (view3 == null) {
            while (true) {
                if (view2 != null) {
                    if (view2.getParent() instanceof DrawerLayoutContainer) {
                        view3 = view2;
                        break;
                    } else if (view2.getParent() instanceof View) {
                        view2 = (View) view2.getParent();
                    }
                }
                view3 = null;
                break;
            }
        }
        this.resizableView = view3;
        if (view3 != null) {
            this.parentForListener = view3;
            view3.getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
        }
        if (!this.useInsetsAnimator || Build.VERSION.SDK_INT < 30 || (view = this.resizableView) == null) {
            return;
        }
        view.setWindowInsetsAnimationCallback(new WindowInsetsAnimation.Callback() {
            @Override
            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                if (!AdjustPanLayoutHelper.this.animationInProgress || AndroidUtilities.screenRefreshRate < 90.0f) {
                    return;
                }
                AdjustPanLayoutHelper.this.stopTransition();
            }

            @Override
            public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                WindowInsetsAnimation windowInsetsAnimationM;
                if (AdjustPanLayoutHelper.this.animationInProgress && AndroidUtilities.screenRefreshRate >= 90.0f) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            windowInsetsAnimationM = null;
                            break;
                        }
                        windowInsetsAnimationM = WindowInsetsCompat$Impl30$$ExternalSyntheticApiModelOutline0.m(it.next());
                    } while ((windowInsetsAnimationM.getTypeMask() & 8) == 0);
                    if (windowInsetsAnimationM != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        AdjustPanLayoutHelper adjustPanLayoutHelper = AdjustPanLayoutHelper.this;
                        if (jElapsedRealtime >= adjustPanLayoutHelper.startAfter) {
                            adjustPanLayoutHelper.usingInsetAnimator = true;
                            AdjustPanLayoutHelper.this.updateTransition(windowInsetsAnimationM.getInterpolatedFraction());
                        }
                    }
                }
                return windowInsets;
            }
        });
    }

    public void onDetach() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.parentForListener;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
            this.parentForListener = null;
        }
        View view2 = this.parent;
        if (view2 == null || !this.useInsetsAnimator || Build.VERSION.SDK_INT < 30) {
            return;
        }
        view2.setWindowInsetsAnimationCallback(null);
    }

    public abstract void onPanTranslationUpdate(float f, float f2, boolean z);

    public abstract void onTransitionEnd();

    public abstract void onTransitionStart(boolean z, int i);

    public void onTransitionStart(boolean z, int i, int i2) {
        onTransitionStart(z, i2);
    }

    public void runDelayedAnimation() {
        AndroidUtilities.cancelRunOnUIThread(this.delayedAnimationRunnable);
        this.delayedAnimationRunnable.run();
    }

    public void setCheckHierarchyHeight(boolean z) {
        this.checkHierarchyHeight = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setResizableView(FrameLayout frameLayout) {
        this.resizableViewToSet = frameLayout;
    }

    public void setViewHeight(int i) {
        for (int i2 = 0; i2 < this.viewsToHeightSet.size(); i2++) {
            this.viewsToHeightSet.get(i2).getLayoutParams().height = i;
            this.viewsToHeightSet.get(i2).requestLayout();
        }
    }

    public int startOffset() {
        return 0;
    }

    public void startTransition(int i, int i2, boolean z) {
        int height;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int iStartOffset = startOffset();
        getViewsToSetHeight(this.parent);
        if (this.checkHierarchyHeight) {
            Object parent = this.parent.getParent();
            if (parent instanceof View) {
                height = ((View) parent).getHeight() - i2;
            } else {
                height = 0;
            }
        } else {
            height = 0;
        }
        LaunchActivity launchActivity = LaunchActivity.instance;
        int expandedHeight = (launchActivity == null || launchActivity.getBottomSheetTabs() == null) ? 0 : LaunchActivity.instance.getBottomSheetTabs().getExpandedHeight();
        if (applyTranslation()) {
            setViewHeight(Math.max(i, height + i2 + expandedHeight));
        }
        this.resizableView.requestLayout();
        onTransitionStart(z, i, i2);
        float f = i2 - i;
        this.keyboardSize = Math.abs(f);
        this.animationInProgress = true;
        this.showingKeyboard = i2 <= i;
        if (i2 > i) {
            float f2 = f - iStartOffset;
            if (applyTranslation()) {
                this.parent.setTranslationY(-f2);
            }
            onPanTranslationUpdate(f2, 1.0f, z);
            this.from = -f2;
            this.to = -expandedHeight;
            this.inverse = true;
        } else {
            if (applyTranslation()) {
                this.parent.setTranslationY(this.previousStartOffset);
            }
            onPanTranslationUpdate(-this.previousStartOffset, 0.0f, z);
            this.to = -this.previousStartOffset;
            this.from = f;
            this.inverse = false;
        }
        this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.usingInsetAnimator = false;
    }

    public void stopTransition() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animationInProgress = false;
        this.usingInsetAnimator = false;
        this.notificationsLocker.unlock();
        this.animator = null;
        setViewHeight(-1);
        this.viewsToHeightSet.clear();
        this.resizableView.requestLayout();
        boolean z = this.isKeyboardVisible;
        onPanTranslationUpdate(0.0f, z ? 1.0f : 0.0f, z);
        if (applyTranslation()) {
            this.parent.setTranslationY(0.0f);
        }
        onTransitionEnd();
    }

    public void updateTransition(float f) {
        if (this.inverse) {
            f = 1.0f - f;
        }
        float fM = (int) DiffUtil.m(1.0f, f, this.to, this.from * f);
        if (applyTranslation()) {
            this.parent.setTranslationY(fM);
        }
        onPanTranslationUpdate(-fM, f, this.isKeyboardVisible);
    }

    public void stopTransition(float f, boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animationInProgress = false;
        this.notificationsLocker.unlock();
        this.animator = null;
        setViewHeight(-1);
        this.viewsToHeightSet.clear();
        this.resizableView.requestLayout();
        this.isKeyboardVisible = z;
        onPanTranslationUpdate(0.0f, f, z);
        if (applyTranslation()) {
            this.parent.setTranslationY(0.0f);
        }
        onTransitionEnd();
    }
}
