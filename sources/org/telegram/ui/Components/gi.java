package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends AnimatorListenerAdapter {
    public final int f24229a;
    public final int f24230b;
    public final Object f24231c;
    public final Object d;

    public gi(Object obj, int i10, Object obj2, int i11) {
        this.f24229a = i11;
        this.d = obj;
        this.f24230b = i10;
        this.f24231c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24229a) {
            case 0:
                vi viVar = (vi) this.d;
                viVar.f28806y0.setAlpha(0.0f);
                viVar.f28806y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24230b);
                ji jiVar = viVar.f28741e0;
                ni niVar = viVar.f28806y0;
                Float valueOf = Float.valueOf(1.0f);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.f28809z0, o1.h.f15344n, 0.0f);
                kVar.f15361u.a(0.75f);
                kVar.f15361u.b(500.0f);
                kVar.b(new i7(this, 3));
                kVar.a(new ei.m4(3, this, (fh) this.f24231c));
                viVar.f28789t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((ml0) aVar.d).scrollBy(0, this.f24230b - ((int[]) this.f24231c)[0]);
                aVar.f278c = null;
                return;
            default:
                yh.a4 a4Var = (yh.a4) this.d;
                a4Var.T1();
                yh.k2 k2Var = a4Var.f46983f0;
                int i13 = 8;
                int i14 = this.f24230b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k2Var.setVisibility(i10);
                yh.k2 k2Var2 = a4Var.f47004r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                k2Var2.setVisibility(i11);
                yh.k2 k2Var3 = a4Var.f47011y0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                k2Var3.setVisibility(i12);
                yh.k2 k2Var4 = a4Var.A0;
                if (i14 == 3) {
                    i13 = 0;
                }
                k2Var4.setVisibility(i13);
                a4Var.s2();
                a4Var.Z0 = null;
                Runnable runnable = (Runnable) this.f24231c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
