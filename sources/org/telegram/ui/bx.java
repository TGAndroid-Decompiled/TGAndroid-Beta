package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class bx extends FrameLayout {
    public static final int M = 0;
    public org.telegram.ui.Components.hj0 E;
    public boolean F;
    public vv G;
    public jg.m H;
    public boolean I;
    public final fv J;
    public final fv K;
    public final cx L;
    public yw f46325a;
    public a8.xa f46326b;
    public gv f46327c;
    public kv d;
    public v4.z f46328e;
    public ax f46329f;
    public int h;
    public jv f46330n;
    public org.telegram.ui.ActionBar.k5 f46331r;
    public int f46332s;
    public int f46333w;
    public org.telegram.ui.Components.yz f46334x;
    public ev f46335y;

    public bx(Context context, cx cxVar) {
        super(context);
        this.L = cxVar;
        this.J = new fv(this, 1);
        this.K = new fv(this, 2);
    }

    public static void a(bx bxVar, jv jvVar) {
        bxVar.f46330n = jvVar;
    }

    public static void b(bx bxVar, gv gvVar) {
        bxVar.f46327c = gvVar;
    }

    public static v4.z c(bx bxVar) {
        return bxVar.f46328e;
    }

    public static void d(bx bxVar, v4.z zVar) {
        bxVar.f46328e = zVar;
    }

    public static int e(bx bxVar) {
        return bxVar.f46333w;
    }

    public static void f(bx bxVar, int i7) {
        bxVar.f46333w = i7;
    }

    public static void g(bx bxVar, org.telegram.ui.Components.yz yzVar) {
        bxVar.f46334x = yzVar;
    }

    public static ax h(bx bxVar) {
        return bxVar.f46329f;
    }

    public static void i(bx bxVar, ax axVar) {
        bxVar.f46329f = axVar;
    }

    public static void j(bx bxVar, ev evVar) {
        bxVar.f46335y = evVar;
    }

    public static void k(bx bxVar, org.telegram.ui.Components.hj0 hj0Var) {
        bxVar.E = hj0Var;
    }

    public static void l(bx bxVar, org.telegram.ui.ActionBar.k5 k5Var) {
        bxVar.f46331r = k5Var;
    }

    public static void m(bx bxVar, int i7) {
        bxVar.f46332s = i7;
    }

    public static jg.m n(bx bxVar) {
        return bxVar.d;
    }

    public static void o(bx bxVar, kv kvVar) {
        bxVar.d = kvVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.f46325a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.f46332s;
        if (i7 != 0 && i7 != 7 && i7 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.g2) this.L).isPaused;
        if (!z11) {
            fv fvVar = this.K;
            if (z10) {
                org.telegram.messenger.g0.r(fvVar);
                this.f46325a.setItemAnimator(this.f46335y);
                fvVar.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.f46335y.k()) {
                    this.f46325a.setItemAnimator(null);
                }
                org.telegram.messenger.g0.h3(fvVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        ri.q qVar;
        bx bxVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            cx cxVar = this.L;
            if (cxVar.j3 && (bxVar = cxVar.f46722f0[0]) == this) {
                cxVar.A0.h(Math.abs(bxVar.getTranslationX()) / cxVar.f46722f0[0].getMeasuredWidth(), cxVar.f46722f0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.g2) cxVar).glassEngine;
            qVar.g();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        ri.q qVar;
        if (getTranslationY() != f10) {
            qVar = ((org.telegram.ui.ActionBar.g2) this.L).glassEngine;
            qVar.g();
        }
        super.setTranslationY(f10);
    }
}
