package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ei extends AnimatorListenerAdapter {
    public final int f24069a;
    public final int f24070b;
    public final Object f24071c;
    public final Object d;

    public ei(Object obj, int i10, Object obj2, int i11) {
        this.f24069a = i11;
        this.d = obj;
        this.f24070b = i10;
        this.f24071c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24069a) {
            case 0:
                wi wiVar = (wi) this.d;
                wiVar.f30023y0.setAlpha(0.0f);
                wiVar.f30023y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24070b);
                hi hiVar = wiVar.f29958e0;
                oi oiVar = wiVar.f30023y0;
                Float valueOf = Float.valueOf(1.0f);
                hiVar.getClass();
                hiVar.a(oiVar, valueOf);
                wiVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(wiVar.f30026z0, o1.h.f15555n, 0.0f);
                kVar.f15572u.a(0.75f);
                kVar.f15572u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.m4(3, this, (hh) this.f24071c));
                wiVar.f30006t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((yl0) aVar.d).scrollBy(0, this.f24070b - ((int[]) this.f24071c)[0]);
                aVar.f278c = null;
                return;
            default:
                yh.x3 x3Var = (yh.x3) this.d;
                x3Var.T1();
                yh.h2 h2Var = x3Var.f48287f0;
                int i13 = 8;
                int i14 = this.f24070b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                h2Var.setVisibility(i10);
                yh.h2 h2Var2 = x3Var.f48308r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                h2Var2.setVisibility(i11);
                yh.h2 h2Var3 = x3Var.f48315y0;
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
                Runnable runnable = (Runnable) this.f24071c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
