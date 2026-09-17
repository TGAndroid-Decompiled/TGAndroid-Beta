package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ia1 extends AnimatorListenerAdapter {
    public final int f34520a;
    public final ka1 f34521b;

    public ia1(ka1 ka1Var, int i10) {
        this.f34520a = i10;
        this.f34521b = ka1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34520a) {
            case 0:
                ka1 ka1Var = this.f34521b;
                ka1Var.f35174b.setVisibility(4);
                ig.g gVar = ka1Var.f35174b;
                gVar.J = false;
                ig.g gVar2 = ka1Var.f35175c;
                gVar2.J = true;
                gVar.f11173y0 = 0;
                gVar2.f11173y0 = 0;
                Window window = ka1Var.f35173a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ka1 ka1Var2 = this.f34521b;
                ig.g gVar3 = ka1Var2.f35175c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ka1Var2.f35174b;
                gVar4.f11173y0 = 0;
                gVar3.f11173y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f11166u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f11146g0.f11187k) - ig.g.f11115k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f11166u0 = false;
                    gVar4.d();
                }
                Window window2 = ka1Var2.f35173a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ka1 ka1Var3 = this.f34521b;
                ka1Var3.f35174b.f11173y0 = 0;
                ka1Var3.e.setVisibility(8);
                return;
        }
    }
}
