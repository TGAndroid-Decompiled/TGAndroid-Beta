package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;

public final class j30 extends org.telegram.ui.Components.voip.k0 {
    public final s50 M0;

    public j30(s50 s50Var, LaunchActivity launchActivity, y40 y40Var, f30 f30Var, ArrayList arrayList, ChatObject.Call call, s50 s50Var2) {
        super(launchActivity, y40Var, f30Var, arrayList, call, s50Var2);
        this.M0 = s50Var;
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
        s50 s50Var = this.M0;
        q50 q50Var = s50Var.f42508x1;
        o40 o40Var = s50Var.K;
        y40 y40Var = s50Var.M;
        org.telegram.ui.Components.f20 f20Var = s50Var.f42457l2;
        j30 j30Var = s50Var.W1;
        f30 f30Var = s50Var.f42446i2;
        s50Var.f42467o0 = z10;
        if (s50.C3) {
            if (z10 || !j30Var.f33648b) {
                return;
            }
            s50Var.f42454k2.H(s50Var.f42450j2, false, true);
            return;
        }
        if (z10) {
            s50Var.f42432f0[0].e(1, false);
            j30Var.G0[0].e(2, false);
            if (!j30Var.f33648b) {
                y40Var.setVisibility(0);
                o40Var.setVisibility(0);
                if (q50Var != null) {
                    q50Var.setVisibility(0);
                }
            }
            s50Var.N1(true, false);
            s50Var.f42426e.requestLayout();
            if (f30Var.getVisibility() != 0) {
                f30Var.setVisibility(0);
                f20Var.F(f30Var, true);
                f20Var.G(f30Var, false);
            } else {
                f20Var.F(f30Var, true);
                s50Var.O0(true);
            }
        } else {
            if (j30Var.f33648b) {
                o40Var.setVisibility(8);
                y40Var.setVisibility(8);
                if (q50Var != null) {
                    q50Var.setVisibility(8);
                }
            } else {
                f30Var.setVisibility(8);
                f20Var.F(f30Var, false);
            }
            if (f30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < f30Var.getChildCount(); i10++) {
                    View childAt = f30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.e20) childAt).setProgressToFullscreen(j30Var.f33650c);
                }
            }
        }
        s50Var.G2.setVisibility(z10 ? 0 : 8);
        if (s50Var.f42467o0) {
            return;
        }
        s50Var.O0(true);
    }

    @Override
    public final void l() {
        invalidate();
        s50 s50Var = this.M0;
        float f10 = s50Var.Q1;
        j30 j30Var = s50Var.W1;
        ((org.telegram.ui.ActionBar.e3) s50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23172jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23117gg, false), Math.max(f10, j30Var == null ? 0.0f : j30Var.f33650c), 1.0f);
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.invalidate();
        s50Var.B1(s50Var.Q1);
    }
}
