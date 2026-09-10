package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ji extends AnimatorListenerAdapter {
    public final int f24404a;
    public final int f24405b;
    public final Object f24406c;
    public final Object d;

    public ji(Object obj, int i10, Object obj2, int i11) {
        this.f24404a = i11;
        this.d = obj;
        this.f24405b = i10;
        this.f24406c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24404a) {
            case 0:
                yi yiVar = (yi) this.d;
                yiVar.f29427y0.setAlpha(0.0f);
                yiVar.f29427y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24405b);
                mi miVar = yiVar.f29362e0;
                qi qiVar = yiVar.f29427y0;
                Float valueOf = Float.valueOf(1.0f);
                miVar.getClass();
                miVar.getClass();
                miVar.b(qiVar, valueOf.floatValue());
                yiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(yiVar.f29430z0, o1.h.f14117n, 0.0f);
                kVar.f14134u.a(0.75f);
                kVar.f14134u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new di.q4(3, this, (jh) this.f24406c));
                yiVar.f29410t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((vl0) aVar.d).scrollBy(0, this.f24405b - ((int[]) this.f24406c)[0]);
                aVar.f276c = null;
                return;
            default:
                xh.x3 x3Var = (xh.x3) this.d;
                x3Var.T1();
                xh.i2 i2Var = x3Var.f46277f0;
                int i13 = 8;
                int i14 = this.f24405b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                i2Var.setVisibility(i10);
                xh.i2 i2Var2 = x3Var.f46298r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                i2Var2.setVisibility(i11);
                xh.i2 i2Var3 = x3Var.f46305y0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                i2Var3.setVisibility(i12);
                xh.i2 i2Var4 = x3Var.A0;
                if (i14 == 3) {
                    i13 = 0;
                }
                i2Var4.setVisibility(i13);
                x3Var.s2();
                x3Var.Z0 = null;
                Runnable runnable = (Runnable) this.f24406c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
