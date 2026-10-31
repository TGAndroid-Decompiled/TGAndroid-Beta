package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class c61 extends AnimatorListenerAdapter {
    public final int f36401a;
    public final e61 f36402b;

    public c61(e61 e61Var, int i10) {
        this.f36401a = i10;
        this.f36402b = e61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36401a) {
            case 0:
                e61 e61Var = this.f36402b;
                e61Var.f36960b.setVisibility(4);
                bg.i iVar = e61Var.f36960b;
                iVar.J = false;
                bg.i iVar2 = e61Var.f36961c;
                iVar2.J = true;
                iVar.f2747y0 = 0;
                iVar2.f2747y0 = 0;
                Window window = e61Var.f36959a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                e61 e61Var2 = this.f36402b;
                bg.i iVar3 = e61Var2.f36961c;
                iVar3.setVisibility(4);
                bg.i iVar4 = e61Var2.f36960b;
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
                Window window2 = e61Var2.f36959a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                e61 e61Var3 = this.f36402b;
                e61Var3.f36960b.f2747y0 = 0;
                e61Var3.e.setVisibility(8);
                return;
        }
    }
}
