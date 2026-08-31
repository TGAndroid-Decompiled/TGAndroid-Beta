package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class oy extends FrameLayout {
    public static final int I = 0;
    public boolean B;
    public ix C;
    public uf.k D;
    public boolean E;
    public final sw F;
    public final sw G;
    public final py H;
    public ly f39866a;
    public b4.e0 f39867b;
    public tw f39868c;
    public xw d;
    public f2.f0 f39869e;
    public ny f39870f;
    public int h;
    public ww f39871n;
    public c2.y f39872r;
    public int f39873s;
    public int v;
    public org.telegram.ui.Components.u00 f39874w;
    public rw f39875x;
    public org.telegram.ui.Components.al0 f39876y;

    public oy(Context context, py pyVar) {
        super(context);
        this.H = pyVar;
        this.F = new sw(this, 1);
        this.G = new sw(this, 2);
    }

    public static void a(oy oyVar, tw twVar) {
        oyVar.f39868c = twVar;
    }

    public static f2.f0 b(oy oyVar) {
        return oyVar.f39869e;
    }

    public static void c(oy oyVar, f2.f0 f0Var) {
        oyVar.f39869e = f0Var;
    }

    public static int d(oy oyVar) {
        return oyVar.v;
    }

    public static void e(oy oyVar, int i10) {
        oyVar.v = i10;
    }

    public static void f(oy oyVar, org.telegram.ui.Components.u00 u00Var) {
        oyVar.f39874w = u00Var;
    }

    public static ny g(oy oyVar) {
        return oyVar.f39870f;
    }

    public static void h(oy oyVar, ny nyVar) {
        oyVar.f39870f = nyVar;
    }

    public static void i(oy oyVar, rw rwVar) {
        oyVar.f39875x = rwVar;
    }

    public static void j(oy oyVar, org.telegram.ui.Components.al0 al0Var) {
        oyVar.f39876y = al0Var;
    }

    public static void k(oy oyVar, c2.y yVar) {
        oyVar.f39872r = yVar;
    }

    public static void l(oy oyVar, int i10) {
        oyVar.f39873s = i10;
    }

    public static uf.k m(oy oyVar) {
        return oyVar.d;
    }

    public static void n(oy oyVar, xw xwVar) {
        oyVar.d = xwVar;
    }

    public static void o(oy oyVar, ww wwVar) {
        oyVar.f39871n = wwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f39866a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f39873s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z4) {
        boolean z10;
        z10 = ((org.telegram.ui.ActionBar.p2) this.H).isPaused;
        if (!z10) {
            sw swVar = this.G;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(swVar);
                this.f39866a.setItemAnimator(this.f39875x);
                swVar.run();
            } else if (this.E) {
            } else {
                this.E = true;
                if (!this.f39875x.k()) {
                    this.f39866a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(swVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        oy oyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            py pyVar = this.H;
            if (pyVar.f40198d3 && (oyVar = pyVar.f40185b0[0]) == this) {
                pyVar.f40292w0.g(Math.abs(oyVar.getTranslationX()) / pyVar.f40185b0[0].getMeasuredWidth(), pyVar.f40185b0[1].h);
            }
            pyVar.m3();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            this.H.m3();
        }
        super.setTranslationY(f10);
    }
}
