package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class e40 extends org.telegram.ui.Components.voip.l0 {
    public final n60 Q0;

    public e40(n60 n60Var, LaunchActivity launchActivity, t50 t50Var, a40 a40Var, ArrayList arrayList, ChatObject.Call call, n60 n60Var2) {
        super(launchActivity, t50Var, a40Var, arrayList, call, n60Var2);
        this.Q0 = n60Var;
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
        n60 n60Var = this.Q0;
        l60 l60Var = n60Var.B1;
        j50 j50Var = n60Var.O;
        t50 t50Var = n60Var.Q;
        org.telegram.ui.Components.f30 f30Var = n60Var.f38219p2;
        e40 e40Var = n60Var.a2;
        a40 a40Var = n60Var.f38206m2;
        n60Var.f38231s0 = z10;
        int i10 = 0;
        if (n60.G3) {
            if (!z10 && e40Var.f29950b) {
                n60Var.f38215o2.H(n60Var.f38211n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            n60Var.f38194j0[0].e(1, false);
            e40Var.K0[0].e(2, false);
            if (!e40Var.f29950b) {
                t50Var.setVisibility(0);
                j50Var.setVisibility(0);
                if (l60Var != null) {
                    l60Var.setVisibility(0);
                }
            }
            n60Var.O1(true, false);
            n60Var.e.requestLayout();
            if (a40Var.getVisibility() != 0) {
                a40Var.setVisibility(0);
                f30Var.F(a40Var, true);
                f30Var.G(a40Var, false);
            } else {
                f30Var.F(a40Var, true);
                n60Var.P0(true);
            }
        } else {
            if (!e40Var.f29950b) {
                a40Var.setVisibility(8);
                f30Var.F(a40Var, false);
            } else {
                j50Var.setVisibility(8);
                t50Var.setVisibility(8);
                if (l60Var != null) {
                    l60Var.setVisibility(8);
                }
            }
            if (a40Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < a40Var.getChildCount(); i11++) {
                    View childAt = a40Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.e30) childAt).setProgressToFullscreen(e40Var.f29952c);
                }
            }
        }
        View view = n60Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!n60Var.f38231s0) {
            n60Var.P0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        n60 n60Var = this.Q0;
        float f10 = n60Var.U1;
        e40 e40Var = n60Var.a2;
        if (e40Var == null) {
            f7 = 0.0f;
        } else {
            f7 = e40Var.f29952c;
        }
        ((org.telegram.ui.ActionBar.e3) n60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19718jg, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19664gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
        n60Var.C1(n60Var.U1);
    }
}
