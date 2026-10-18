package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class j30 extends org.telegram.ui.Components.voip.l0 {
    public final s50 Q0;

    public j30(s50 s50Var, LaunchActivity launchActivity, y40 y40Var, f30 f30Var, ArrayList arrayList, ChatObject.Call call, s50 s50Var2) {
        super(launchActivity, y40Var, f30Var, arrayList, call, s50Var2);
        this.Q0 = s50Var;
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
        s50 s50Var = this.Q0;
        q50 q50Var = s50Var.B1;
        o40 o40Var = s50Var.O;
        y40 y40Var = s50Var.Q;
        org.telegram.ui.Components.a30 a30Var = s50Var.f40996p2;
        j30 j30Var = s50Var.a2;
        f30 f30Var = s50Var.f40983m2;
        s50Var.f41008s0 = z10;
        int i10 = 0;
        if (s50.G3) {
            if (!z10 && j30Var.f31561b) {
                s50Var.f40992o2.H(s50Var.f40988n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            s50Var.f40971j0[0].e(1, false);
            j30Var.K0[0].e(2, false);
            if (!j30Var.f31561b) {
                y40Var.setVisibility(0);
                o40Var.setVisibility(0);
                if (q50Var != null) {
                    q50Var.setVisibility(0);
                }
            }
            s50Var.O1(true, false);
            s50Var.e.requestLayout();
            if (f30Var.getVisibility() != 0) {
                f30Var.setVisibility(0);
                a30Var.F(f30Var, true);
                a30Var.G(f30Var, false);
            } else {
                a30Var.F(f30Var, true);
                s50Var.P0(true);
            }
        } else {
            if (!j30Var.f31561b) {
                f30Var.setVisibility(8);
                a30Var.F(f30Var, false);
            } else {
                o40Var.setVisibility(8);
                y40Var.setVisibility(8);
                if (q50Var != null) {
                    q50Var.setVisibility(8);
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
                    ((org.telegram.ui.Components.z20) childAt).setProgressToFullscreen(j30Var.f31563c);
                }
            }
        }
        View view = s50Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!s50Var.f41008s0) {
            s50Var.P0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        s50 s50Var = this.Q0;
        float f10 = s50Var.U1;
        j30 j30Var = s50Var.a2;
        if (j30Var == null) {
            f7 = 0.0f;
        } else {
            f7 = j30Var.f31563c;
        }
        ((org.telegram.ui.ActionBar.f3) s50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21110jg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21056gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
        s50Var.C1(s50Var.U1);
    }
}
