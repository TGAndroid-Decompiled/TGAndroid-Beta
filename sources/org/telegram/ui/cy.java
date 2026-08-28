package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cy extends FrameLayout {
    public static final int H = 0;
    public boolean A;
    public ww B;
    public of.m C;
    public boolean D;
    public final gw E;
    public final gw F;
    public final dy G;
    public yx f37350a;
    public a6.a f37351b;
    public hw f37352c;
    public lw d;
    public f2.h0 f37353e;
    public ay f37354f;
    public int h;
    public kw f37355n;
    public c2.y f37356r;
    public int f37357s;
    public int v;
    public org.telegram.ui.Components.e00 f37358w;
    public fw f37359x;
    public org.telegram.ui.Components.dk0 f37360y;

    public cy(Context context, dy dyVar) {
        super(context);
        this.G = dyVar;
        this.E = new gw(this, 1);
        this.F = new gw(this, 2);
    }

    public static void a(cy cyVar, hw hwVar) {
        cyVar.f37352c = hwVar;
    }

    public static f2.h0 b(cy cyVar) {
        return cyVar.f37353e;
    }

    public static void c(cy cyVar, f2.h0 h0Var) {
        cyVar.f37353e = h0Var;
    }

    public static int d(cy cyVar) {
        return cyVar.v;
    }

    public static void e(cy cyVar, int i9) {
        cyVar.v = i9;
    }

    public static void f(cy cyVar, org.telegram.ui.Components.e00 e00Var) {
        cyVar.f37358w = e00Var;
    }

    public static ay g(cy cyVar) {
        return cyVar.f37354f;
    }

    public static void h(cy cyVar, ay ayVar) {
        cyVar.f37354f = ayVar;
    }

    public static void i(cy cyVar, fw fwVar) {
        cyVar.f37359x = fwVar;
    }

    public static void j(cy cyVar, org.telegram.ui.Components.dk0 dk0Var) {
        cyVar.f37360y = dk0Var;
    }

    public static void k(cy cyVar, c2.y yVar) {
        cyVar.f37356r = yVar;
    }

    public static void l(cy cyVar, int i9) {
        cyVar.f37357s = i9;
    }

    public static of.m m(cy cyVar) {
        return cyVar.d;
    }

    public static void n(cy cyVar, lw lwVar) {
        cyVar.d = lwVar;
    }

    public static void o(cy cyVar, kw kwVar) {
        cyVar.f37355n = kwVar;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ((FrameLayout.LayoutParams) this.f37350a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i9, i10);
    }

    public final boolean p() {
        int i9 = this.f37357s;
        if (i9 != 0 && i9 != 7 && i9 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.o2) this.G).isPaused;
        if (!z11) {
            gw gwVar = this.F;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(gwVar);
                this.f37350a.setItemAnimator(this.f37359x);
                gwVar.run();
            } else if (this.D) {
            } else {
                this.D = true;
                if (!this.f37359x.k()) {
                    this.f37350a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(gwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        cy cyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            dy dyVar = this.G;
            if (dyVar.f37642c3 && (cyVar = dyVar.f37629a0[0]) == this) {
                dyVar.f37735v0.g(Math.abs(cyVar.getTranslationX()) / dyVar.f37629a0[0].getMeasuredWidth(), dyVar.f37629a0[1].h);
            }
            dyVar.m3();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            this.G.m3();
        }
        super.setTranslationY(f10);
    }
}
