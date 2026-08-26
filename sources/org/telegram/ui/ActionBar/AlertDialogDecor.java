package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;

public final class AlertDialogDecor extends AlertDialog {
    public static final int[] ATTRS = {16842932, 16842933};
    public ViewGroup contentView;
    public View dimView;
    public boolean isDismissed;
    public DialogInterface.OnDismissListener onDismissListener;
    public DialogInterface.OnShowListener onShowListener;
    public long openDelay;
    public int resEnterAnimation;
    public int resExitAnimation;
    public FrameLayout rootView;
    public final Theme$$ExternalSyntheticLambda8 showRunnable;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final AlertDialogDecor this$0;

        public AnonymousClass1(AlertDialogDecor alertDialogDecor, int i) {
            this.$r8$classId = i;
            this.this$0 = alertDialogDecor;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    AlertDialogDecor alertDialogDecor = this.this$0;
                    DialogInterface.OnShowListener onShowListener = alertDialogDecor.onShowListener;
                    if (onShowListener != null) {
                        onShowListener.onShow(alertDialogDecor);
                    }
                    break;
                default:
                    AlertDialogDecor alertDialogDecor2 = this.this$0;
                    ((ViewGroup) AlertDialogDecor.getActivity(alertDialogDecor2.getContext()).getWindow().getDecorView()).removeView(alertDialogDecor2.rootView);
                    DialogInterface.OnDismissListener onDismissListener = alertDialogDecor2.onDismissListener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(alertDialogDecor2);
                    }
                    break;
            }
        }
    }

    public final class Builder extends AlertDialog.Builder {
        @Override
        public final AlertDialog createAlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            return new AlertDialogDecor(context, i, resourcesProvider);
        }
    }

    public AlertDialogDecor(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, i, resourcesProvider);
        this.isDismissed = false;
        this.openDelay = 0L;
        this.showRunnable = new Theme$$ExternalSyntheticLambda8(this, 8);
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

    @Override
    public final void dismiss() {
        if (isShowing() && !this.isDismissed) {
            this.isDismissed = true;
            AndroidUtilities.cancelRunOnUIThread(this.showRunnable);
            if (this.rootView.getVisibility() != 0) {
                ((ViewGroup) getActivity(getContext()).getWindow().getDecorView()).removeView(this.rootView);
                return;
            }
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), this.resExitAnimation);
            animationLoadAnimation.setAnimationListener(new AnonymousClass2(this, 0));
            this.contentView.clearAnimation();
            this.contentView.startAnimation(animationLoadAnimation);
            this.dimView.animate().setListener(null).cancel();
            this.dimView.animate().setDuration(300L).alpha(0.0f).setListener(new AnonymousClass1(this, 1)).start();
        }
    }

    @Override
    public final boolean isShowing() {
        return (((ViewGroup) getActivity(getContext()).getWindow().getDecorView()).indexOfChild(this.rootView) == -1 || this.isDismissed) ? false : true;
    }

    @Override
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    @Override
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.onShowListener = onShowListener;
    }

    @Override
    public final void show() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16842926, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(typedValue.resourceId, ATTRS);
        this.resEnterAnimation = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        this.resExitAnimation = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        this.dismissDialogByButtons = true;
        ViewGroup viewGroupInflateContent = inflateContent(false);
        this.contentView = viewGroupInflateContent;
        viewGroupInflateContent.setClickable(true);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda7(this, 2));
        View view = new View(getContext());
        this.dimView = view;
        view.setBackgroundColor(Theme.multAlpha(attributes.dimAmount, -16777216));
        frameLayout.addView(this.dimView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(this.contentView, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(attributes.width, -2, 17));
        this.rootView = frameLayout;
        ((ViewGroup) getActivity(getContext()).getWindow().getDecorView()).addView(this.rootView);
        FrameLayout frameLayout3 = this.rootView;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api20Impl.requestApplyInsets(frameLayout3);
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this.rootView, new AlertDialog$$ExternalSyntheticLambda11(frameLayout2, 4));
        this.rootView.setVisibility(4);
        long j = this.openDelay;
        Theme$$ExternalSyntheticLambda8 theme$$ExternalSyntheticLambda8 = this.showRunnable;
        if (j == 0) {
            theme$$ExternalSyntheticLambda8.run();
        } else {
            AndroidUtilities.runOnUIThread(theme$$ExternalSyntheticLambda8, j);
        }
    }

    @Override
    public final void showDelayed(long j) {
        if (isShowing()) {
            return;
        }
        this.openDelay = j;
        show();
    }

    public final class AnonymousClass2 implements Animation.AnimationListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onAnimationEnd(Animation animation) {
            switch (this.$r8$classId) {
                case 0:
                    ((AlertDialogDecor) this.this$0).contentView.setAlpha(0.0f);
                    break;
                default:
                    ((FloatingToolbar.FloatingToolbarPopup) this.this$0).mContentContainer.post(new Theme$$ExternalSyntheticLambda8(this, 13));
                    break;
            }
        }

        @Override
        public final void onAnimationRepeat(Animation animation) {
            int i = this.$r8$classId;
        }

        @Override
        public final void onAnimationStart(Animation animation) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    FloatingToolbar.FloatingToolbarPopup floatingToolbarPopup = (FloatingToolbar.FloatingToolbarPopup) this.this$0;
                    floatingToolbarPopup.mOverflowButton.setEnabled(false);
                    floatingToolbarPopup.mMainPanel.setVisibility(0);
                    floatingToolbarPopup.mOverflowPanel.setVisibility(0);
                    break;
            }
        }

        private final void onAnimationRepeat$org$telegram$ui$ActionBar$AlertDialogDecor$2(Animation animation) {
        }

        private final void onAnimationRepeat$org$telegram$ui$ActionBar$FloatingToolbar$FloatingToolbarPopup$14(Animation animation) {
        }

        private final void onAnimationStart$org$telegram$ui$ActionBar$AlertDialogDecor$2(Animation animation) {
        }
    }
}
