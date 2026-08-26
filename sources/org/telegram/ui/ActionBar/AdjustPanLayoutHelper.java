package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity$2$1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public abstract class AdjustPanLayoutHelper {
    public static final CubicBezierInterpolator keyboardInterpolator = ChatListItemAnimator.DEFAULT_INTERPOLATOR;
    public boolean animationInProgress;
    public ValueAnimator animator;
    public ViewGroup contentView;
    public float from;
    public boolean ignoreOnce;
    public boolean inverse;
    public boolean isKeyboardVisible;
    public boolean needDelay;
    public final FrameLayout parent;
    public View parentForListener;
    public View resizableView;
    public FrameLayout resizableViewToSet;
    public float to;
    public final BottomSheet.AnonymousClass4 delayedAnimationRunnable = new BottomSheet.AnonymousClass4(this, 2);
    public int previousHeight = -1;
    public int previousContentHeight = -1;
    public int previousStartOffset = -1;
    public final AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    public final ArrayList viewsToHeightSet = new ArrayList();
    public final AnonymousClass2 onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
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
                }
                return true;
            }
            if (!adjustPanLayoutHelper.heightAnimationEnabled() || Math.abs(adjustPanLayoutHelper.previousHeight - height) < AndroidUtilities.dp(20.0f)) {
                adjustPanLayoutHelper.previousHeight = height;
                adjustPanLayoutHelper.previousContentHeight = adjustPanLayoutHelper.contentView.getHeight();
                adjustPanLayoutHelper.previousStartOffset = adjustPanLayoutHelper.startOffset();
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
            int i2 = adjustPanLayoutHelper.previousHeight;
            if (adjustPanLayoutHelper.ignoreOnce) {
                adjustPanLayoutHelper.ignoreOnce = false;
            } else if (adjustPanLayoutHelper.enabled) {
                ValueAnimator valueAnimator = adjustPanLayoutHelper.animator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                int iStartOffset2 = adjustPanLayoutHelper.startOffset();
                ArrayList arrayList = adjustPanLayoutHelper.viewsToHeightSet;
                arrayList.clear();
                FrameLayout frameLayout = adjustPanLayoutHelper.parent;
                View view = frameLayout;
                while (view != null) {
                    arrayList.add(view);
                    if (view == adjustPanLayoutHelper.resizableView) {
                        break;
                    }
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                LaunchActivity launchActivity = LaunchActivity.instance;
                int expandedHeight = (launchActivity == null || launchActivity.getBottomSheetTabs() == null) ? 0 : LaunchActivity.instance.getBottomSheetTabs().getExpandedHeight();
                boolean z2 = adjustPanLayoutHelper instanceof ChatCustomReactionsEditActivity$2$1;
                if (!z2) {
                    int iMax = Math.max(i2, height + expandedHeight);
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((View) arrayList.get(i3)).getLayoutParams().height = iMax;
                        ((View) arrayList.get(i3)).requestLayout();
                    }
                }
                adjustPanLayoutHelper.resizableView.requestLayout();
                adjustPanLayoutHelper.onTransitionStart(height, z);
                float f = height - i2;
                Math.abs(f);
                adjustPanLayoutHelper.animationInProgress = true;
                if (height > i2) {
                    float f2 = f - iStartOffset2;
                    if (!z2) {
                        frameLayout.setTranslationY(-f2);
                    }
                    adjustPanLayoutHelper.onPanTranslationUpdate(f2, 1.0f, z);
                    adjustPanLayoutHelper.from = -f2;
                    adjustPanLayoutHelper.to = -expandedHeight;
                    adjustPanLayoutHelper.inverse = true;
                } else {
                    if (!z2) {
                        frameLayout.setTranslationY(adjustPanLayoutHelper.previousStartOffset);
                    }
                    adjustPanLayoutHelper.onPanTranslationUpdate(-adjustPanLayoutHelper.previousStartOffset, 0.0f, z);
                    adjustPanLayoutHelper.to = -adjustPanLayoutHelper.previousStartOffset;
                    adjustPanLayoutHelper.from = f;
                    adjustPanLayoutHelper.inverse = false;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                adjustPanLayoutHelper.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new BottomSheetTabs$$ExternalSyntheticLambda2(adjustPanLayoutHelper, 4));
                adjustPanLayoutHelper.animator.addListener(new ActionBar.AnonymousClass7.AnonymousClass1(adjustPanLayoutHelper, 2));
                adjustPanLayoutHelper.animator.setDuration(250L);
                adjustPanLayoutHelper.animator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                adjustPanLayoutHelper.notificationsLocker.lock();
                if (adjustPanLayoutHelper.needDelay) {
                    adjustPanLayoutHelper.needDelay = false;
                    SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(adjustPanLayoutHelper.delayedAnimationRunnable, 100L);
                } else {
                    adjustPanLayoutHelper.animator.start();
                }
            }
            adjustPanLayoutHelper.previousHeight = height;
            adjustPanLayoutHelper.previousContentHeight = adjustPanLayoutHelper.contentView.getHeight();
            adjustPanLayoutHelper.previousStartOffset = adjustPanLayoutHelper.startOffset();
            return false;
        }
    };
    public final boolean enabled = true;

    public AdjustPanLayoutHelper(FrameLayout frameLayout) {
        this.parent = frameLayout;
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

    public abstract boolean heightAnimationEnabled();

    public final void onAttach() {
        onDetach();
        View view = this.parent;
        Activity activity = getActivity(view.getContext());
        if (activity != null) {
            this.contentView = (ViewGroup) ((ViewGroup) activity.getWindow().getDecorView()).findViewById(16908290);
        }
        View view2 = this.resizableViewToSet;
        if (view2 == null) {
            while (true) {
                if (view != null) {
                    if (view.getParent() instanceof DrawerLayoutContainer) {
                        view2 = view;
                        break;
                    } else if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
                view2 = null;
                break;
            }
        }
        this.resizableView = view2;
        if (view2 != null) {
            this.parentForListener = view2;
            view2.getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
        }
    }

    public final void onDetach() {
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

    public abstract void onPanTranslationUpdate(float f, float f2, boolean z);

    public abstract void onTransitionEnd();

    public abstract void onTransitionStart(int i, boolean z);

    public int startOffset() {
        return 0;
    }

    public final void stopTransition() {
        ArrayList arrayList;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i = 0;
        this.animationInProgress = false;
        this.notificationsLocker.unlock();
        this.animator = null;
        while (true) {
            arrayList = this.viewsToHeightSet;
            if (i >= arrayList.size()) {
                break;
            }
            ((View) arrayList.get(i)).getLayoutParams().height = -1;
            ((View) arrayList.get(i)).requestLayout();
            i++;
        }
        arrayList.clear();
        this.resizableView.requestLayout();
        boolean z = this.isKeyboardVisible;
        onPanTranslationUpdate(0.0f, z ? 1.0f : 0.0f, z);
        if (!(this instanceof ChatCustomReactionsEditActivity$2$1)) {
            this.parent.setTranslationY(0.0f);
        }
        onTransitionEnd();
    }
}
