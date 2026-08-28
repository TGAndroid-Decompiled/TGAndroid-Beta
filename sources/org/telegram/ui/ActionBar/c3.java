package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f22797a;
    public final d3 f22798b;

    public c3(d3 d3Var, int i9) {
        this.f22797a = i9;
        this.f22798b = d3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.f22797a;
        d3 d3Var = this.f22798b;
        switch (i9) {
            case 0:
                d3Var.f22841y = 0.0f;
                d3Var.C.containerView.setTranslationX(0.0f);
                d3Var.C.container.invalidate();
                return;
            case 1:
                d3Var.C.skipDismissAnimation = true;
                d3Var.C.containerView.setTranslationX(d3Var.getMeasuredWidth());
                d3Var.C.dismiss();
                d3Var.C.container.invalidate();
                return;
            case 2:
                d3Var.C.containerView.setTranslationY(0.0f);
                d3Var.C.onContainerViewTranslation();
                f3 f3Var = d3Var.C;
                f3Var.onSmoothContainerViewLayout(f3Var.containerView.getTranslationY());
                d3Var.invalidate();
                return;
            default:
                AnimatorSet animatorSet = d3Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d3Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
