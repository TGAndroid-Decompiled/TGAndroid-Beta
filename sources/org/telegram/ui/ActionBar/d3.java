package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class d3 extends AnimatorListenerAdapter {
    public final int f18572a;
    public final e3 f18573b;

    public d3(e3 e3Var, int i10) {
        this.f18572a = i10;
        this.f18573b = e3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f18572a;
        e3 e3Var = this.f18573b;
        switch (i10) {
            case 0:
                e3Var.f18616y = 0.0f;
                e3Var.G.containerView.setTranslationX(0.0f);
                e3Var.G.container.invalidate();
                return;
            case 1:
                e3Var.G.skipDismissAnimation = true;
                e3Var.G.containerView.setTranslationX(e3Var.getMeasuredWidth());
                e3Var.G.dismiss();
                e3Var.G.container.invalidate();
                return;
            case 2:
                e3Var.G.containerView.setTranslationY(0.0f);
                e3Var.G.onContainerViewTranslation();
                g3 g3Var = e3Var.G;
                g3Var.onSmoothContainerViewLayout(g3Var.containerView.getTranslationY());
                e3Var.invalidate();
                return;
            default:
                AnimatorSet animatorSet = e3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
