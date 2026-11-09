package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
public final class b20 extends org.telegram.ui.Components.voip.k0 {
    public final e40 Q0;

    public b20(e40 e40Var, LaunchActivity launchActivity, m30 m30Var, x10 x10Var, ArrayList arrayList, org.telegram.messenger.r3 r3Var, e40 e40Var2) {
        super(launchActivity, m30Var, x10Var, arrayList, r3Var, e40Var2);
        this.Q0 = e40Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Q4) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void i(boolean z9) {
        e40 e40Var = this.Q0;
        c40 c40Var = e40Var.f45267s3;
        b30 b30Var = e40Var.F1;
        m30 m30Var = e40Var.H1;
        org.telegram.ui.Components.i10 i10Var = e40Var.f45213g4;
        b20 b20Var = e40Var.R3;
        x10 x10Var = e40Var.f45201d4;
        e40Var.f45225j2 = z9;
        int i7 = 0;
        if (e40.f45185x5) {
            if (!z9 && b20Var.f39382b) {
                e40Var.f45209f4.H(e40Var.f45205e4, false, true);
                return;
            }
            return;
        }
        if (z9) {
            e40Var.f45188a2[0].d(1, false);
            b20Var.K0[0].d(2, false);
            if (!b20Var.f39382b) {
                m30Var.setVisibility(0);
                b30Var.setVisibility(0);
                if (c40Var != null) {
                    c40Var.setVisibility(0);
                }
            }
            e40Var.T1(true, false);
            e40Var.l1.requestLayout();
            if (x10Var.getVisibility() != 0) {
                x10Var.setVisibility(0);
                i10Var.F(x10Var, true);
                i10Var.G(x10Var, false);
            } else {
                i10Var.F(x10Var, true);
                e40Var.Q0(true);
            }
        } else {
            if (!b20Var.f39382b) {
                x10Var.setVisibility(8);
                i10Var.F(x10Var, false);
            } else {
                b30Var.setVisibility(8);
                m30Var.setVisibility(8);
                if (c40Var != null) {
                    c40Var.setVisibility(8);
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
                    ((org.telegram.ui.Components.h10) childAt).setProgressToFullscreen(b20Var.f39384c);
                }
            }
        }
        View view = e40Var.B4;
        if (!z9) {
            i7 = 8;
        }
        view.setVisibility(i7);
        if (!e40Var.f45225j2) {
            e40Var.Q0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        invalidate();
        e40 e40Var = this.Q0;
        float f11 = e40Var.L3;
        b20 b20Var = e40Var.R3;
        if (b20Var == null) {
            f10 = 0.0f;
        } else {
            f10 = b20Var.f39384c;
        }
        e40Var.G0 = org.telegram.messenger.g0.S0(Math.max(f11, f10), 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Xg, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ug, false));
        e40Var.f28624b.invalidate();
        e40Var.G1(e40Var.L3);
    }
}
