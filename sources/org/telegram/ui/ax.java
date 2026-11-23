package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class ax extends FrameLayout {
    public static final int M = 0;
    public org.telegram.ui.Components.hj0 E;
    public boolean F;
    public uv G;
    public jg.m H;
    public boolean I;
    public final ev J;
    public final ev K;
    public final bx L;
    public xw f45822a;
    public a8.xa f45823b;
    public fv f45824c;
    public jv d;
    public v4.z f45825e;
    public zw f45826f;
    public int h;
    public iv f45827n;
    public org.telegram.ui.ActionBar.l5 f45828r;
    public int f45829s;
    public int f45830w;
    public org.telegram.ui.Components.vz f45831x;
    public dv f45832y;

    public ax(Context context, bx bxVar) {
        super(context);
        this.L = bxVar;
        this.J = new ev(this, 1);
        this.K = new ev(this, 2);
    }

    public static void a(ax axVar, iv ivVar) {
        axVar.f45827n = ivVar;
    }

    public static void b(ax axVar, fv fvVar) {
        axVar.f45824c = fvVar;
    }

    public static v4.z c(ax axVar) {
        return axVar.f45825e;
    }

    public static void d(ax axVar, v4.z zVar) {
        axVar.f45825e = zVar;
    }

    public static int e(ax axVar) {
        return axVar.f45830w;
    }

    public static void f(ax axVar, int i7) {
        axVar.f45830w = i7;
    }

    public static void g(ax axVar, org.telegram.ui.Components.vz vzVar) {
        axVar.f45831x = vzVar;
    }

    public static zw h(ax axVar) {
        return axVar.f45826f;
    }

    public static void i(ax axVar, zw zwVar) {
        axVar.f45826f = zwVar;
    }

    public static void j(ax axVar, dv dvVar) {
        axVar.f45832y = dvVar;
    }

    public static void k(ax axVar, org.telegram.ui.Components.hj0 hj0Var) {
        axVar.E = hj0Var;
    }

    public static void l(ax axVar, org.telegram.ui.ActionBar.l5 l5Var) {
        axVar.f45828r = l5Var;
    }

    public static void m(ax axVar, int i7) {
        axVar.f45829s = i7;
    }

    public static jg.m n(ax axVar) {
        return axVar.d;
    }

    public static void o(ax axVar, jv jvVar) {
        axVar.d = jvVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.f45822a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.f45829s;
        if (i7 != 0 && i7 != 7 && i7 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.g2) this.L).isPaused;
        if (!z11) {
            ev evVar = this.K;
            if (z10) {
                org.telegram.messenger.g0.r(evVar);
                this.f45822a.setItemAnimator(this.f45832y);
                evVar.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.f45832y.k()) {
                    this.f45822a.setItemAnimator(null);
                }
                org.telegram.messenger.g0.h3(evVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        ri.q qVar;
        ax axVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            bx bxVar = this.L;
            if (bxVar.j3 && (axVar = bxVar.f46549f0[0]) == this) {
                bxVar.A0.h(Math.abs(axVar.getTranslationX()) / bxVar.f46549f0[0].getMeasuredWidth(), bxVar.f46549f0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine;
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
