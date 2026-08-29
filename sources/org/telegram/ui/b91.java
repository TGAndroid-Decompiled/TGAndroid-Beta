package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class b91 extends AnimatorListenerAdapter {
    public final int f36751a;
    public final d91 f36752b;

    public b91(d91 d91Var, int i10) {
        this.f36751a = i10;
        this.f36752b = d91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36751a) {
            case 0:
                d91 d91Var = this.f36752b;
                d91Var.f37425b.setVisibility(4);
                tf.g gVar = d91Var.f37425b;
                gVar.F = false;
                tf.g gVar2 = d91Var.f37426c;
                gVar2.F = true;
                gVar.f48285u0 = 0;
                gVar2.f48285u0 = 0;
                Window window = d91Var.f37424a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                d91 d91Var2 = this.f36752b;
                tf.g gVar3 = d91Var2.f37426c;
                gVar3.setVisibility(4);
                tf.g gVar4 = d91Var2.f37425b;
                gVar4.f48285u0 = 0;
                gVar3.f48285u0 = 0;
                gVar4.F = true;
                gVar3.F = false;
                if (!(gVar4 instanceof tf.q)) {
                    gVar4.f48279q0 = true;
                    gVar4.x((gVar4.C0 * gVar4.f48259c0.f48308k) - tf.g.f48234g1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f48279q0 = false;
                    gVar4.d();
                }
                Window window2 = d91Var2.f37424a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                d91 d91Var3 = this.f36752b;
                d91Var3.f37425b.f48285u0 = 0;
                d91Var3.f37427e.setVisibility(8);
                return;
        }
    }
}
