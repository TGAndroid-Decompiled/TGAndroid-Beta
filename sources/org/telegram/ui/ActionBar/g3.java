package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class g3 extends AnimatorListenerAdapter {
    public final int f22646a;
    public final h3 f22647b;

    public g3(h3 h3Var, int i10) {
        this.f22646a = i10;
        this.f22647b = h3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22646a;
        h3 h3Var = this.f22647b;
        switch (i10) {
            case 0:
                h3Var.f22679y = 0.0f;
                h3Var.G.containerView.setTranslationX(0.0f);
                h3Var.G.container.invalidate();
                return;
            case 1:
                h3Var.G.skipDismissAnimation = true;
                h3Var.G.containerView.setTranslationX(h3Var.getMeasuredWidth());
                h3Var.G.dismiss();
                h3Var.G.container.invalidate();
                return;
            case 2:
                h3Var.G.containerView.setTranslationY(0.0f);
                h3Var.G.onContainerViewTranslation();
                k3 k3Var = h3Var.G;
                k3Var.onSmoothContainerViewLayout(k3Var.containerView.getTranslationY());
                h3Var.invalidate();
                return;
            default:
                AnimatorSet animatorSet = h3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
