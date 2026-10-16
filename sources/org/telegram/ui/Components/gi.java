package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends AnimatorListenerAdapter {
    public final int f24972a;
    public final int f24973b;
    public final Object f24974c;
    public final Object d;

    public gi(Object obj, int i10, Object obj2, int i11) {
        this.f24972a = i11;
        this.d = obj;
        this.f24973b = i10;
        this.f24974c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24972a) {
            case 0:
                vi viVar = (vi) this.d;
                viVar.B0.setAlpha(0.0f);
                viVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24973b);
                ji jiVar = viVar.f29668e0;
                ni niVar = viVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.f29656a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.C0, o1.h.f16144n, 0.0f);
                kVar.f16161u.a(0.75f);
                kVar.f16161u.b(500.0f);
                kVar.b(new n7(this, 3));
                kVar.a(new fi.m4(3, this, (hh) this.f24974c));
                viVar.f29726w1 = kVar;
                kVar.h();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((mm0) aVar.d).scrollBy(0, this.f24973b - ((int[]) this.f24974c)[0]);
                aVar.f282c = null;
                return;
            default:
                zh.r3 r3Var = (zh.r3) this.d;
                r3Var.U1();
                zh.d2 d2Var = r3Var.f51081g0;
                int i13 = 8;
                int i14 = this.f24973b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                d2Var.setVisibility(i10);
                zh.d2 d2Var2 = r3Var.f51102s0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                d2Var2.setVisibility(i11);
                zh.d2 d2Var3 = r3Var.f51109z0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                d2Var3.setVisibility(i12);
                zh.d2 d2Var4 = r3Var.B0;
                if (i14 == 3) {
                    i13 = 0;
                }
                d2Var4.setVisibility(i13);
                r3Var.u2();
                r3Var.f51070a1 = null;
                Runnable runnable = (Runnable) this.f24974c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
