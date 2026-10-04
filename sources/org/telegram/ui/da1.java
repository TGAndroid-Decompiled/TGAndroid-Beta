package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class da1 extends AnimatorListenerAdapter {
    public final int f35718a;
    public final fa1 f35719b;

    public da1(fa1 fa1Var, int i10) {
        this.f35718a = i10;
        this.f35719b = fa1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35718a) {
            case 0:
                fa1 fa1Var = this.f35719b;
                fa1Var.f36231b.setVisibility(4);
                ig.g gVar = fa1Var.f36231b;
                gVar.J = false;
                ig.g gVar2 = fa1Var.f36232c;
                gVar2.J = true;
                gVar.f12152y0 = 0;
                gVar2.f12152y0 = 0;
                Window window = fa1Var.f36230a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                fa1 fa1Var2 = this.f35719b;
                ig.g gVar3 = fa1Var2.f36232c;
                gVar3.setVisibility(4);
                ig.g gVar4 = fa1Var2.f36231b;
                gVar4.f12152y0 = 0;
                gVar3.f12152y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f12145u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f12125g0.f12168k) - ig.g.f12093k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f12145u0 = false;
                    gVar4.d();
                }
                Window window2 = fa1Var2.f36230a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                fa1 fa1Var3 = this.f35719b;
                fa1Var3.f36231b.f12152y0 = 0;
                fa1Var3.f36233e.setVisibility(8);
                return;
        }
    }
}
