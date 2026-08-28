package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class g30 extends org.telegram.ui.Components.voip.k0 {
    public final o50 M0;

    public g30(o50 o50Var, LaunchActivity launchActivity, u40 u40Var, c30 c30Var, ArrayList arrayList, ChatObject.Call call, o50 o50Var2) {
        super(launchActivity, u40Var, c30Var, arrayList, call, o50Var2);
        this.M0 = o50Var;
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
        o50 o50Var = this.M0;
        m50 m50Var = o50Var.f40979x1;
        k40 k40Var = o50Var.K;
        u40 u40Var = o50Var.M;
        org.telegram.ui.Components.c20 c20Var = o50Var.f40928l2;
        g30 g30Var = o50Var.W1;
        c30 c30Var = o50Var.f40917i2;
        o50Var.f40938o0 = z10;
        int i9 = 0;
        if (o50.C3) {
            if (!z10 && g30Var.f33598b) {
                o50Var.f40925k2.H(o50Var.f40921j2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            o50Var.f40903f0[0].e(1, false);
            g30Var.G0[0].e(2, false);
            if (!g30Var.f33598b) {
                u40Var.setVisibility(0);
                k40Var.setVisibility(0);
                if (m50Var != null) {
                    m50Var.setVisibility(0);
                }
            }
            o50Var.N1(true, false);
            o50Var.f40897e.requestLayout();
            if (c30Var.getVisibility() != 0) {
                c30Var.setVisibility(0);
                c20Var.F(c30Var, true);
                c20Var.G(c30Var, false);
            } else {
                c20Var.F(c30Var, true);
                o50Var.O0(true);
            }
        } else {
            if (!g30Var.f33598b) {
                c30Var.setVisibility(8);
                c20Var.F(c30Var, false);
            } else {
                k40Var.setVisibility(8);
                u40Var.setVisibility(8);
                if (m50Var != null) {
                    m50Var.setVisibility(8);
                }
            }
            if (c30Var.getVisibility() == 0) {
                for (int i10 = 0; i10 < c30Var.getChildCount(); i10++) {
                    View childAt = c30Var.getChildAt(i10);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.b20) childAt).setProgressToFullscreen(g30Var.f33600c);
                }
            }
        }
        View view = o50Var.G2;
        if (!z10) {
            i9 = 8;
        }
        view.setVisibility(i9);
        if (!o50Var.f40938o0) {
            o50Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f10;
        ViewGroup viewGroup;
        invalidate();
        o50 o50Var = this.M0;
        float f11 = o50Var.Q1;
        g30 g30Var = o50Var.W1;
        if (g30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = g30Var.f33600c;
        }
        ((org.telegram.ui.ActionBar.f3) o50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23118jg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23065gg, false), Math.max(f11, f10), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
        o50Var.B1(o50Var.Q1);
    }
}
