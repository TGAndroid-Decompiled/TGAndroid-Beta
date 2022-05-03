package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.ChatListItemAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public class AdjustPanLayoutHelper {
    public static final Interpolator keyboardInterpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
    private boolean animationInProgress;
    ValueAnimator animator;
    boolean checkHierarchyHeight;
    private ViewGroup contentView;
    protected float keyboardSize;
    private boolean needDelay;
    int notificationsIndex;
    private final View parent;
    View parentForListener;
    private View resizableView;
    private View resizableViewToSet;
    private Runnable delayedAnimationRunnable = new Runnable() {
        @Override
        public void run() {
            ValueAnimator valueAnimator = AdjustPanLayoutHelper.this.animator;
            if (valueAnimator != null && !valueAnimator.isRunning()) {
                AdjustPanLayoutHelper.this.animator.start();
            }
        }
    };
    int previousHeight = -1;
    int previousContentHeight = -1;
    int previousStartOffset = -1;
    ArrayList<View> viewsToHeightSet = new ArrayList<>();
    ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
        @Override
        public boolean onPreDraw() {
            boolean z = true;
            if (!SharedConfig.smoothKeyboard) {
                AdjustPanLayoutHelper.this.onDetach();
                return true;
            }
            int height = AdjustPanLayoutHelper.this.parent.getHeight();
            int startOffset = height - AdjustPanLayoutHelper.this.startOffset();
            AdjustPanLayoutHelper adjustPanLayoutHelper = AdjustPanLayoutHelper.this;
            int i = adjustPanLayoutHelper.previousHeight;
            if (startOffset == i - adjustPanLayoutHelper.previousStartOffset || height == i || adjustPanLayoutHelper.animator != null) {
                if (adjustPanLayoutHelper.animator == null) {
                    adjustPanLayoutHelper.previousHeight = height;
                    adjustPanLayoutHelper.previousContentHeight = adjustPanLayoutHelper.contentView.getHeight();
                    AdjustPanLayoutHelper adjustPanLayoutHelper2 = AdjustPanLayoutHelper.this;
                    adjustPanLayoutHelper2.previousStartOffset = adjustPanLayoutHelper2.startOffset();
                }
                return true;
            } else if (!adjustPanLayoutHelper.heightAnimationEnabled() || Math.abs(AdjustPanLayoutHelper.this.previousHeight - height) < AndroidUtilities.dp(20.0f)) {
                AdjustPanLayoutHelper adjustPanLayoutHelper3 = AdjustPanLayoutHelper.this;
                adjustPanLayoutHelper3.previousHeight = height;
                adjustPanLayoutHelper3.previousContentHeight = adjustPanLayoutHelper3.contentView.getHeight();
                AdjustPanLayoutHelper adjustPanLayoutHelper4 = AdjustPanLayoutHelper.this;
                adjustPanLayoutHelper4.previousStartOffset = adjustPanLayoutHelper4.startOffset();
                return true;
            } else {
                AdjustPanLayoutHelper adjustPanLayoutHelper5 = AdjustPanLayoutHelper.this;
                if (adjustPanLayoutHelper5.previousHeight == -1 || adjustPanLayoutHelper5.previousContentHeight != adjustPanLayoutHelper5.contentView.getHeight()) {
                    AdjustPanLayoutHelper adjustPanLayoutHelper6 = AdjustPanLayoutHelper.this;
                    adjustPanLayoutHelper6.previousHeight = height;
                    adjustPanLayoutHelper6.previousContentHeight = adjustPanLayoutHelper6.contentView.getHeight();
                    AdjustPanLayoutHelper adjustPanLayoutHelper7 = AdjustPanLayoutHelper.this;
                    adjustPanLayoutHelper7.previousStartOffset = adjustPanLayoutHelper7.startOffset();
                    return false;
                }
                if (height >= AdjustPanLayoutHelper.this.contentView.getBottom()) {
                    z = false;
                }
                AdjustPanLayoutHelper adjustPanLayoutHelper8 = AdjustPanLayoutHelper.this;
                adjustPanLayoutHelper8.animateHeight(adjustPanLayoutHelper8.previousHeight, height, z);
                AdjustPanLayoutHelper adjustPanLayoutHelper9 = AdjustPanLayoutHelper.this;
                adjustPanLayoutHelper9.previousHeight = height;
                adjustPanLayoutHelper9.previousContentHeight = adjustPanLayoutHelper9.contentView.getHeight();
                AdjustPanLayoutHelper adjustPanLayoutHelper10 = AdjustPanLayoutHelper.this;
                adjustPanLayoutHelper10.previousStartOffset = adjustPanLayoutHelper10.startOffset();
                return false;
            }
        }
    };

    protected boolean heightAnimationEnabled() {
        throw null;
    }

    public void onPanTranslationUpdate(float f, float f2, boolean z) {
    }

    public void onTransitionEnd() {
    }

    public void onTransitionStart(boolean z, int i) {
    }

    protected int startOffset() {
        return 0;
    }

    public void animateHeight(int r6, int r7, final boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.AdjustPanLayoutHelper.animateHeight(int, int, boolean):void");
    }

    public void lambda$animateHeight$0(float f, float f2, boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f3 = (int) ((f * floatValue) + (f2 * (1.0f - floatValue)));
        this.parent.setTranslationY(f3);
        onPanTranslationUpdate(-f3, floatValue, z);
    }

    public void setViewHeight(int i) {
        for (int i2 = 0; i2 < this.viewsToHeightSet.size(); i2++) {
            this.viewsToHeightSet.get(i2).getLayoutParams().height = i;
            this.viewsToHeightSet.get(i2).requestLayout();
        }
    }

    private void getViewsToSetHeight(View view) {
        this.viewsToHeightSet.clear();
        while (view != null) {
            this.viewsToHeightSet.add(view);
            if (view != this.resizableView) {
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            } else {
                return;
            }
        }
    }

    public AdjustPanLayoutHelper(View view) {
        this.parent = view;
        onAttach();
    }

    public void onAttach() {
        if (SharedConfig.smoothKeyboard) {
            onDetach();
            Activity activity = getActivity(this.parent.getContext());
            if (activity != null) {
                this.contentView = (ViewGroup) ((ViewGroup) activity.getWindow().getDecorView()).findViewById(16908290);
            }
            View findResizableView = findResizableView(this.parent);
            this.resizableView = findResizableView;
            if (findResizableView != null) {
                this.parentForListener = findResizableView;
                findResizableView.getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
            }
        }
    }

    private Activity getActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            return getActivity(((ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    private View findResizableView(View view) {
        View view2 = this.resizableViewToSet;
        if (view2 != null) {
            return view2;
        }
        while (view != null) {
            if (!(view.getParent() instanceof DrawerLayoutContainer)) {
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
            } else {
                return view;
            }
        }
        return null;
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
    }

    public void setResizableView(FrameLayout frameLayout) {
        this.resizableViewToSet = frameLayout;
    }

    public boolean animationInProgress() {
        return this.animationInProgress;
    }

    public void setCheckHierarchyHeight(boolean z) {
        this.checkHierarchyHeight = z;
    }

    public void delayAnimation() {
        this.needDelay = true;
    }

    public void runDelayedAnimation() {
        AndroidUtilities.cancelRunOnUIThread(this.delayedAnimationRunnable);
        this.delayedAnimationRunnable.run();
    }
}
