package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class b20 extends org.telegram.ui.Components.voip.k0 {
    public final f40 R0;

    public b20(f40 f40Var, LaunchActivity launchActivity, n30 n30Var, x10 x10Var, ArrayList arrayList, org.telegram.messenger.t3 t3Var, f40 f40Var2) {
        super(launchActivity, n30Var, x10Var, arrayList, t3Var, f40Var2);
        this.R0 = f40Var;
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
        f40 f40Var = this.R0;
        d40 d40Var = f40Var.A3;
        d30 d30Var = f40Var.J1;
        n30 n30Var = f40Var.L1;
        org.telegram.ui.Components.v10 v10Var = f40Var.o4;
        b20 b20Var = f40Var.Z3;
        x10 x10Var = f40Var.f47515l4;
        f40Var.f47522n2 = z10;
        int i7 = 0;
        if (f40.F5) {
            if (!z10 && b20Var.f41109b) {
                f40Var.f47524n4.H(f40Var.f47520m4, false, true);
                return;
            }
            return;
        }
        if (z10) {
            f40Var.f47486e2[0].d(1, false);
            b20Var.L0[0].d(2, false);
            if (!b20Var.f41109b) {
                n30Var.setVisibility(0);
                d30Var.setVisibility(0);
                if (d40Var != null) {
                    d40Var.setVisibility(0);
                }
            }
            f40Var.W1(true, false);
            f40Var.f47530p1.requestLayout();
            if (x10Var.getVisibility() != 0) {
                x10Var.setVisibility(0);
                v10Var.F(x10Var, true);
                v10Var.G(x10Var, false);
            } else {
                v10Var.F(x10Var, true);
                f40Var.R0(true);
            }
        } else {
            if (!b20Var.f41109b) {
                x10Var.setVisibility(8);
                v10Var.F(x10Var, false);
            } else {
                d30Var.setVisibility(8);
                n30Var.setVisibility(8);
                if (d40Var != null) {
                    d40Var.setVisibility(8);
                }
            }
            if (x10Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < x10Var.getChildCount(); i10++) {
                    View childAt = x10Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.u10) childAt).setProgressToFullscreen(b20Var.f41111c);
                }
            }
        }
        View view = f40Var.J4;
        if (!z10) {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (!f40Var.f47522n2) {
            f40Var.R0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        invalidate();
        f40 f40Var = this.R0;
        float f11 = f40Var.T3;
        b20 b20Var = f40Var.Z3;
        if (b20Var == null) {
            f10 = 0.0f;
        } else {
            f10 = b20Var.f41111c;
        }
        f40Var.H0 = org.telegram.messenger.g0.S0(Math.max(f11, f10), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29334ah, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
        f40Var.f30176b.invalidate();
        f40Var.H1(f40Var.T3);
    }
}
