package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class c40 extends org.telegram.ui.Components.voip.m0 {
    public final k60 Q0;

    public c40(k60 k60Var, LaunchActivity launchActivity, q50 q50Var, y30 y30Var, ArrayList arrayList, ChatObject.Call call, k60 k60Var2) {
        super(launchActivity, q50Var, y30Var, arrayList, call, k60Var2);
        this.Q0 = k60Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.Q0.Z2) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void i(boolean z10) {
        k60 k60Var = this.Q0;
        i60 i60Var = k60Var.B1;
        g50 g50Var = k60Var.O;
        q50 q50Var = k60Var.Q;
        org.telegram.ui.Components.s20 s20Var = k60Var.f35078p2;
        c40 c40Var = k60Var.a2;
        y30 y30Var = k60Var.f35065m2;
        k60Var.f35090s0 = z10;
        int i10 = 0;
        if (k60.G3) {
            if (!z10 && c40Var.f29038b) {
                k60Var.f35074o2.H(k60Var.f35070n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            k60Var.f35054j0[0].e(1, false);
            c40Var.K0[0].e(2, false);
            if (!c40Var.f29038b) {
                q50Var.setVisibility(0);
                g50Var.setVisibility(0);
                if (i60Var != null) {
                    i60Var.setVisibility(0);
                }
            }
            k60Var.N1(true, false);
            k60Var.e.requestLayout();
            if (y30Var.getVisibility() != 0) {
                y30Var.setVisibility(0);
                s20Var.F(y30Var, true);
                s20Var.G(y30Var, false);
            } else {
                s20Var.F(y30Var, true);
                k60Var.O0(true);
            }
        } else {
            if (!c40Var.f29038b) {
                y30Var.setVisibility(8);
                s20Var.F(y30Var, false);
            } else {
                g50Var.setVisibility(8);
                q50Var.setVisibility(8);
                if (i60Var != null) {
                    i60Var.setVisibility(8);
                }
            }
            if (y30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < y30Var.getChildCount(); i11++) {
                    View childAt = y30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.r20) childAt).setProgressToFullscreen(c40Var.f29040c);
                }
            }
        }
        View view = k60Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!k60Var.f35090s0) {
            k60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        k60 k60Var = this.Q0;
        float f10 = k60Var.U1;
        c40 c40Var = k60Var.a2;
        if (c40Var == null) {
            f7 = 0.0f;
        } else {
            f7 = c40Var.f29040c;
        }
        ((org.telegram.ui.ActionBar.g3) k60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18981jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18926gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
        k60Var.B1(k60Var.U1);
    }
}
