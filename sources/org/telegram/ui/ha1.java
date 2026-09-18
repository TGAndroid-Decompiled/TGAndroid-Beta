package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ha1 extends AnimatorListenerAdapter {
    public final int f34114a;
    public final ja1 f34115b;

    public ha1(ja1 ja1Var, int i10) {
        this.f34114a = i10;
        this.f34115b = ja1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34114a) {
            case 0:
                ja1 ja1Var = this.f34115b;
                ja1Var.f34771b.setVisibility(4);
                ig.g gVar = ja1Var.f34771b;
                gVar.J = false;
                ig.g gVar2 = ja1Var.f34772c;
                gVar2.J = true;
                gVar.f11173y0 = 0;
                gVar2.f11173y0 = 0;
                Window window = ja1Var.f34770a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ja1 ja1Var2 = this.f34115b;
                ig.g gVar3 = ja1Var2.f34772c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ja1Var2.f34771b;
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
                Window window2 = ja1Var2.f34770a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ja1 ja1Var3 = this.f34115b;
                ja1Var3.f34771b.f11173y0 = 0;
                ja1Var3.e.setVisibility(8);
                return;
        }
    }
}
