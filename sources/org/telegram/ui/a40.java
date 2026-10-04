package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class a40 extends org.telegram.ui.Components.voip.m0 {
    public final h60 Q0;

    public a40(h60 h60Var, LaunchActivity launchActivity, o50 o50Var, w30 w30Var, ArrayList arrayList, ChatObject.Call call, h60 h60Var2) {
        super(launchActivity, o50Var, w30Var, arrayList, call, h60Var2);
        this.Q0 = h60Var;
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
        h60 h60Var = this.Q0;
        f60 f60Var = h60Var.B1;
        e50 e50Var = h60Var.O;
        o50 o50Var = h60Var.Q;
        org.telegram.ui.Components.w20 w20Var = h60Var.f36936p2;
        a40 a40Var = h60Var.a2;
        w30 w30Var = h60Var.f36923m2;
        h60Var.f36948s0 = z10;
        int i10 = 0;
        if (h60.G3) {
            if (!z10 && a40Var.f31976b) {
                h60Var.f36932o2.H(h60Var.f36928n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            h60Var.f36912j0[0].e(1, false);
            a40Var.K0[0].e(2, false);
            if (!a40Var.f31976b) {
                o50Var.setVisibility(0);
                e50Var.setVisibility(0);
                if (f60Var != null) {
                    f60Var.setVisibility(0);
                }
            }
            h60Var.N1(true, false);
            h60Var.f36890e.requestLayout();
            if (w30Var.getVisibility() != 0) {
                w30Var.setVisibility(0);
                w20Var.F(w30Var, true);
                w20Var.G(w30Var, false);
            } else {
                w20Var.F(w30Var, true);
                h60Var.O0(true);
            }
        } else {
            if (!a40Var.f31976b) {
                w30Var.setVisibility(8);
                w20Var.F(w30Var, false);
            } else {
                e50Var.setVisibility(8);
                o50Var.setVisibility(8);
                if (f60Var != null) {
                    f60Var.setVisibility(8);
                }
            }
            if (w30Var.getVisibility() == 0) {
                for (int i11 = 0; i11 < w30Var.getChildCount(); i11++) {
                    View childAt = w30Var.getChildAt(i11);
                    childAt.setAlpha(1.0f);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                    childAt.setTranslationX(0.0f);
                    childAt.setTranslationY(0.0f);
                    ((org.telegram.ui.Components.v20) childAt).setProgressToFullscreen(a40Var.f31978c);
                }
            }
        }
        View view = h60Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!h60Var.f36948s0) {
            h60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        h60 h60Var = this.Q0;
        float f10 = h60Var.U1;
        a40 a40Var = h60Var.a2;
        if (a40Var == null) {
            f7 = 0.0f;
        } else {
            f7 = a40Var.f31978c;
        }
        ((org.telegram.ui.ActionBar.f3) h60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20937jg, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20882gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
        h60Var.B1(h60Var.U1);
    }
}
