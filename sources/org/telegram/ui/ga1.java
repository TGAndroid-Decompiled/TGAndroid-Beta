package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ga1 extends AnimatorListenerAdapter {
    public final int f33855a;
    public final ia1 f33856b;

    public ga1(ia1 ia1Var, int i10) {
        this.f33855a = i10;
        this.f33856b = ia1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33855a) {
            case 0:
                ia1 ia1Var = this.f33856b;
                ia1Var.f34572b.setVisibility(4);
                ig.g gVar = ia1Var.f34572b;
                gVar.J = false;
                ig.g gVar2 = ia1Var.f34573c;
                gVar2.J = true;
                gVar.f11170y0 = 0;
                gVar2.f11170y0 = 0;
                Window window = ia1Var.f34571a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ia1 ia1Var2 = this.f33856b;
                ig.g gVar3 = ia1Var2.f34573c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ia1Var2.f34572b;
                gVar4.f11170y0 = 0;
                gVar3.f11170y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f11163u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f11143g0.f11184k) - ig.g.f11112k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f11163u0 = false;
                    gVar4.d();
                }
                Window window2 = ia1Var2.f34571a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ia1 ia1Var3 = this.f33856b;
                ia1Var3.f34572b.f11170y0 = 0;
                ia1Var3.e.setVisibility(8);
                return;
        }
    }
}
