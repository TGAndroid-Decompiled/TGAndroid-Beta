package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class li extends AnimatorListenerAdapter {
    public final int f28203a;
    public final int f28204b;
    public final Object f28205c;
    public final Object d;

    public li(Object obj, int i10, Object obj2, int i11) {
        this.f28203a = i11;
        this.d = obj;
        this.f28204b = i10;
        this.f28205c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f28203a) {
            case 0:
                aj ajVar = (aj) this.d;
                ajVar.B0.setAlpha(0.0f);
                ajVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f28204b);
                oi oiVar = ajVar.f24338e0;
                si siVar = ajVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                oiVar.getClass();
                oiVar.a(siVar, valueOf);
                ajVar.f24325a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(ajVar.C0, o1.h.f16672n, 0.0f);
                kVar.f16690u.a(0.75f);
                kVar.f16690u.b(500.0f);
                kVar.b(new m7(this, 3));
                kVar.a(new ei.l4(3, this, (lh) this.f28205c));
                ajVar.f24396w1 = kVar;
                kVar.h();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((wm0) aVar.d).scrollBy(0, this.f28204b - ((int[]) this.f28205c)[0]);
                aVar.f300c = null;
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.d;
                s3Var.U1();
                yh.e2 e2Var = s3Var.f53395g0;
                int i13 = 8;
                int i14 = this.f28204b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                e2Var.setVisibility(i10);
                yh.e2 e2Var2 = s3Var.f53416s0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                e2Var2.setVisibility(i11);
                yh.e2 e2Var3 = s3Var.f53423z0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                e2Var3.setVisibility(i12);
                yh.e2 e2Var4 = s3Var.B0;
                if (i14 == 3) {
                    i13 = 0;
                }
                e2Var4.setVisibility(i13);
                s3Var.u2();
                s3Var.f53384a1 = null;
                Runnable runnable = (Runnable) this.f28205c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
