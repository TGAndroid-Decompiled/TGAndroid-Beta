package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class fi extends AnimatorListenerAdapter {
    public final int f26454a;
    public final int f26455b;
    public final Object f26456c;
    public final Object d;

    public fi(Object obj, int i10, Object obj2, int i11) {
        this.f26454a = i11;
        this.d = obj;
        this.f26455b = i10;
        this.f26456c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f26454a) {
            case 0:
                xi xiVar = (xi) this.d;
                xiVar.f32873y0.setAlpha(0.0f);
                xiVar.f32873y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f26455b);
                ii iiVar = xiVar.f32808e0;
                pi piVar = xiVar.f32873y0;
                Float valueOf = Float.valueOf(1.0f);
                iiVar.getClass();
                iiVar.a(piVar, valueOf);
                xiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(xiVar.f32876z0, o1.h.f16965n, 0.0f);
                kVar.f16983u.a(0.75f);
                kVar.f16983u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.n4(3, this, (ih) this.f26456c));
                xiVar.f32856t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((zl0) aVar.d).scrollBy(0, this.f26455b - ((int[]) this.f26456c)[0]);
                aVar.f300c = null;
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                x3Var.T1();
                yh.h2 h2Var = x3Var.f52216f0;
                int i13 = 8;
                int i14 = this.f26455b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                h2Var.setVisibility(i10);
                yh.h2 h2Var2 = x3Var.f52237r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h2Var2.setVisibility(i11);
                yh.h2 h2Var3 = x3Var.f52244y0;
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
                Runnable runnable = (Runnable) this.f26456c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
