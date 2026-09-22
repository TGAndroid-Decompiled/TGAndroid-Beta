package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends AnimatorListenerAdapter {
    public final int f24346a;
    public final int f24347b;
    public final Object f24348c;
    public final Object d;

    public gi(Object obj, int i10, Object obj2, int i11) {
        this.f24346a = i11;
        this.d = obj;
        this.f24347b = i10;
        this.f24348c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24346a) {
            case 0:
                vi viVar = (vi) this.d;
                viVar.f28808y0.setAlpha(0.0f);
                viVar.f28808y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24347b);
                ji jiVar = viVar.f28743e0;
                ni niVar = viVar.f28808y0;
                Float valueOf = Float.valueOf(1.0f);
                jiVar.getClass();
                jiVar.getClass();
                jiVar.b(niVar, valueOf.floatValue());
                viVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.f28811z0, o1.h.f15332n, 0.0f);
                kVar.f15349u.a(0.75f);
                kVar.f15349u.b(500.0f);
                kVar.b(new i7(this, 3));
                kVar.a(new ei.m4(3, this, (fh) this.f24348c));
                viVar.f28791t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((ll0) aVar.d).scrollBy(0, this.f24347b - ((int[]) this.f24348c)[0]);
                aVar.f278c = null;
                return;
            default:
                yh.z3 z3Var = (yh.z3) this.d;
                z3Var.T1();
                yh.j2 j2Var = z3Var.f48021f0;
                int i13 = 8;
                int i14 = this.f24347b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                j2Var.setVisibility(i10);
                yh.j2 j2Var2 = z3Var.f48042r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                j2Var2.setVisibility(i11);
                yh.j2 j2Var3 = z3Var.f48049y0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                j2Var3.setVisibility(i12);
                yh.j2 j2Var4 = z3Var.A0;
                if (i14 == 3) {
                    i13 = 0;
                }
                j2Var4.setVisibility(i13);
                z3Var.s2();
                z3Var.Z0 = null;
                Runnable runnable = (Runnable) this.f24348c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
