package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class qf0 extends jx {
    public final int[] O;
    public final bg0 P;

    public qf0(bg0 bg0Var, pf0 pf0Var, int i7) {
        super(i7, pf0Var);
        this.P = bg0Var;
        this.O = new int[2];
    }

    @Override
    public final void g(ix ixVar) {
        bg0 bg0Var = this.P;
        xf0 xf0Var = bg0Var.K;
        if (ixVar != null) {
            if (bg0Var.f45728l0 != null) {
                ixVar.f48141c = true;
                float f10 = (jx.f() * org.telegram.messenger.g0.f23608p) / 1.3f;
                float f11 = f10 / 3.0f;
                ixVar.d = f11;
                ixVar.f48142e = f11;
                ixVar.f48139a = Utilities.i(bg0Var.f45728l0.right - (0.75f * f10), org.telegram.messenger.g0.f23609q.x - f10, 0.0f);
                ixVar.f48140b = bg0Var.f45728l0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = bg0Var.Q;
            if (q1Var != null && q1Var.isAttachedToWindow() && bg0Var.Q.getMessageObject() != null && bg0Var.Q.getMessageObject().e1() == bg0Var.R) {
                org.telegram.ui.Cells.q1 q1Var2 = bg0Var.Q;
                int[] iArr = this.O;
                q1Var2.getLocationOnScreen(iArr);
                ixVar.f48141c = true;
                float f12 = (jx.f() * org.telegram.messenger.g0.f23608p) / 1.3f;
                float f13 = f12 / 3.0f;
                ixVar.d = f13;
                ixVar.f48142e = f13;
                float f14 = f12 / 2.0f;
                ixVar.f48139a = Utilities.i(((xf0Var.getScaleX() * bg0Var.Q.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f23609q.x - f12, 0.0f);
                ixVar.f48140b = ((xf0Var.getScaleY() * bg0Var.Q.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
