package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public ww F;
    public hg.m G;
    public boolean H;
    public final gw I;
    public final gw J;
    public final ey K;
    public zx f36333a;
    public a5.a f36334b;
    public hw f36335c;
    public lw d;
    public s4.y e;
    public cy f36336f;
    public int h;
    public kw f36337n;
    public org.telegram.ui.Components.ll0 f36338r;
    public int f36339s;
    public int v;
    public org.telegram.ui.Components.b10 f36340w;
    public fw f36341x;
    public org.telegram.ui.Components.nl0 f36342y;

    public dy(Context context, ey eyVar) {
        super(context);
        this.K = eyVar;
        this.I = new gw(this, 1);
        this.J = new gw(this, 2);
    }

    public static void a(dy dyVar, hw hwVar) {
        dyVar.f36335c = hwVar;
    }

    public static s4.y b(dy dyVar) {
        return dyVar.e;
    }

    public static void c(dy dyVar, s4.y yVar) {
        dyVar.e = yVar;
    }

    public static int d(dy dyVar) {
        return dyVar.v;
    }

    public static void e(dy dyVar, int i10) {
        dyVar.v = i10;
    }

    public static void f(dy dyVar, org.telegram.ui.Components.b10 b10Var) {
        dyVar.f36340w = b10Var;
    }

    public static cy g(dy dyVar) {
        return dyVar.f36336f;
    }

    public static void h(dy dyVar, cy cyVar) {
        dyVar.f36336f = cyVar;
    }

    public static void i(dy dyVar, fw fwVar) {
        dyVar.f36341x = fwVar;
    }

    public static void j(dy dyVar, org.telegram.ui.Components.nl0 nl0Var) {
        dyVar.f36342y = nl0Var;
    }

    public static void k(dy dyVar, org.telegram.ui.Components.ll0 ll0Var) {
        dyVar.f36338r = ll0Var;
    }

    public static void l(dy dyVar, int i10) {
        dyVar.f36339s = i10;
    }

    public static hg.m m(dy dyVar) {
        return dyVar.d;
    }

    public static void n(dy dyVar, lw lwVar) {
        dyVar.d = lwVar;
    }

    public static void o(dy dyVar, kw kwVar) {
        dyVar.f36337n = kwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f36333a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f36339s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.n2) this.K).isPaused;
        if (!z11) {
            gw gwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(gwVar);
                this.f36333a.setItemAnimator(this.f36341x);
                gwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f36341x.k()) {
                    this.f36333a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(gwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        dy dyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ey eyVar = this.K;
            if (eyVar.f36649h3 && (dyVar = eyVar.f36630e0[0]) == this) {
                eyVar.f36736z0.g(Math.abs(dyVar.getTranslationX()) / eyVar.f36630e0[0].getMeasuredWidth(), eyVar.f36630e0[1].h);
            }
            eyVar.j3();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.j3();
        }
        super.setTranslationY(f7);
    }
}
