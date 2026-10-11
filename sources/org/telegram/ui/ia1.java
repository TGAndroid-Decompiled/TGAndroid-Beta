package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ia1 extends AnimatorListenerAdapter {
    public final int f38674a;
    public final ka1 f38675b;

    public ia1(ka1 ka1Var, int i10) {
        this.f38674a = i10;
        this.f38675b = ka1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38674a) {
            case 0:
                ka1 ka1Var = this.f38675b;
                ka1Var.f39283b.setVisibility(4);
                ig.g gVar = ka1Var.f39283b;
                gVar.J = false;
                ig.g gVar2 = ka1Var.f39284c;
                gVar2.J = true;
                gVar.f12199y0 = 0;
                gVar2.f12199y0 = 0;
                Window window = ka1Var.f39282a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ka1 ka1Var2 = this.f38675b;
                ig.g gVar3 = ka1Var2.f39284c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ka1Var2.f39283b;
                gVar4.f12199y0 = 0;
                gVar3.f12199y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f12192u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f12172g0.f12215k) - ig.g.f12140k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f12192u0 = false;
                    gVar4.d();
                }
                Window window2 = ka1Var2.f39282a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ka1 ka1Var3 = this.f38675b;
                ka1Var3.f39283b.f12199y0 = 0;
                ka1Var3.f39285e.setVisibility(8);
                return;
        }
    }
}
