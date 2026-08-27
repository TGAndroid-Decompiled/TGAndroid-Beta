package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

public final class qb1 extends AnimatorListenerAdapter {

    public final int f41626a;

    public final nc1 f41627b;

    public qb1(nc1 nc1Var, int i10) {
        this.f41626a = i10;
        this.f41627b = nc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41626a) {
            case 0:
                super.onAnimationEnd(animator);
                nc1 nc1Var = this.f41627b;
                nc1Var.f40784t0.invalidate();
                nc1Var.f40782s0[1].setVisibility(8);
                nc1Var.Y1 = null;
                break;
            case 1:
                this.f41627b.f40794x0 = null;
                break;
            case 2:
                nc1 nc1Var2 = this.f41627b;
                if (nc1Var2.f40799z0.getTag() == null) {
                    nc1Var2.f40799z0.setVisibility(4);
                }
                nc1Var2.D0 = null;
                break;
            case 3:
                nc1 nc1Var3 = this.f41627b;
                if (nc1Var3.A0.getTag() == null) {
                    nc1Var3.A0.setVisibility(4);
                }
                nc1Var3.E0 = null;
                break;
            case 4:
                nc1 nc1Var4 = this.f41627b;
                hc hcVar = nc1Var4.f40748d2;
                if (hcVar != null) {
                    if (hcVar.getParent() != null) {
                        ((ViewGroup) nc1Var4.f40748d2.getParent()).removeView(nc1Var4.f40748d2);
                    }
                    nc1Var4.f40748d2 = null;
                }
                nc1Var4.f40756f2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                nc1 nc1Var5 = this.f41627b;
                if (!nc1Var5.l1.a()) {
                    nc1Var5.N1.setVisibility(8);
                }
                break;
        }
    }
}
