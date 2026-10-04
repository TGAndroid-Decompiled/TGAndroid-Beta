package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class da1 extends AnimatorListenerAdapter {
    public final int f35723a;
    public final fa1 f35724b;

    public da1(fa1 fa1Var, int i10) {
        this.f35723a = i10;
        this.f35724b = fa1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35723a) {
            case 0:
                fa1 fa1Var = this.f35724b;
                fa1Var.f36236b.setVisibility(4);
                ig.g gVar = fa1Var.f36236b;
                gVar.J = false;
                ig.g gVar2 = fa1Var.f36237c;
                gVar2.J = true;
                gVar.f12153y0 = 0;
                gVar2.f12153y0 = 0;
                Window window = fa1Var.f36235a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                fa1 fa1Var2 = this.f35724b;
                ig.g gVar3 = fa1Var2.f36237c;
                gVar3.setVisibility(4);
                ig.g gVar4 = fa1Var2.f36236b;
                gVar4.f12153y0 = 0;
                gVar3.f12153y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f12146u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f12126g0.f12169k) - ig.g.f12094k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f12146u0 = false;
                    gVar4.d();
                }
                Window window2 = fa1Var2.f36235a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                fa1 fa1Var3 = this.f35724b;
                fa1Var3.f36236b.f12153y0 = 0;
                fa1Var3.f36238e.setVisibility(8);
                return;
        }
    }
}
