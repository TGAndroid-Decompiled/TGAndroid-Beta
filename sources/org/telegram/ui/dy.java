package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public tw F;
    public ig.n G;
    public boolean H;
    public final dw I;
    public final dw J;
    public final ey K;
    public zx f38702a;
    public a8.ng f38703b;
    public ew f38704c;
    public iw d;
    public s4.z e;
    public cy f38705f;
    public int h;
    public hw f38706n;
    public org.telegram.ui.Components.ql0 f38707r;
    public int f38708s;
    public int v;
    public org.telegram.ui.Components.c10 f38709w;
    public cw f38710x;
    public org.telegram.ui.Components.rl0 f38711y;

    public dy(Context context, ey eyVar) {
        super(context);
        this.K = eyVar;
        this.I = new dw(this, 1);
        this.J = new dw(this, 2);
    }

    public static void a(dy dyVar, ew ewVar) {
        dyVar.f38704c = ewVar;
    }

    public static s4.z b(dy dyVar) {
        return dyVar.e;
    }

    public static void c(dy dyVar, s4.z zVar) {
        dyVar.e = zVar;
    }

    public static int d(dy dyVar) {
        return dyVar.v;
    }

    public static void e(dy dyVar, int i10) {
        dyVar.v = i10;
    }

    public static void f(dy dyVar, org.telegram.ui.Components.c10 c10Var) {
        dyVar.f38709w = c10Var;
    }

    public static cy g(dy dyVar) {
        return dyVar.f38705f;
    }

    public static void h(dy dyVar, cy cyVar) {
        dyVar.f38705f = cyVar;
    }

    public static void i(dy dyVar, cw cwVar) {
        dyVar.f38710x = cwVar;
    }

    public static void j(dy dyVar, org.telegram.ui.Components.rl0 rl0Var) {
        dyVar.f38711y = rl0Var;
    }

    public static void k(dy dyVar, org.telegram.ui.Components.ql0 ql0Var) {
        dyVar.f38707r = ql0Var;
    }

    public static void l(dy dyVar, int i10) {
        dyVar.f38708s = i10;
    }

    public static ig.n m(dy dyVar) {
        return dyVar.d;
    }

    public static void n(dy dyVar, iw iwVar) {
        dyVar.d = iwVar;
    }

    public static void o(dy dyVar, hw hwVar) {
        dyVar.f38706n = hwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f38702a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f38708s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.r2) this.K).isPaused;
        if (!z11) {
            dw dwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(dwVar);
                this.f38702a.setItemAnimator(this.f38710x);
                dwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f38710x.k()) {
                    this.f38702a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(dwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        oi.q qVar;
        dy dyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ey eyVar = this.K;
            if (eyVar.f39017h3 && (dyVar = eyVar.f38998e0[0]) == this) {
                eyVar.f39105z0.g(Math.abs(dyVar.getTranslationX()) / eyVar.f38998e0[0].getMeasuredWidth(), eyVar.f38998e0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine;
            qVar.g();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        oi.q qVar;
        if (getTranslationY() != f7) {
            qVar = ((org.telegram.ui.ActionBar.r2) this.K).glassEngine;
            qVar.g();
        }
        super.setTranslationY(f7);
    }
}
