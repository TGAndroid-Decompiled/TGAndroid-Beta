package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class gi extends AnimatorListenerAdapter {
    public final int f24390a;
    public final int f24391b;
    public final Object f24392c;
    public final Object d;

    public gi(Object obj, int i10, Object obj2, int i11) {
        this.f24390a = i11;
        this.d = obj;
        this.f24391b = i10;
        this.f24392c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f24390a) {
            case 0:
                vi viVar = (vi) this.d;
                viVar.f29082y0.setAlpha(0.0f);
                viVar.f29082y0.setTranslationY(AndroidUtilities.dp(78.0f) + this.f24391b);
                ji jiVar = viVar.f29017e0;
                ni niVar = viVar.f29082y0;
                Float valueOf = Float.valueOf(1.0f);
                jiVar.getClass();
                jiVar.a(niVar, valueOf);
                viVar.X0.setAlpha(0.0f);
                o1.k kVar = new o1.k(viVar.f29085z0, o1.h.f15473n, 0.0f);
                kVar.f15490u.a(0.75f);
                kVar.f15490u.b(500.0f);
                kVar.b(new k7(this, 3));
                kVar.a(new ei.m4(3, this, (gh) this.f24392c));
                viVar.f29065t1 = kVar;
                kVar.f();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((wl0) aVar.d).scrollBy(0, this.f24391b - ((int[]) this.f24392c)[0]);
                aVar.f278c = null;
                return;
            default:
                yh.y3 y3Var = (yh.y3) this.d;
                y3Var.T1();
                yh.i2 i2Var = y3Var.f48266f0;
                int i13 = 8;
                int i14 = this.f24391b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                i2Var.setVisibility(i10);
                yh.i2 i2Var2 = y3Var.f48287r0;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                i2Var2.setVisibility(i11);
                yh.i2 i2Var3 = y3Var.f48294y0;
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
                Runnable runnable = (Runnable) this.f24392c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
