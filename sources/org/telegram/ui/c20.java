package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class c20 extends org.telegram.ui.Components.voip.k0 {
    public final f40 Q0;

    public c20(f40 f40Var, LaunchActivity launchActivity, n30 n30Var, y10 y10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, f40 f40Var2) {
        super(launchActivity, n30Var, y10Var, arrayList, r3Var, f40Var2);
        this.Q0 = f40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.T4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void i(boolean z9) {
        f40 f40Var = this.Q0;
        d40 d40Var = f40Var.f45594v3;
        c30 c30Var = f40Var.I1;
        n30 n30Var = f40Var.K1;
        org.telegram.ui.Components.h10 h10Var = f40Var.f45540j4;
        c20 c20Var = f40Var.U3;
        y10 y10Var = f40Var.f45529g4;
        f40Var.f45551m2 = z9;
        int i7 = 0;
        if (f40.A5) {
            if (!z9 && c20Var.f39302b) {
                f40Var.f45537i4.H(f40Var.f45533h4, false, true);
                return;
            }
            return;
        }
        if (z9) {
            f40Var.d2[0].d(1, false);
            c20Var.K0[0].d(2, false);
            if (!c20Var.f39302b) {
                n30Var.setVisibility(0);
                c30Var.setVisibility(0);
                if (d40Var != null) {
                    d40Var.setVisibility(0);
                }
            }
            f40Var.T1(true, false);
            f40Var.f45559o1.requestLayout();
            if (y10Var.getVisibility() != 0) {
                y10Var.setVisibility(0);
                h10Var.F(y10Var, true);
                h10Var.G(y10Var, false);
            } else {
                h10Var.F(y10Var, true);
                f40Var.Q0(true);
            }
        } else {
            if (!c20Var.f39302b) {
                y10Var.setVisibility(8);
                h10Var.F(y10Var, false);
            } else {
                c30Var.setVisibility(8);
                n30Var.setVisibility(8);
                if (d40Var != null) {
                    d40Var.setVisibility(8);
                }
            }
            if (y10Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < y10Var.getChildCount(); i10++) {
                    View childAt = y10Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.g10) childAt).setProgressToFullscreen(c20Var.f39304c);
                }
            }
        }
        View view = f40Var.E4;
        if (!z9) {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (!f40Var.f45551m2) {
            f40Var.Q0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        invalidate();
        f40 f40Var = this.Q0;
        float f11 = f40Var.O3;
        c20 c20Var = f40Var.U3;
        if (c20Var == null) {
            f10 = 0.0f;
        } else {
            f10 = c20Var.f39304c;
        }
        f40Var.G0 = org.telegram.messenger.g0.S0(Math.max(f11, f10), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false));
        f40Var.f28672b.invalidate();
        f40Var.G1(f40Var.O3);
    }
}
