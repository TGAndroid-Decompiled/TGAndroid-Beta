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
    public my f36679a;
    public a5.a f36680b;
    public tw f36681c;
    public xw d;
    public s4.y e;
    public oy f36682f;
    public int h;
    public ww f36683n;
    public org.telegram.ui.Components.zk0 f36684r;
    public int f36685s;
    public int v;
    public org.telegram.ui.Components.u00 f36686w;
    public rw f36687x;
    public org.telegram.ui.Components.bl0 f36688y;

    public py(Context context, qy qyVar) {
        super(context);
        this.K = qyVar;
        this.I = new sw(this, 1);
        this.J = new sw(this, 2);
    }

    public static void a(py pyVar, tw twVar) {
        pyVar.f36681c = twVar;
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
        pyVar.f36686w = u00Var;
    }

    public static oy g(py pyVar) {
        return pyVar.f36682f;
    }

    public static void h(py pyVar, oy oyVar) {
        pyVar.f36682f = oyVar;
    }

    public static void i(py pyVar, rw rwVar) {
        pyVar.f36687x = rwVar;
    }

    public static void j(py pyVar, org.telegram.ui.Components.bl0 bl0Var) {
        pyVar.f36688y = bl0Var;
    }

    public static void k(py pyVar, org.telegram.ui.Components.zk0 zk0Var) {
        pyVar.f36684r = zk0Var;
    }

    public static void l(py pyVar, int i10) {
        pyVar.f36685s = i10;
    }

    public static gg.m m(py pyVar) {
        return pyVar.d;
    }

    public static void n(py pyVar, xw xwVar) {
        pyVar.d = xwVar;
    }

    public static void o(py pyVar, ww wwVar) {
        pyVar.f36683n = wwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f36679a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f36685s;
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
                this.f36679a.setItemAnimator(this.f36687x);
                swVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f36687x.k()) {
                    this.f36679a.setItemAnimator(null);
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
            if (qyVar.f37035g3 && (pyVar = qyVar.f37021e0[0]) == this) {
                qyVar.f37125z0.g(Math.abs(pyVar.getTranslationX()) / qyVar.f37021e0[0].getMeasuredWidth(), qyVar.f37021e0[1].h);
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
