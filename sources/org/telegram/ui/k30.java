package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class k30 extends org.telegram.ui.Components.voip.l0 {
    public final u50 Q0;

    public k30(u50 u50Var, LaunchActivity launchActivity, z40 z40Var, g30 g30Var, ArrayList arrayList, ChatObject.Call call, u50 u50Var2) {
        super(launchActivity, z40Var, g30Var, arrayList, call, u50Var2);
        this.Q0 = u50Var;
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
        u50 u50Var = this.Q0;
        s50 s50Var = u50Var.B1;
        p40 p40Var = u50Var.O;
        z40 z40Var = u50Var.Q;
        org.telegram.ui.Components.y20 y20Var = u50Var.f42279p2;
        k30 k30Var = u50Var.a2;
        g30 g30Var = u50Var.f42266m2;
        u50Var.f42291s0 = z10;
        int i10 = 0;
        if (u50.G3) {
            if (!z10 && k30Var.f31670b) {
                u50Var.f42275o2.H(u50Var.f42271n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            u50Var.f42254j0[0].d(1, false);
            k30Var.K0[0].d(2, false);
            if (!k30Var.f31670b) {
                z40Var.setVisibility(0);
                p40Var.setVisibility(0);
                if (s50Var != null) {
                    s50Var.setVisibility(0);
                }
            }
            u50Var.O1(true, false);
            u50Var.e.requestLayout();
            if (g30Var.getVisibility() != 0) {
                g30Var.setVisibility(0);
                y20Var.F(g30Var, true);
                y20Var.G(g30Var, false);
            } else {
                y20Var.F(g30Var, true);
                u50Var.O0(true);
            }
        } else {
            if (!k30Var.f31670b) {
                g30Var.setVisibility(8);
                y20Var.F(g30Var, false);
            } else {
                p40Var.setVisibility(8);
                z40Var.setVisibility(8);
                if (s50Var != null) {
                    s50Var.setVisibility(8);
                }
            }
            if (g30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < g30Var.getChildCount(); i11++) {
                    View childAt = g30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.x20) childAt).setProgressToFullscreen(k30Var.f31672c);
                }
            }
        }
        View view = u50Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!u50Var.f42291s0) {
            u50Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        u50 u50Var = this.Q0;
        float f10 = u50Var.U1;
        k30 k30Var = u50Var.a2;
        if (k30Var == null) {
            f7 = 0.0f;
        } else {
            f7 = k30Var.f31672c;
        }
        ((org.telegram.ui.ActionBar.h3) u50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21301jg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21247gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
        viewGroup.invalidate();
        u50Var.B1(u50Var.U1);
    }
}
