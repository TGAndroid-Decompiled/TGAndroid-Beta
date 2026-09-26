package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class py extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public ix F;
    public gg.m G;
    public boolean H;
    public final sw I;
    public final sw J;
    public final qy K;
    public my f36694a;
    public a5.a f36695b;
    public tw f36696c;
    public xw d;
    public s4.y e;
    public oy f36697f;
    public int h;
    public ww f36698n;
    public org.telegram.ui.Components.zk0 f36699r;
    public int f36700s;
    public int v;
    public org.telegram.ui.Components.u00 f36701w;
    public rw f36702x;
    public org.telegram.ui.Components.bl0 f36703y;

    public py(Context context, qy qyVar) {
        super(context);
        this.K = qyVar;
        this.I = new sw(this, 1);
        this.J = new sw(this, 2);
    }

    public static void a(py pyVar, tw twVar) {
        pyVar.f36696c = twVar;
    }

    public static s4.y b(py pyVar) {
        return pyVar.e;
    }

    public static void c(py pyVar, s4.y yVar) {
        pyVar.e = yVar;
    }

    public static int d(py pyVar) {
        return pyVar.v;
    }

    public static void e(py pyVar, int i10) {
        pyVar.v = i10;
    }

    public static void f(py pyVar, org.telegram.ui.Components.u00 u00Var) {
        pyVar.f36701w = u00Var;
    }

    public static oy g(py pyVar) {
        return pyVar.f36697f;
    }

    public static void h(py pyVar, oy oyVar) {
        pyVar.f36697f = oyVar;
    }

    public static void i(py pyVar, rw rwVar) {
        pyVar.f36702x = rwVar;
    }

    public static void j(py pyVar, org.telegram.ui.Components.bl0 bl0Var) {
        pyVar.f36703y = bl0Var;
    }

    public static void k(py pyVar, org.telegram.ui.Components.zk0 zk0Var) {
        pyVar.f36699r = zk0Var;
    }

    public static void l(py pyVar, int i10) {
        pyVar.f36700s = i10;
    }

    public static gg.m m(py pyVar) {
        return pyVar.d;
    }

    public static void n(py pyVar, xw xwVar) {
        pyVar.d = xwVar;
    }

    public static void o(py pyVar, ww wwVar) {
        pyVar.f36698n = wwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f36694a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f36700s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.m2) this.K).isPaused;
        if (!z11) {
            sw swVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(swVar);
                this.f36694a.setItemAnimator(this.f36702x);
                swVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f36702x.k()) {
                    this.f36694a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(swVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        py pyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            qy qyVar = this.K;
            if (qyVar.f37047g3 && (pyVar = qyVar.f37033e0[0]) == this) {
                qyVar.f37137z0.g(Math.abs(pyVar.getTranslationX()) / qyVar.f37033e0[0].getMeasuredWidth(), qyVar.f37033e0[1].h);
            }
            qyVar.m3();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.m3();
        }
        super.setTranslationY(f7);
    }
}
