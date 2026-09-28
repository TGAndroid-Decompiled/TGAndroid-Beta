package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hi extends AnimatorListenerAdapter {
    public final int f24837a;
    public final int f24838b;
    public final Object f24839c;
    public final Object d;

    public hi(Object obj, int i10, Object obj2, int i11) {
        this.f24837a = i11;
        this.d = obj;
        this.f24838b = i10;
        this.f24839c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24837a) {
            case 0:
                wi wiVar = (wi) this.d;
                wiVar.f30003y0.setAlpha(0.0f);
                wiVar.f30003y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24838b);
                ki kiVar = wiVar.f29938e0;
                oi oiVar = wiVar.f30003y0;
                Float valueOf = Float.valueOf(1.0f);
                kiVar.getClass();
                kiVar.getClass();
                kiVar.b(oiVar, valueOf.floatValue());
                wiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(wiVar.f30006z0, o1.h.f15516n, 0.0f);
                kVar.f15533u.a(0.75f);
                kVar.f15533u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.m4(3, this, (hh) this.f24839c));
                wiVar.f29986t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((yl0) aVar.d).scrollBy(0, this.f24838b - ((int[]) this.f24839c)[0]);
                aVar.f278c = null;
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                x3Var.T1();
                yh.h2 h2Var = x3Var.f48238f0;
                int i13 = 8;
                int i14 = this.f24838b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                h2Var.setVisibility(i10);
                yh.h2 h2Var2 = x3Var.f48259r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h2Var2.setVisibility(i11);
                yh.h2 h2Var3 = x3Var.f48266y0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                h2Var3.setVisibility(i12);
                yh.h2 h2Var4 = x3Var.A0;
                if (i14 == 3) {
                    i13 = 0;
                }
                h2Var4.setVisibility(i13);
                x3Var.s2();
                x3Var.Z0 = null;
                Runnable runnable = (Runnable) this.f24839c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
