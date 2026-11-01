package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jh extends AnimatorListenerAdapter {
    public final int f27427a;
    public final int f27428b;
    public final Object f27429c;
    public final Object d;

    public jh(Object obj, int i10, Object obj2, int i11) {
        this.f27427a = i11;
        this.d = obj;
        this.f27428b = i10;
        this.f27429c = obj2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        int i12;
        switch (this.f27427a) {
            case 0:
                bi biVar = (bi) this.d;
                biVar.f24812s2.setAlpha(0.0f);
                biVar.f24812s2.setTranslationY(org.telegram.messenger.i0.L(78.0f) + this.f27428b);
                mh mhVar = biVar.V1;
                uh uhVar = biVar.f24812s2;
                Float valueOf = Float.valueOf(1.0f);
                mhVar.getClass();
                mhVar.a(uhVar, valueOf);
                biVar.R2.setAlpha(0.0f);
                o1.j jVar = new o1.j((Object) biVar.f24816t2, (o1.h) o1.j.f13943p, 0.0f);
                jVar.f13958m.a(0.75f);
                jVar.f13958m.b(500.0f);
                jVar.b(new a7(this, 3));
                jVar.a(new za(2, this, (mg) this.f27429c));
                biVar.f24793n3 = jVar;
                jVar.h();
                return;
            case 1:
                a5.a aVar = (a5.a) this.d;
                ((uk0) aVar.d).scrollBy(0, this.f27428b - ((int[]) this.f27429c)[0]);
                aVar.f282c = null;
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.d;
                e4Var.P1();
                rh.m2 m2Var = e4Var.Y1;
                int i13 = 8;
                int i14 = this.f27428b;
                if (i14 == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                m2Var.setVisibility(i10);
                rh.m2 m2Var2 = e4Var.f46831k2;
                if (i14 == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                m2Var2.setVisibility(i11);
                rh.m2 m2Var3 = e4Var.f46848t2;
                if (i14 == 2) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                m2Var3.setVisibility(i12);
                rh.m2 m2Var4 = e4Var.f46850v2;
                if (i14 == 3) {
                    i13 = 0;
                }
                m2Var4.setVisibility(i13);
                e4Var.u2();
                e4Var.U2 = null;
                Runnable runnable = (Runnable) this.f27429c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
