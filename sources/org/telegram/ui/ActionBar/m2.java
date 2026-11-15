package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.ns;
public final class m2 extends AnimatorListenerAdapter {
    public final int f29377a;
    public final u2 f29378b;

    public m2(u2 u2Var, int i7) {
        this.f29377a = i7;
        this.f29378b = u2Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29377a) {
            case 0:
                u2 u2Var = this.f29378b;
                AnimatorSet animatorSet = u2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    return;
                }
                return;
            default:
                u2 u2Var2 = this.f29378b;
                AnimatorSet animatorSet2 = u2Var2.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var2.A0 = null;
                    u2Var2.B0 = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.f29377a;
        u2 u2Var = this.f29378b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = u2Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    u2Var.v();
                    o2 o2Var = u2Var.f29725z0;
                    if (o2Var != null) {
                        o2Var.v();
                    }
                    if (u2Var.K) {
                        u2Var.f29685c.setLayerType(0, null);
                    }
                    if (u2Var.W) {
                        WindowManager.LayoutParams attributes = u2Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        u2Var.getWindow().setAttributes(attributes);
                    }
                }
                if (u2Var.L0) {
                    ns.e().k(99, 512);
                }
                u2Var.M0.e();
                return;
            default:
                AnimatorSet animatorSet2 = u2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    org.telegram.messenger.g0.h3(new r0(this, 5));
                }
                ns.e().k(99, 512);
                return;
        }
    }
}
