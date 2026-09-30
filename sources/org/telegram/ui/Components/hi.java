package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class hi extends AnimatorListenerAdapter {
    public final int f24818a;
    public final int f24819b;
    public final Object f24820c;
    public final Object d;

    public hi(Object obj, int i10, Object obj2, int i11) {
        this.f24818a = i11;
        this.d = obj;
        this.f24819b = i10;
        this.f24820c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24818a) {
            case 0:
                wi wiVar = (wi) this.d;
                wiVar.f29995y0.setAlpha(0.0f);
                wiVar.f29995y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24819b);
                ki kiVar = wiVar.f29930e0;
                oi oiVar = wiVar.f29995y0;
                Float valueOf = Float.valueOf(1.0f);
                kiVar.getClass();
                kiVar.getClass();
                kiVar.b(oiVar, valueOf.floatValue());
                wiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(wiVar.f29998z0, o1.h.f15517n, 0.0f);
                kVar.f15534u.a(0.75f);
                kVar.f15534u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.m4(3, this, (hh) this.f24820c));
                wiVar.f29978t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((yl0) aVar.d).scrollBy(0, this.f24819b - ((int[]) this.f24820c)[0]);
                aVar.f278c = null;
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                x3Var.T1();
                yh.h2 h2Var = x3Var.f48240f0;
                int i13 = 8;
                int i14 = this.f24819b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                h2Var.setVisibility(i10);
                yh.h2 h2Var2 = x3Var.f48261r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h2Var2.setVisibility(i11);
                yh.h2 h2Var3 = x3Var.f48268y0;
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
                Runnable runnable = (Runnable) this.f24820c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
