package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.qs;
public final class o2 extends AnimatorListenerAdapter {
    public final int f28340a;
    public final w2 f28341b;

    public o2(w2 w2Var, int i7) {
        this.f28340a = i7;
        this.f28341b = w2Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28340a) {
            case 0:
                w2 w2Var = this.f28341b;
                AnimatorSet animatorSet = w2Var.f28714z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.f28714z0 = null;
                    w2Var.A0 = 0;
                    return;
                }
                return;
            default:
                w2 w2Var2 = this.f28341b;
                AnimatorSet animatorSet2 = w2Var2.f28714z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var2.f28714z0 = null;
                    w2Var2.A0 = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28340a;
        w2 w2Var = this.f28341b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = w2Var.f28714z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.f28714z0 = null;
                    w2Var.A0 = 0;
                    w2Var.v();
                    q2 q2Var = w2Var.f28713y0;
                    if (q2Var != null) {
                        q2Var.v();
                    }
                    if (w2Var.J) {
                        w2Var.f28675c.setLayerType(0, null);
                    }
                    if (w2Var.V) {
                        WindowManager.LayoutParams attributes = w2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        w2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (w2Var.K0) {
                    qs.e().k(99, 512);
                }
                w2Var.L0.e();
                return;
            default:
                AnimatorSet animatorSet2 = w2Var.f28714z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.f28714z0 = null;
                    w2Var.A0 = 0;
                    org.telegram.messenger.g0.h3(new l2.a0(this, 22));
                }
                qs.e().k(99, 512);
                return;
        }
    }
}
