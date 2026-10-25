package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class m30 extends org.telegram.ui.Components.voip.l0 {
    public final v50 Q0;

    public m30(v50 v50Var, LaunchActivity launchActivity, b50 b50Var, i30 i30Var, ArrayList arrayList, ChatObject.Call call, v50 v50Var2) {
        super(launchActivity, b50Var, i30Var, arrayList, call, v50Var2);
        this.Q0 = v50Var;
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
        v50 v50Var = this.Q0;
        t50 t50Var = v50Var.B1;
        r40 r40Var = v50Var.O;
        b50 b50Var = v50Var.Q;
        org.telegram.ui.Components.c30 c30Var = v50Var.f44669p2;
        m30 m30Var = v50Var.a2;
        i30 i30Var = v50Var.f44656m2;
        v50Var.f44681s0 = z10;
        int i10 = 0;
        if (v50.G3) {
            if (!z10 && m30Var.f33900b) {
                v50Var.f44665o2.H(v50Var.f44661n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            v50Var.f44644j0[0].d(1, false);
            m30Var.K0[0].d(2, false);
            if (!m30Var.f33900b) {
                b50Var.setVisibility(0);
                r40Var.setVisibility(0);
                if (t50Var != null) {
                    t50Var.setVisibility(0);
                }
            }
            v50Var.O1(true, false);
            v50Var.e.requestLayout();
            if (i30Var.getVisibility() != 0) {
                i30Var.setVisibility(0);
                c30Var.F(i30Var, true);
                c30Var.G(i30Var, false);
            } else {
                c30Var.F(i30Var, true);
                v50Var.O0(true);
            }
        } else {
            if (!m30Var.f33900b) {
                i30Var.setVisibility(8);
                c30Var.F(i30Var, false);
            } else {
                r40Var.setVisibility(8);
                b50Var.setVisibility(8);
                if (t50Var != null) {
                    t50Var.setVisibility(8);
                }
            }
            if (i30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < i30Var.getChildCount(); i11++) {
                    View childAt = i30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.b30) childAt).setProgressToFullscreen(m30Var.f33902c);
                }
            }
        }
        View view = v50Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!v50Var.f44681s0) {
            v50Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        v50 v50Var = this.Q0;
        float f10 = v50Var.U1;
        m30 m30Var = v50Var.a2;
        if (m30Var == null) {
            f7 = 0.0f;
        } else {
            f7 = m30Var.f33902c;
        }
        ((org.telegram.ui.ActionBar.k3) v50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23472jg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
        viewGroup.invalidate();
        v50Var.B1(v50Var.U1);
    }
}
