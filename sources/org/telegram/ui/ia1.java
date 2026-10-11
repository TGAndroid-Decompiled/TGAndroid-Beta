package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ia1 extends AnimatorListenerAdapter {
    public final int f38640a;
    public final ka1 f38641b;

    public ia1(ka1 ka1Var, int i10) {
        this.f38640a = i10;
        this.f38641b = ka1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38640a) {
            case 0:
                ka1 ka1Var = this.f38641b;
                ka1Var.f39249b.setVisibility(4);
                ig.g gVar = ka1Var.f39249b;
                gVar.J = false;
                ig.g gVar2 = ka1Var.f39250c;
                gVar2.J = true;
                gVar.f12199y0 = 0;
                gVar2.f12199y0 = 0;
                Window window = ka1Var.f39248a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ka1 ka1Var2 = this.f38641b;
                ig.g gVar3 = ka1Var2.f39250c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ka1Var2.f39249b;
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
                Window window2 = ka1Var2.f39248a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ka1 ka1Var3 = this.f38641b;
                ka1Var3.f39249b.f12199y0 = 0;
                ka1Var3.f39251e.setVisibility(8);
                return;
        }
    }
}
