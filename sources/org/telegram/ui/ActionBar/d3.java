package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class d3 extends AnimatorListenerAdapter {
    public final int f19594a;
    public final e3 f19595b;

    public d3(e3 e3Var, int i10) {
        this.f19594a = i10;
        this.f19595b = e3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f19594a;
        e3 e3Var = this.f19595b;
        switch (i10) {
            case 0:
                e3Var.f19637y = 0.0f;
                e3Var.D.containerView.setTranslationX(0.0f);
                e3Var.D.container.invalidate();
                return;
            case 1:
                e3Var.D.skipDismissAnimation = true;
                e3Var.D.containerView.setTranslationX(e3Var.getMeasuredWidth());
                e3Var.D.dismiss();
                e3Var.D.container.invalidate();
                return;
            case 2:
                e3Var.D.containerView.setTranslationY(0.0f);
                e3Var.D.onContainerViewTranslation();
                g3 g3Var = e3Var.D;
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
