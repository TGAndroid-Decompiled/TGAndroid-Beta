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
    public xx f35443a;
    public a5.a f35444b;
    public fw f35445c;
    public jw d;
    public s4.y e;
    public zx f35446f;
    public int h;
    public iw f35447n;
    public org.telegram.ui.Components.ml0 f35448r;
    public int f35449s;
    public int v;
    public org.telegram.ui.Components.b10 f35450w;
    public dw f35451x;
    public org.telegram.ui.Components.ol0 f35452y;

    public ay(Context context, cy cyVar) {
        super(context);
        this.K = cyVar;
        this.I = new ew(this, 1);
        this.J = new ew(this, 2);
    }

    public static void a(ay ayVar, fw fwVar) {
        ayVar.f35445c = fwVar;
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
        ayVar.f35450w = b10Var;
    }

    public static zx g(ay ayVar) {
        return ayVar.f35446f;
    }

    public static void h(ay ayVar, zx zxVar) {
        ayVar.f35446f = zxVar;
    }

    public static void i(ay ayVar, dw dwVar) {
        ayVar.f35451x = dwVar;
    }

    public static void j(ay ayVar, org.telegram.ui.Components.ol0 ol0Var) {
        ayVar.f35452y = ol0Var;
    }

    public static void k(ay ayVar, org.telegram.ui.Components.ml0 ml0Var) {
        ayVar.f35448r = ml0Var;
    }

    public static void l(ay ayVar, int i10) {
        ayVar.f35449s = i10;
    }

    public static hg.m m(ay ayVar) {
        return ayVar.d;
    }

    public static void n(ay ayVar, jw jwVar) {
        ayVar.d = jwVar;
    }

    public static void o(ay ayVar, iw iwVar) {
        ayVar.f35447n = iwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f35443a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f35449s;
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
                this.f35443a.setItemAnimator(this.f35451x);
                ewVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f35451x.k()) {
                    this.f35443a.setItemAnimator(null);
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
            if (cyVar.f36111h3 && (ayVar = cyVar.f36092e0[0]) == this) {
                cyVar.f36198z0.g(Math.abs(ayVar.getTranslationX()) / cyVar.f36092e0[0].getMeasuredWidth(), cyVar.f36092e0[1].h);
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
