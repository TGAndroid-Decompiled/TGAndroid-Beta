package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class a20 extends org.telegram.ui.Components.voip.l0 {
    public final e40 R0;

    public a20(e40 e40Var, LaunchActivity launchActivity, m30 m30Var, w10 w10Var, ArrayList arrayList, org.telegram.messenger.t3 t3Var, e40 e40Var2) {
        super(launchActivity, m30Var, w10Var, arrayList, t3Var, e40Var2);
        this.R0 = e40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.R0.Y4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void i(boolean z10) {
        e40 e40Var = this.R0;
        c40 c40Var = e40Var.A3;
        c30 c30Var = e40Var.J1;
        m30 m30Var = e40Var.L1;
        org.telegram.ui.Components.t10 t10Var = e40Var.o4;
        a20 a20Var = e40Var.Z3;
        w10 w10Var = e40Var.f47365l4;
        e40Var.f47372n2 = z10;
        int i7 = 0;
        if (e40.F5) {
            if (!z10 && a20Var.f41003b) {
                e40Var.f47374n4.H(e40Var.f47370m4, false, true);
                return;
            }
            return;
        }
        if (z10) {
            e40Var.f47336e2[0].d(1, false);
            a20Var.L0[0].d(2, false);
            if (!a20Var.f41003b) {
                m30Var.setVisibility(0);
                c30Var.setVisibility(0);
                if (c40Var != null) {
                    c40Var.setVisibility(0);
                }
            }
            e40Var.V1(true, false);
            e40Var.f47380p1.requestLayout();
            if (w10Var.getVisibility() != 0) {
                w10Var.setVisibility(0);
                t10Var.F(w10Var, true);
                t10Var.G(w10Var, false);
            } else {
                t10Var.F(w10Var, true);
                e40Var.R0(true);
            }
        } else {
            if (!a20Var.f41003b) {
                w10Var.setVisibility(8);
                t10Var.F(w10Var, false);
            } else {
                c30Var.setVisibility(8);
                m30Var.setVisibility(8);
                if (c40Var != null) {
                    c40Var.setVisibility(8);
                }
            }
            if (w10Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < w10Var.getChildCount(); i10++) {
                    View childAt = w10Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.s10) childAt).setProgressToFullscreen(a20Var.f41005c);
                }
            }
        }
        View view = e40Var.J4;
        if (!z10) {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (!e40Var.f47372n2) {
            e40Var.R0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        invalidate();
        e40 e40Var = this.R0;
        float f11 = e40Var.T3;
        a20 a20Var = e40Var.Z3;
        if (a20Var == null) {
            f10 = 0.0f;
        } else {
            f10 = a20Var.f41005c;
        }
        e40Var.H0 = org.telegram.messenger.g0.S0(Math.max(f11, f10), 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29404ah, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false));
        e40Var.f30226b.invalidate();
        e40Var.H1(e40Var.T3);
    }
}
