package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class b3 extends AnimatorListenerAdapter {
    public final int f18754a;
    public final c3 f18755b;

    public b3(c3 c3Var, int i10) {
        this.f18754a = i10;
        this.f18755b = c3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f18754a;
        c3 c3Var = this.f18755b;
        switch (i10) {
            case 0:
                c3Var.f18782y = 0.0f;
                c3Var.G.containerView.setTranslationX(0.0f);
                c3Var.G.container.invalidate();
                return;
            case 1:
                c3Var.G.skipDismissAnimation = true;
                c3Var.G.containerView.setTranslationX(c3Var.getMeasuredWidth());
                c3Var.G.dismiss();
                c3Var.G.container.invalidate();
                return;
            case 2:
                c3Var.G.containerView.setTranslationY(0.0f);
                c3Var.G.onContainerViewTranslation();
                e3 e3Var = c3Var.G;
                e3Var.onSmoothContainerViewLayout(e3Var.containerView.getTranslationY());
                c3Var.invalidate();
                return;
            default:
                AnimatorSet animatorSet = c3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    c3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
