package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class e3 extends AnimatorListenerAdapter {
    public final int f21310a;
    public final f3 f21311b;

    public e3(f3 f3Var, int i10) {
        this.f21310a = i10;
        this.f21311b = f3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f21310a;
        f3 f3Var = this.f21311b;
        switch (i10) {
            case 0:
                f3Var.f21359y = 0.0f;
                f3Var.D.containerView.setTranslationX(0.0f);
                f3Var.D.container.invalidate();
                return;
            case 1:
                f3Var.D.skipDismissAnimation = true;
                f3Var.D.containerView.setTranslationX(f3Var.getMeasuredWidth());
                f3Var.D.dismiss();
                f3Var.D.container.invalidate();
                return;
            case 2:
                f3Var.D.containerView.setTranslationY(0.0f);
                f3Var.D.onContainerViewTranslation();
                h3 h3Var = f3Var.D;
                h3Var.onSmoothContainerViewLayout(h3Var.containerView.getTranslationY());
                f3Var.invalidate();
                return;
            default:
                AnimatorSet animatorSet = f3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
