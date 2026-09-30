package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x30 extends AnimatorListenerAdapter {
    public final int f30117a;
    public final z30 f30118b;

    public x30(z30 z30Var, int i10) {
        this.f30117a = i10;
        this.f30118b = z30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30117a) {
            case 0:
                z30 z30Var = this.f30118b;
                if (z30Var.f30879b0 == animator) {
                    z30Var.f30879b0 = null;
                    z30Var.b();
                    return;
                }
                return;
            default:
                z30 z30Var2 = this.f30118b;
                if (z30Var2.f30877a0 == animator) {
                    z30Var2.f30877a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30117a) {
            case 1:
                y30 y30Var = this.f30118b.W;
                if (y30Var != null) {
                    ((org.telegram.ui.ns0) y30Var).f36107a.f31297e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
