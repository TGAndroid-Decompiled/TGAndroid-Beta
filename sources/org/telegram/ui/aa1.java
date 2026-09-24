package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class aa1 extends AnimatorListenerAdapter {
    public final int f32076a;
    public final ca1 f32077b;

    public aa1(ca1 ca1Var, int i10) {
        this.f32076a = i10;
        this.f32077b = ca1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32076a) {
            case 0:
                ca1 ca1Var = this.f32077b;
                ca1Var.f32599b.setVisibility(4);
                ig.g gVar = ca1Var.f32599b;
                gVar.J = false;
                ig.g gVar2 = ca1Var.f32600c;
                gVar2.J = true;
                gVar.f11160y0 = 0;
                gVar2.f11160y0 = 0;
                Window window = ca1Var.f32598a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ca1 ca1Var2 = this.f32077b;
                ig.g gVar3 = ca1Var2.f32600c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ca1Var2.f32599b;
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
                Window window2 = ca1Var2.f32598a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ca1 ca1Var3 = this.f32077b;
                ca1Var3.f32599b.f11160y0 = 0;
                ca1Var3.e.setVisibility(8);
                return;
        }
    }
}
