package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.ks;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29891a;
    public final w2 f29892b;

    public o2(w2 w2Var, int i7) {
        this.f29891a = i7;
        this.f29892b = w2Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29891a) {
            case 0:
                w2 w2Var = this.f29892b;
                AnimatorSet animatorSet = w2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.A0 = null;
                    w2Var.B0 = 0;
                    return;
                }
                return;
            default:
                w2 w2Var2 = this.f29892b;
                AnimatorSet animatorSet2 = w2Var2.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var2.A0 = null;
                    w2Var2.B0 = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29891a;
        w2 w2Var = this.f29892b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = w2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.A0 = null;
                    w2Var.B0 = 0;
                    w2Var.v();
                    q2 q2Var = w2Var.f30269z0;
                    if (q2Var != null) {
                        q2Var.v();
                    }
                    if (w2Var.K) {
                        w2Var.f30229c.setLayerType(0, null);
                    }
                    if (w2Var.W) {
                        WindowManager.LayoutParams attributes = w2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        w2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (w2Var.L0) {
                    ks.e().k(99, 512);
                }
                w2Var.M0.e();
                return;
            default:
                AnimatorSet animatorSet2 = w2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.A0 = null;
                    w2Var.B0 = 0;
                    org.telegram.messenger.g0.g3(new oi.c2(this, 9));
                }
                ks.e().k(99, 512);
                return;
        }
    }
}
