package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class j30 extends org.telegram.ui.Components.voip.l0 {
    public final r50 M0;

    public j30(r50 r50Var, LaunchActivity launchActivity, x40 x40Var, f30 f30Var, ArrayList arrayList, ChatObject.Call call, r50 r50Var2) {
        super(launchActivity, x40Var, f30Var, arrayList, call, r50Var2);
        this.M0 = r50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.M0.V2) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void i(boolean z10) {
        r50 r50Var = this.M0;
        p50 p50Var = r50Var.f41966x1;
        n40 n40Var = r50Var.K;
        x40 x40Var = r50Var.M;
        org.telegram.ui.Components.o20 o20Var = r50Var.f41915l2;
        j30 j30Var = r50Var.W1;
        f30 f30Var = r50Var.f41904i2;
        r50Var.f41925o0 = z10;
        int i10 = 0;
        if (r50.C3) {
            if (!z10 && j30Var.f33796b) {
                r50Var.f41912k2.H(r50Var.f41908j2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            r50Var.f41890f0[0].e(1, false);
            j30Var.G0[0].e(2, false);
            if (!j30Var.f33796b) {
                x40Var.setVisibility(0);
                n40Var.setVisibility(0);
                if (p50Var != null) {
                    p50Var.setVisibility(0);
                }
            }
            r50Var.N1(true, false);
            r50Var.f41884e.requestLayout();
            if (f30Var.getVisibility() != 0) {
                f30Var.setVisibility(0);
                o20Var.F(f30Var, true);
                o20Var.G(f30Var, false);
            } else {
                o20Var.F(f30Var, true);
                r50Var.O0(true);
            }
        } else {
            if (!j30Var.f33796b) {
                f30Var.setVisibility(8);
                o20Var.F(f30Var, false);
            } else {
                n40Var.setVisibility(8);
                x40Var.setVisibility(8);
                if (p50Var != null) {
                    p50Var.setVisibility(8);
                }
            }
            if (f30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < f30Var.getChildCount(); i11++) {
                    View childAt = f30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.n20) childAt).setProgressToFullscreen(j30Var.f33798c);
                }
            }
        }
        View view = r50Var.G2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!r50Var.f41925o0) {
            r50Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f9;
        ViewGroup viewGroup;
        invalidate();
        r50 r50Var = this.M0;
        float f10 = r50Var.Q1;
        j30 j30Var = r50Var.W1;
        if (j30Var == null) {
            f9 = 0.0f;
        } else {
            f9 = j30Var.f33798c;
        }
        ((org.telegram.ui.ActionBar.f3) r50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23180jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126gg, false), Math.max(f10, f9), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
        viewGroup.invalidate();
        r50Var.B1(r50Var.Q1);
    }
}
