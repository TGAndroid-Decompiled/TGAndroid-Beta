package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class py extends FrameLayout {
    public static final int I = 0;
    public boolean B;
    public jx C;
    public tf.k D;
    public boolean E;
    public final tw F;
    public final tw G;
    public final qy H;
    public my f37246a;
    public b4.e0 f37247b;
    public uw f37248c;
    public yw d;
    public f2.e0 e;
    public oy f37249f;
    public int h;
    public xw f37250n;
    public c2.z f37251r;
    public int f37252s;
    public int v;
    public org.telegram.ui.Components.u00 f37253w;
    public sw f37254x;
    public org.telegram.ui.Components.yk0 f37255y;

    public py(Context context, qy qyVar) {
        super(context);
        this.H = qyVar;
        this.F = new tw(this, 1);
        this.G = new tw(this, 2);
    }

    public static void a(py pyVar, uw uwVar) {
        pyVar.f37248c = uwVar;
    }

    public static f2.e0 b(py pyVar) {
        return pyVar.e;
    }

    public static void c(py pyVar, f2.e0 e0Var) {
        pyVar.e = e0Var;
    }

    public static int d(py pyVar) {
        return pyVar.v;
    }

    public static void e(py pyVar, int i10) {
        pyVar.v = i10;
    }

    public static void f(py pyVar, org.telegram.ui.Components.u00 u00Var) {
        pyVar.f37253w = u00Var;
    }

    public static oy g(py pyVar) {
        return pyVar.f37249f;
    }

    public static void h(py pyVar, oy oyVar) {
        pyVar.f37249f = oyVar;
    }

    public static void i(py pyVar, sw swVar) {
        pyVar.f37254x = swVar;
    }

    public static void j(py pyVar, org.telegram.ui.Components.yk0 yk0Var) {
        pyVar.f37255y = yk0Var;
    }

    public static void k(py pyVar, c2.z zVar) {
        pyVar.f37251r = zVar;
    }

    public static void l(py pyVar, int i10) {
        pyVar.f37252s = i10;
    }

    public static tf.k m(py pyVar) {
        return pyVar.d;
    }

    public static void n(py pyVar, yw ywVar) {
        pyVar.d = ywVar;
    }

    public static void o(py pyVar, xw xwVar) {
        pyVar.f37250n = xwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f37246a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f37252s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z4) {
        boolean z10;
        z10 = ((org.telegram.ui.ActionBar.p2) this.H).isPaused;
        if (!z10) {
            tw twVar = this.G;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(twVar);
                this.f37246a.setItemAnimator(this.f37254x);
                twVar.run();
            } else if (this.E) {
            } else {
                this.E = true;
                if (!this.f37254x.k()) {
                    this.f37246a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(twVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        py pyVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            qy qyVar = this.H;
            if (qyVar.f37540d3 && (pyVar = qyVar.f37527b0[0]) == this) {
                qyVar.f37633w0.g(Math.abs(pyVar.getTranslationX()) / qyVar.f37527b0[0].getMeasuredWidth(), qyVar.f37527b0[1].h);
            }
            qyVar.m3();
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
