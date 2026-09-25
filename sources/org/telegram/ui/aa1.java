package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class aa1 extends AnimatorListenerAdapter {
    public final int f32091a;
    public final ca1 f32092b;

    public aa1(ca1 ca1Var, int i10) {
        this.f32091a = i10;
        this.f32092b = ca1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32091a) {
            case 0:
                ca1 ca1Var = this.f32092b;
                ca1Var.f32614b.setVisibility(4);
                ig.g gVar = ca1Var.f32614b;
                gVar.J = false;
                ig.g gVar2 = ca1Var.f32615c;
                gVar2.J = true;
                gVar.f11160y0 = 0;
                gVar2.f11160y0 = 0;
                Window window = ca1Var.f32613a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ca1 ca1Var2 = this.f32092b;
                ig.g gVar3 = ca1Var2.f32615c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ca1Var2.f32614b;
                gVar4.f11160y0 = 0;
                gVar3.f11160y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f11153u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f11133g0.f11174k) - ig.g.f11102k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f11153u0 = false;
                    gVar4.d();
                }
                Window window2 = ca1Var2.f32613a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ca1 ca1Var3 = this.f32092b;
                ca1Var3.f32614b.f11160y0 = 0;
                ca1Var3.e.setVisibility(8);
                return;
        }
    }
}
