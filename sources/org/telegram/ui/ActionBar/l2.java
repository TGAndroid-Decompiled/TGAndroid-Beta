package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.hs;
public final class l2 extends AnimatorListenerAdapter {
    public final int f28303a;
    public final t2 f28304b;

    public l2(t2 t2Var, int i3) {
        this.f28303a = i3;
        this.f28304b = t2Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28303a) {
            case 0:
                t2 t2Var = this.f28304b;
                AnimatorSet animatorSet = t2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    return;
                }
                return;
            default:
                t2 t2Var2 = this.f28304b;
                AnimatorSet animatorSet2 = t2Var2.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var2.A0 = null;
                    t2Var2.B0 = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.f28303a;
        t2 t2Var = this.f28304b;
        switch (i3) {
            case 0:
                AnimatorSet animatorSet = t2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    t2Var.v();
                    n2 n2Var = t2Var.f28626z0;
                    if (n2Var != null) {
                        n2Var.v();
                    }
                    if (t2Var.K) {
                        t2Var.f28589c.setLayerType(0, null);
                    }
                    if (t2Var.W) {
                        WindowManager.LayoutParams attributes = t2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        t2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (t2Var.L0) {
                    hs.e().k(99, 512);
                }
                t2Var.M0.e();
                return;
            default:
                AnimatorSet animatorSet2 = t2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    org.telegram.messenger.g0.h3(new lg.n(this, 26));
                }
                hs.e().k(99, 512);
                return;
        }
    }
}
