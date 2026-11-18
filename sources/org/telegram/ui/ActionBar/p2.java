package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.ks;
public final class p2 extends AnimatorListenerAdapter {
    public final int f29859a;
    public final x2 f29860b;

    public p2(x2 x2Var, int i7) {
        this.f29859a = i7;
        this.f29860b = x2Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29859a) {
            case 0:
                x2 x2Var = this.f29860b;
                AnimatorSet animatorSet = x2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f29860b;
                AnimatorSet animatorSet2 = x2Var2.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var2.A0 = null;
                    x2Var2.B0 = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29859a;
        x2 x2Var = this.f29860b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = x2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    x2Var.v();
                    r2 r2Var = x2Var.f30233z0;
                    if (r2Var != null) {
                        r2Var.v();
                    }
                    if (x2Var.K) {
                        x2Var.f30193c.setLayerType(0, null);
                    }
                    if (x2Var.W) {
                        WindowManager.LayoutParams attributes = x2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        x2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (x2Var.L0) {
                    ks.e().k(99, 512);
                }
                x2Var.M0.e();
                return;
            default:
                AnimatorSet animatorSet2 = x2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    org.telegram.messenger.g0.g3(new oi.a2(this, 9));
                }
                ks.e().k(99, 512);
                return;
        }
    }
}
