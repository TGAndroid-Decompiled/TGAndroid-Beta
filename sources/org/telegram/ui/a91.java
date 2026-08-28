package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class a91 extends AnimatorListenerAdapter {
    public final int f36407a;
    public final c91 f36408b;

    public a91(c91 c91Var, int i9) {
        this.f36407a = i9;
        this.f36408b = c91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36407a) {
            case 0:
                c91 c91Var = this.f36408b;
                c91Var.f37128b.setVisibility(4);
                qf.g gVar = c91Var.f37128b;
                gVar.F = false;
                qf.g gVar2 = c91Var.f37129c;
                gVar2.F = true;
                gVar.f46226u0 = 0;
                gVar2.f46226u0 = 0;
                Window window = c91Var.f37127a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                c91 c91Var2 = this.f36408b;
                qf.g gVar3 = c91Var2.f37129c;
                gVar3.setVisibility(4);
                qf.g gVar4 = c91Var2.f37128b;
                gVar4.f46226u0 = 0;
                gVar3.f46226u0 = 0;
                gVar4.F = true;
                gVar3.F = false;
                if (!(gVar4 instanceof qf.q)) {
                    gVar4.f46220q0 = true;
                    gVar4.x((gVar4.C0 * gVar4.f46200c0.f46249k) - qf.g.f46175g1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f46220q0 = false;
                    gVar4.d();
                }
                Window window2 = c91Var2.f37127a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                c91 c91Var3 = this.f36408b;
                c91Var3.f37128b.f46226u0 = 0;
                c91Var3.f37130e.setVisibility(8);
                return;
        }
    }
}
