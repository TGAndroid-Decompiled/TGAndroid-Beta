package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ja1 extends AnimatorListenerAdapter {
    public final int f38892a;
    public final la1 f38893b;

    public ja1(la1 la1Var, int i10) {
        this.f38892a = i10;
        this.f38893b = la1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38892a) {
            case 0:
                la1 la1Var = this.f38893b;
                la1Var.f39487b.setVisibility(4);
                ig.g gVar = la1Var.f39487b;
                gVar.J = false;
                ig.g gVar2 = la1Var.f39488c;
                gVar2.J = true;
                gVar.f12200y0 = 0;
                gVar2.f12200y0 = 0;
                Window window = la1Var.f39486a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                la1 la1Var2 = this.f38893b;
                ig.g gVar3 = la1Var2.f39488c;
                gVar3.setVisibility(4);
                ig.g gVar4 = la1Var2.f39487b;
                gVar4.f12200y0 = 0;
                gVar3.f12200y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f12193u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f12173g0.f12216k) - ig.g.f12141k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f12193u0 = false;
                    gVar4.d();
                }
                Window window2 = la1Var2.f39486a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                la1 la1Var3 = this.f38893b;
                la1Var3.f39487b.f12200y0 = 0;
                la1Var3.f39489e.setVisibility(8);
                return;
        }
    }
}
