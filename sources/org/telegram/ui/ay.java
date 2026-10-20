package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ay extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public uw F;
    public hg.m G;
    public boolean H;
    public final ew I;
    public final ew J;
    public final cy K;
    public xx f35442a;
    public a5.a f35443b;
    public fw f35444c;
    public jw d;
    public s4.y e;
    public zx f35445f;
    public int h;
    public iw f35446n;
    public org.telegram.ui.Components.ml0 f35447r;
    public int f35448s;
    public int v;
    public org.telegram.ui.Components.b10 f35449w;
    public dw f35450x;
    public org.telegram.ui.Components.ol0 f35451y;

    public ay(Context context, cy cyVar) {
        super(context);
        this.K = cyVar;
        this.I = new ew(this, 1);
        this.J = new ew(this, 2);
    }

    public static void a(ay ayVar, fw fwVar) {
        ayVar.f35444c = fwVar;
    }

    public static s4.y b(ay ayVar) {
        return ayVar.e;
    }

    public static void c(ay ayVar, s4.y yVar) {
        ayVar.e = yVar;
    }

    public static int d(ay ayVar) {
        return ayVar.v;
    }

    public static void e(ay ayVar, int i10) {
        ayVar.v = i10;
    }

    public static void f(ay ayVar, org.telegram.ui.Components.b10 b10Var) {
        ayVar.f35449w = b10Var;
    }

    public static zx g(ay ayVar) {
        return ayVar.f35445f;
    }

    public static void h(ay ayVar, zx zxVar) {
        ayVar.f35445f = zxVar;
    }

    public static void i(ay ayVar, dw dwVar) {
        ayVar.f35450x = dwVar;
    }

    public static void j(ay ayVar, org.telegram.ui.Components.ol0 ol0Var) {
        ayVar.f35451y = ol0Var;
    }

    public static void k(ay ayVar, org.telegram.ui.Components.ml0 ml0Var) {
        ayVar.f35447r = ml0Var;
    }

    public static void l(ay ayVar, int i10) {
        ayVar.f35448s = i10;
    }

    public static hg.m m(ay ayVar) {
        return ayVar.d;
    }

    public static void n(ay ayVar, jw jwVar) {
        ayVar.d = jwVar;
    }

    public static void o(ay ayVar, iw iwVar) {
        ayVar.f35446n = iwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f35442a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f35448s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.n2) this.K).isPaused;
        if (!z11) {
            ew ewVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(ewVar);
                this.f35442a.setItemAnimator(this.f35450x);
                ewVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f35450x.k()) {
                    this.f35442a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(ewVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        ay ayVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            cy cyVar = this.K;
            if (cyVar.f36110h3 && (ayVar = cyVar.f36091e0[0]) == this) {
                cyVar.f36197z0.g(Math.abs(ayVar.getTranslationX()) / cyVar.f36091e0[0].getMeasuredWidth(), cyVar.f36091e0[1].h);
            }
            cyVar.j3();
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
