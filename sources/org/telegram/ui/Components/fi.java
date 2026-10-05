package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class fi extends AnimatorListenerAdapter {
    public final int f26467a;
    public final int f26468b;
    public final Object f26469c;
    public final Object d;

    public fi(Object obj, int i10, Object obj2, int i11) {
        this.f26467a = i11;
        this.d = obj;
        this.f26468b = i10;
        this.f26469c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f26467a) {
            case 0:
                xi xiVar = (xi) this.d;
                xiVar.f32971y0.setAlpha(0.0f);
                xiVar.f32971y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f26468b);
                ii iiVar = xiVar.f32906e0;
                pi piVar = xiVar.f32971y0;
                Float valueOf = Float.valueOf(1.0f);
                iiVar.getClass();
                iiVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(xiVar.f32974z0, o1.h.f16975n, 0.0f);
                kVar.f16993u.a(0.75f);
                kVar.f16993u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.n4(3, this, (ih) this.f26469c));
                xiVar.f32954t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((zl0) aVar.d).scrollBy(0, this.f26468b - ((int[]) this.f26469c)[0]);
                aVar.f300c = null;
                return;
            default:
                yh.y3 y3Var = (yh.y3) this.d;
                y3Var.T1();
                yh.i2 i2Var = y3Var.f52290f0;
                int i13 = 8;
                int i14 = this.f26468b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                i2Var.setVisibility(i10);
                yh.i2 i2Var2 = y3Var.f52311r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                i2Var2.setVisibility(i11);
                yh.i2 i2Var3 = y3Var.f52318y0;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                i2Var3.setVisibility(i12);
                yh.i2 i2Var4 = y3Var.A0;
                if (i14 == 3) {
                    i13 = 0;
                }
                i2Var4.setVisibility(i13);
                y3Var.s2();
                y3Var.Z0 = null;
                Runnable runnable = (Runnable) this.f26469c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
