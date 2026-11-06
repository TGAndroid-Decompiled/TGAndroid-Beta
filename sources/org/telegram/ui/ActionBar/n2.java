package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.qs;
public final class n2 extends AnimatorListenerAdapter {
    public final int f28314a;
    public final v2 f28315b;

    public n2(v2 v2Var, int i7) {
        this.f28314a = i7;
        this.f28315b = v2Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28314a) {
            case 0:
                v2 v2Var = this.f28315b;
                AnimatorSet animatorSet = v2Var.f28655z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    v2Var.f28655z0 = null;
                    v2Var.A0 = 0;
                    return;
                }
                return;
            default:
                v2 v2Var2 = this.f28315b;
                AnimatorSet animatorSet2 = v2Var2.f28655z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v2Var2.f28655z0 = null;
                    v2Var2.A0 = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f28314a;
        v2 v2Var = this.f28315b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = v2Var.f28655z0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    v2Var.f28655z0 = null;
                    v2Var.A0 = 0;
                    v2Var.v();
                    p2 p2Var = v2Var.f28654y0;
                    if (p2Var != null) {
                        p2Var.v();
                    }
                    if (v2Var.J) {
                        v2Var.f28619c.setLayerType(0, null);
                    }
                    if (v2Var.V) {
                        WindowManager.LayoutParams attributes = v2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        v2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (v2Var.K0) {
                    qs.e().k(99, 512);
                }
                v2Var.L0.e();
                return;
            default:
                AnimatorSet animatorSet2 = v2Var.f28655z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v2Var.f28655z0 = null;
                    v2Var.A0 = 0;
                    org.telegram.messenger.g0.h3(new l2.w(this, 23));
                }
                qs.e().k(99, 512);
                return;
        }
    }
}
