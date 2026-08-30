package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class o91 extends AnimatorListenerAdapter {
    public final int f36854a;
    public final q91 f36855b;

    public o91(q91 q91Var, int i10) {
        this.f36854a = i10;
        this.f36855b = q91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36854a) {
            case 0:
                q91 q91Var = this.f36855b;
                q91Var.f37680b.setVisibility(4);
                vf.g gVar = q91Var.f37680b;
                gVar.G = false;
                vf.g gVar2 = q91Var.f37681c;
                gVar2.G = true;
                gVar.f45738v0 = 0;
                gVar2.f45738v0 = 0;
                Window window = q91Var.f37679a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                q91 q91Var2 = this.f36855b;
                vf.g gVar3 = q91Var2.f37681c;
                gVar3.setVisibility(4);
                vf.g gVar4 = q91Var2.f37680b;
                gVar4.f45738v0 = 0;
                gVar3.f45738v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (!(gVar4 instanceof vf.q)) {
                    gVar4.f45733r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.f45713d0.f45758k) - vf.g.f45686h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f45733r0 = false;
                    gVar4.d();
                }
                Window window2 = q91Var2.f37679a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                q91 q91Var3 = this.f36855b;
                q91Var3.f37680b.f45738v0 = 0;
                q91Var3.e.setVisibility(8);
                return;
        }
    }
}
