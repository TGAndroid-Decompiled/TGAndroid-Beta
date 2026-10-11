package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ji extends AnimatorListenerAdapter {
    public final int f27693a;
    public final int f27694b;
    public final Object f27695c;
    public final Object d;

    public ji(Object obj, int i10, Object obj2, int i11) {
        this.f27693a = i11;
        this.d = obj;
        this.f27694b = i10;
        this.f27695c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f27693a) {
            case 0:
                yi yiVar = (yi) this.d;
                yiVar.B0.setAlpha(0.0f);
                yiVar.B0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f27694b);
                mi miVar = yiVar.f33212e0;
                qi qiVar = yiVar.B0;
                Float valueOf = Float.valueOf(1.0f);
                miVar.getClass();
                miVar.a(qiVar, valueOf);
                yiVar.f33199a1.setAlpha(0.0f);
                o1.k kVar = new o1.k(yiVar.C0, o1.h.f16970n, 0.0f);
                kVar.f16988u.a(0.75f);
                kVar.f16988u.b(500.0f);
                kVar.b(new m7(this, 3));
                kVar.a(new ei.l4(3, this, (jh) this.f27695c));
                yiVar.f33270w1 = kVar;
                kVar.h();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((sm0) aVar.d).scrollBy(0, this.f27694b - ((int[]) this.f27695c)[0]);
                aVar.f300c = null;
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.d;
                s3Var.U1();
                yh.e2 e2Var = s3Var.f53258g0;
                int i13 = 8;
                int i14 = this.f27694b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                e2Var.setVisibility(i10);
                yh.e2 e2Var2 = s3Var.f53279s0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                e2Var2.setVisibility(i11);
                yh.e2 e2Var3 = s3Var.f53286z0;
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
                s3Var.f53247a1 = null;
                Runnable runnable = (Runnable) this.f27695c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
