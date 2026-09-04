package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends AnimatorListenerAdapter {
    public final int f26388a;
    public final int f26389b;
    public final Object f26390c;
    public final Object d;

    public gi(Object obj, int i10, Object obj2, int i11) {
        this.f26388a = i11;
        this.d = obj;
        this.f26389b = i10;
        this.f26390c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f26388a) {
            case 0:
                vi viVar = (vi) this.d;
                viVar.f31340y0.setAlpha(0.0f);
                viVar.f31340y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f26389b);
                ji jiVar = viVar.f31275e0;
                ni niVar = viVar.f31340y0;
                Float valueOf = Float.valueOf(1.0f);
                jiVar.getClass();
                jiVar.getClass();
                jiVar.b(niVar, valueOf.floatValue());
                viVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.f31343z0, o1.h.f16807n, 0.0f);
                kVar.f16825u.a(0.75f);
                kVar.f16825u.b(500.0f);
                kVar.b(new l7(this, 3));
                kVar.a(new fi.n4(3, this, (hh) this.f26390c));
                viVar.f31323t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((ll0) aVar.d).scrollBy(0, this.f26389b - ((int[]) this.f26390c)[0]);
                aVar.f286c = null;
                return;
            default:
                zh.w3 w3Var = (zh.w3) this.d;
                w3Var.T1();
                zh.h2 h2Var = w3Var.f52765f0;
                int i13 = 8;
                int i14 = this.f26389b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                h2Var.setVisibility(i10);
                zh.h2 h2Var2 = w3Var.f52786r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h2Var2.setVisibility(i11);
                zh.h2 h2Var3 = w3Var.f52793y0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                h2Var3.setVisibility(i12);
                zh.h2 h2Var4 = w3Var.A0;
                if (i14 == 3) {
                    i13 = 0;
                }
                h2Var4.setVisibility(i13);
                w3Var.s2();
                w3Var.Z0 = null;
                Runnable runnable = (Runnable) this.f26390c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
