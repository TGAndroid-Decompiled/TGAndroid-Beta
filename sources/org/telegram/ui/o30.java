package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class o30 extends org.telegram.ui.Components.voip.l0 {
    public final x50 Q0;

    public o30(x50 x50Var, LaunchActivity launchActivity, d50 d50Var, k30 k30Var, ArrayList arrayList, ChatObject.Call call, x50 x50Var2) {
        super(launchActivity, d50Var, k30Var, arrayList, call, x50Var2);
        this.Q0 = x50Var;
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
        x50 x50Var = this.Q0;
        v50 v50Var = x50Var.B1;
        t40 t40Var = x50Var.O;
        d50 d50Var = x50Var.Q;
        org.telegram.ui.Components.c30 c30Var = x50Var.f45553p2;
        o30 o30Var = x50Var.a2;
        k30 k30Var = x50Var.f45540m2;
        x50Var.f45565s0 = z10;
        int i10 = 0;
        if (x50.G3) {
            if (!z10 && o30Var.f34008b) {
                x50Var.f45549o2.H(x50Var.f45545n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            x50Var.f45528j0[0].d(1, false);
            o30Var.K0[0].d(2, false);
            if (!o30Var.f34008b) {
                d50Var.setVisibility(0);
                t40Var.setVisibility(0);
                if (v50Var != null) {
                    v50Var.setVisibility(0);
                }
            }
            x50Var.O1(true, false);
            x50Var.e.requestLayout();
            if (k30Var.getVisibility() != 0) {
                k30Var.setVisibility(0);
                c30Var.F(k30Var, true);
                c30Var.G(k30Var, false);
            } else {
                c30Var.F(k30Var, true);
                x50Var.O0(true);
            }
        } else {
            if (!o30Var.f34008b) {
                k30Var.setVisibility(8);
                c30Var.F(k30Var, false);
            } else {
                t40Var.setVisibility(8);
                d50Var.setVisibility(8);
                if (v50Var != null) {
                    v50Var.setVisibility(8);
                }
            }
            if (k30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < k30Var.getChildCount(); i11++) {
                    View childAt = k30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.b30) childAt).setProgressToFullscreen(o30Var.f34010c);
                }
            }
        }
        View view = x50Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!x50Var.f45565s0) {
            x50Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        x50 x50Var = this.Q0;
        float f10 = x50Var.U1;
        o30 o30Var = x50Var.a2;
        if (o30Var == null) {
            f7 = 0.0f;
        } else {
            f7 = o30Var.f34010c;
        }
        ((org.telegram.ui.ActionBar.k3) x50Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23475jg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
        viewGroup.invalidate();
        x50Var.B1(x50Var.U1);
    }
}
