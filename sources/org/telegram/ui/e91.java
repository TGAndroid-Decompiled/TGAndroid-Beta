package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class e91 extends AnimatorListenerAdapter {
    public final int f39034a;
    public final g91 f39035b;

    public e91(g91 g91Var, int i10) {
        this.f39034a = i10;
        this.f39035b = g91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39034a) {
            case 0:
                g91 g91Var = this.f39035b;
                g91Var.f39569b.setVisibility(4);
                kg.h hVar = g91Var.f39569b;
                hVar.J = false;
                kg.h hVar2 = g91Var.f39570c;
                hVar2.J = true;
                hVar.f16626y0 = 0;
                hVar2.f16626y0 = 0;
                Window window = g91Var.f39568a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                g91 g91Var2 = this.f39035b;
                kg.h hVar3 = g91Var2.f39570c;
                hVar3.setVisibility(4);
                kg.h hVar4 = g91Var2.f39569b;
                hVar4.f16626y0 = 0;
                hVar3.f16626y0 = 0;
                hVar4.J = true;
                hVar3.J = false;
                if (!(hVar4 instanceof kg.r)) {
                    hVar4.f16619u0 = true;
                    hVar4.x((hVar4.G0 * hVar4.f16599g0.f16640k) - kg.h.f16568k1);
                    hVar4.c(true);
                    hVar4.invalidate();
                } else {
                    hVar4.f16619u0 = false;
                    hVar4.d();
                }
                Window window2 = g91Var2.f39568a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                g91 g91Var3 = this.f39035b;
                g91Var3.f39569b.f16626y0 = 0;
                g91Var3.e.setVisibility(8);
                return;
        }
    }
}
