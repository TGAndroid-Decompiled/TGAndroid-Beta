package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
public final class a40 extends org.telegram.ui.Components.voip.l0 {
    public final j60 Q0;

    public a40(j60 j60Var, LaunchActivity launchActivity, p50 p50Var, w30 w30Var, ArrayList arrayList, ChatObject.Call call, j60 j60Var2) {
        super(launchActivity, p50Var, w30Var, arrayList, call, j60Var2);
        this.Q0 = j60Var;
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
        j60 j60Var = this.Q0;
        h60 h60Var = j60Var.B1;
        f50 f50Var = j60Var.O;
        p50 p50Var = j60Var.Q;
        org.telegram.ui.Components.s20 s20Var = j60Var.f37602p2;
        a40 a40Var = j60Var.a2;
        w30 w30Var = j60Var.f37589m2;
        j60Var.f37614s0 = z10;
        int i10 = 0;
        if (j60.G3) {
            if (!z10 && a40Var.f31624b) {
                j60Var.f37598o2.H(j60Var.f37594n2, false, true);
                return;
            }
            return;
        }
        if (z10) {
            j60Var.f37578j0[0].e(1, false);
            a40Var.K0[0].e(2, false);
            if (!a40Var.f31624b) {
                p50Var.setVisibility(0);
                f50Var.setVisibility(0);
                if (h60Var != null) {
                    h60Var.setVisibility(0);
                }
            }
            j60Var.N1(true, false);
            j60Var.f37556e.requestLayout();
            if (w30Var.getVisibility() != 0) {
                w30Var.setVisibility(0);
                s20Var.F(w30Var, true);
                s20Var.G(w30Var, false);
            } else {
                s20Var.F(w30Var, true);
                j60Var.O0(true);
            }
        } else {
            if (!a40Var.f31624b) {
                w30Var.setVisibility(8);
                s20Var.F(w30Var, false);
            } else {
                f50Var.setVisibility(8);
                p50Var.setVisibility(8);
                if (h60Var != null) {
                    h60Var.setVisibility(8);
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
                    ((org.telegram.ui.Components.r20) childAt).setProgressToFullscreen(a40Var.f31626c);
                }
            }
        }
        View view = j60Var.K2;
        if (!z10) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (!j60Var.f37614s0) {
            j60Var.O0(true);
        }
    }

    @Override
    public final void l() {
        float f7;
        ViewGroup viewGroup;
        invalidate();
        j60 j60Var = this.Q0;
        float f10 = j60Var.U1;
        a40 a40Var = j60Var.a2;
        if (a40Var == null) {
            f7 = 0.0f;
        } else {
            f7 = a40Var.f31626c;
        }
        ((org.telegram.ui.ActionBar.f3) j60Var).navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20808jg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753gg, false), Math.max(f10, f7), 1.0f);
        viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
        viewGroup.invalidate();
        j60Var.B1(j60Var.U1);
    }
}
