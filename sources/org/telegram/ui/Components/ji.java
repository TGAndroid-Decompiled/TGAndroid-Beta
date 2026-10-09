package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ji extends AnimatorListenerAdapter {
    public final int f27715a;
    public final int f27716b;
    public final Object f27717c;
    public final Object d;

    public ji(Object obj, int i10, Object obj2, int i11) {
        this.f27715a = i11;
        this.d = obj;
        this.f27716b = i10;
        this.f27717c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f27715a) {
            case 0:
                yi yiVar = (yi) this.d;
                yiVar.B0.setAlpha(0.0f);
                yiVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f27716b);
                mi miVar = yiVar.f33224e0;
                qi qiVar = yiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                miVar.getClass();
                miVar.a(qiVar, valueOf);
                yiVar.f33211a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(yiVar.C0, o1.h.f16920n, 0.0f);
                kVar.f16938u.a(0.75f);
                kVar.f16938u.b(500.0f);
                kVar.b(new m7(this, 3));
                kVar.a(new ei.l4(3, this, (jh) this.f27717c));
                yiVar.f33282w1 = kVar;
                kVar.h();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((qm0) aVar.d).scrollBy(0, this.f27716b - ((int[]) this.f27717c)[0]);
                aVar.f300c = null;
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.d;
                s3Var.U1();
                yh.e2 e2Var = s3Var.f53171g0;
                int i13 = 8;
                int i14 = this.f27716b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                e2Var.setVisibility(i10);
                yh.e2 e2Var2 = s3Var.f53192s0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                e2Var2.setVisibility(i11);
                yh.e2 e2Var3 = s3Var.f53199z0;
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
                s3Var.f53160a1 = null;
                Runnable runnable = (Runnable) this.f27717c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
