package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class h30 extends org.telegram.ui.Components.voip.l0 {
    public final q50 Q0;

    public h30(q50 q50Var, LaunchActivity launchActivity, w40 w40Var, d30 d30Var, ArrayList arrayList, ChatObject.Call call, q50 q50Var2) {
        super(launchActivity, w40Var, d30Var, arrayList, call, q50Var2);
        this.Q0 = q50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.Q0.Z2) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void i(boolean z10) {
        q50 q50Var = this.Q0;
        o50 o50Var = q50Var.B1;
        m40 m40Var = q50Var.O;
        w40 w40Var = q50Var.Q;
        org.telegram.ui.Components.a30 a30Var = q50Var.f40437p2;
        h30 h30Var = q50Var.a2;
        d30 d30Var = q50Var.f40424m2;
        q50Var.f40449s0 = z10;
        int i10 = 0;
        if (q50.G3) {
            if (!z10 && h30Var.f31565b) {
                q50Var.f40433o2.H(q50Var.f40429n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            q50Var.f40412j0[0].e(1, false);
            h30Var.K0[0].e(2, false);
            if (!h30Var.f31565b) {
                w40Var.setVisibility(0);
                m40Var.setVisibility(0);
                if (o50Var != null) {
                    o50Var.setVisibility(0);
                }
            }
            q50Var.O1(true, false);
            q50Var.e.requestLayout();
            if (d30Var.getVisibility() != 0) {
                d30Var.setVisibility(0);
                a30Var.F(d30Var, true);
                a30Var.G(d30Var, false);
            } else {
                a30Var.F(d30Var, true);
                q50Var.P0(true);
            }
        } else {
            if (!h30Var.f31565b) {
                d30Var.setVisibility(8);
                a30Var.F(d30Var, false);
            } else {
                m40Var.setVisibility(8);
                w40Var.setVisibility(8);
                if (o50Var != null) {
                    o50Var.setVisibility(8);
                }
            }
            if (d30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < d30Var.getChildCount(); i11++) {
                    View childAt = d30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.z20) childAt).setProgressToFullscreen(h30Var.f31567c);
                }
            }
        }
        View view = q50Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!q50Var.f40449s0) {
            q50Var.P0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        q50 q50Var = this.Q0;
        float f10 = q50Var.U1;
        h30 h30Var = q50Var.a2;
        if (h30Var == null) {
            f7 = 0.0f;
        } else {
            f7 = h30Var.f31567c;
        }
        ((org.telegram.ui.ActionBar.f3) q50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21106jg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21052gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
        q50Var.C1(q50Var.U1);
    }
}
