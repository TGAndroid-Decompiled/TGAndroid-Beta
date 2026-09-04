package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.NotificationCenter;
public final class c3 extends AnimatorListenerAdapter {
    public final int f20314a;
    public final d3 f20315b;

    public c3(d3 d3Var, int i10) {
        this.f20314a = i10;
        this.f20315b = d3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f20314a;
        d3 d3Var = this.f20315b;
        switch (i10) {
            case 0:
                d3Var.f20360y = 0.0f;
                d3Var.G.containerView.setTranslationX(0.0f);
                d3Var.G.container.invalidate();
                return;
            case 1:
                d3Var.G.skipDismissAnimation = true;
                d3Var.G.containerView.setTranslationX(d3Var.getMeasuredWidth());
                d3Var.G.dismiss();
                d3Var.G.container.invalidate();
                return;
            case 2:
                d3Var.G.containerView.setTranslationY(0.0f);
                d3Var.G.onContainerViewTranslation();
                f3 f3Var = d3Var.G;
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
