package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.at;
public final class r2 extends AnimatorListenerAdapter {
    public final int f20724a;
    public final z2 f20725b;

    public r2(z2 z2Var, int i10) {
        this.f20724a = i10;
        this.f20725b = z2Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f20724a) {
            case 0:
                z2 z2Var = this.f20725b;
                AnimatorSet animatorSet = z2Var.f21625z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z2Var.f21625z0 = null;
                    z2Var.A0 = 0;
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f20725b;
                AnimatorSet animatorSet2 = z2Var2.f21625z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var2.f21625z0 = null;
                    z2Var2.A0 = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f20724a;
        z2 z2Var = this.f20725b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = z2Var.f21625z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z2Var.f21625z0 = null;
                    z2Var.A0 = 0;
                    z2Var.w();
                    t2 t2Var = z2Var.f21624y0;
                    if (t2Var != null) {
                        t2Var.w();
                    }
                    if (z2Var.J) {
                        z2Var.f21590c.setLayerType(0, null);
                    }
                    if (z2Var.V) {
                        WindowManager.LayoutParams attributes = z2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        z2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (z2Var.K0) {
                    at.e().k(99, 512);
                }
                z2Var.L0.e();
                return;
            default:
                AnimatorSet animatorSet2 = z2Var.f21625z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.f21625z0 = null;
                    z2Var.A0 = 0;
                    org.telegram.messenger.i0.g3(new lg.s(this, 22));
                }
                at.e().k(99, 512);
                return;
        }
    }
}
