package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ey extends FrameLayout {
    public static final int H = 0;
    public boolean A;
    public yw B;
    public rf.l C;
    public boolean D;
    public final iw E;
    public final iw F;
    public final fy G;
    public ay f37921a;
    public ag.j2 f37922b;
    public jw f37923c;
    public nw d;
    public f2.e0 f37924e;
    public dy f37925f;
    public int h;
    public mw f37926n;
    public c2.z f37927r;
    public int f37928s;
    public int v;
    public org.telegram.ui.Components.p00 f37929w;
    public hw f37930x;
    public org.telegram.ui.Components.pk0 f37931y;

    public ey(Context context, fy fyVar) {
        super(context);
        this.G = fyVar;
        this.E = new iw(this, 1);
        this.F = new iw(this, 2);
    }

    public static void a(ey eyVar, jw jwVar) {
        eyVar.f37923c = jwVar;
    }

    public static f2.e0 b(ey eyVar) {
        return eyVar.f37924e;
    }

    public static void c(ey eyVar, f2.e0 e0Var) {
        eyVar.f37924e = e0Var;
    }

    public static int d(ey eyVar) {
        return eyVar.v;
    }

    public static void e(ey eyVar, int i10) {
        eyVar.v = i10;
    }

    public static void f(ey eyVar, org.telegram.ui.Components.p00 p00Var) {
        eyVar.f37929w = p00Var;
    }

    public static dy g(ey eyVar) {
        return eyVar.f37925f;
    }

    public static void h(ey eyVar, dy dyVar) {
        eyVar.f37925f = dyVar;
    }

    public static void i(ey eyVar, hw hwVar) {
        eyVar.f37930x = hwVar;
    }

    public static void j(ey eyVar, org.telegram.ui.Components.pk0 pk0Var) {
        eyVar.f37931y = pk0Var;
    }

    public static void k(ey eyVar, c2.z zVar) {
        eyVar.f37927r = zVar;
    }

    public static void l(ey eyVar, int i10) {
        eyVar.f37928s = i10;
    }

    public static rf.l m(ey eyVar) {
        return eyVar.d;
    }

    public static void n(ey eyVar, nw nwVar) {
        eyVar.d = nwVar;
    }

    public static void o(ey eyVar, mw mwVar) {
        eyVar.f37926n = mwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f37921a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f37928s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.o2) this.G).isPaused;
        if (!z11) {
            iw iwVar = this.F;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(iwVar);
                this.f37921a.setItemAnimator(this.f37930x);
                iwVar.run();
            } else if (this.D) {
            } else {
                this.D = true;
                if (!this.f37930x.k()) {
                    this.f37921a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(iwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f9) {
        ey eyVar;
        if (getTranslationX() != f9) {
            super.setTranslationX(f9);
            fy fyVar = this.G;
            if (fyVar.c3 && (eyVar = fyVar.f38256a0[0]) == this) {
                fyVar.f38362v0.g(Math.abs(eyVar.getTranslationX()) / fyVar.f38256a0[0].getMeasuredWidth(), fyVar.f38256a0[1].h);
            }
            fyVar.m3();
        }
    }

    @Override
    public void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            this.G.m3();
        }
        super.setTranslationY(f9);
    }
}
