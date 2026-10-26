package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ay extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public rw F;
    public ig.n G;
    public boolean H;
    public final bw I;
    public final bw J;
    public final cy K;
    public wx f37913a;
    public a8.ng f37914b;
    public cw f37915c;
    public gw d;
    public s4.z e;
    public zx f37916f;
    public int h;
    public fw f37917n;
    public org.telegram.ui.Components.pl0 f37918r;
    public int f37919s;
    public int v;
    public org.telegram.ui.Components.c10 f37920w;
    public aw f37921x;
    public org.telegram.ui.Components.ql0 f37922y;

    public ay(Context context, cy cyVar) {
        super(context);
        this.K = cyVar;
        this.I = new bw(this, 1);
        this.J = new bw(this, 2);
    }

    public static void a(ay ayVar, cw cwVar) {
        ayVar.f37915c = cwVar;
    }

    public static s4.z b(ay ayVar) {
        return ayVar.e;
    }

    public static void c(ay ayVar, s4.z zVar) {
        ayVar.e = zVar;
    }

    public static int d(ay ayVar) {
        return ayVar.v;
    }

    public static void e(ay ayVar, int i10) {
        ayVar.v = i10;
    }

    public static void f(ay ayVar, org.telegram.ui.Components.c10 c10Var) {
        ayVar.f37920w = c10Var;
    }

    public static zx g(ay ayVar) {
        return ayVar.f37916f;
    }

    public static void h(ay ayVar, zx zxVar) {
        ayVar.f37916f = zxVar;
    }

    public static void i(ay ayVar, aw awVar) {
        ayVar.f37921x = awVar;
    }

    public static void j(ay ayVar, org.telegram.ui.Components.ql0 ql0Var) {
        ayVar.f37922y = ql0Var;
    }

    public static void k(ay ayVar, org.telegram.ui.Components.pl0 pl0Var) {
        ayVar.f37918r = pl0Var;
    }

    public static void l(ay ayVar, int i10) {
        ayVar.f37919s = i10;
    }

    public static ig.n m(ay ayVar) {
        return ayVar.d;
    }

    public static void n(ay ayVar, gw gwVar) {
        ayVar.d = gwVar;
    }

    public static void o(ay ayVar, fw fwVar) {
        ayVar.f37917n = fwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f37913a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f37919s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.r2) this.K).isPaused;
        if (!z11) {
            bw bwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(bwVar);
                this.f37913a.setItemAnimator(this.f37921x);
                bwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f37921x.k()) {
                    this.f37913a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(bwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        oi.q qVar;
        ay ayVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            cy cyVar = this.K;
            if (cyVar.f38605h3 && (ayVar = cyVar.f38586e0[0]) == this) {
                cyVar.f38693z0.g(Math.abs(ayVar.getTranslationX()) / cyVar.f38586e0[0].getMeasuredWidth(), cyVar.f38586e0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.r2) cyVar).glassEngine;
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
