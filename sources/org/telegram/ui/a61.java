package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class a61 extends AnimatorListenerAdapter {
    public final int f35693a;
    public final c61 f35694b;

    public a61(c61 c61Var, int i10) {
        this.f35693a = i10;
        this.f35694b = c61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35693a) {
            case 0:
                c61 c61Var = this.f35694b;
                c61Var.f36206b.setVisibility(4);
                bg.i iVar = c61Var.f36206b;
                iVar.J = false;
                bg.i iVar2 = c61Var.f36207c;
                iVar2.J = true;
                iVar.f2747y0 = 0;
                iVar2.f2747y0 = 0;
                Window window = c61Var.f36205a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                c61 c61Var2 = this.f35694b;
                bg.i iVar3 = c61Var2.f36207c;
                iVar3.setVisibility(4);
                bg.i iVar4 = c61Var2.f36206b;
                iVar4.f2747y0 = 0;
                iVar3.f2747y0 = 0;
                iVar4.J = true;
                iVar3.J = false;
                if (!(iVar4 instanceof bg.v)) {
                    iVar4.f2740u0 = true;
                    iVar4.x((iVar4.G0 * iVar4.f2720g0.f2767k) - bg.i.f2689k1);
                    iVar4.c(true);
                    iVar4.invalidate();
                } else {
                    iVar4.f2740u0 = false;
                    iVar4.d();
                }
                Window window2 = c61Var2.f36205a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                c61 c61Var3 = this.f35694b;
                c61Var3.f36206b.f2747y0 = 0;
                c61Var3.e.setVisibility(8);
                return;
        }
    }
}
