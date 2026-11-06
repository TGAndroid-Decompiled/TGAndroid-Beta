package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class qf0 extends ix {
    public final int[] N;
    public final bg0 O;

    public qf0(bg0 bg0Var, pf0 pf0Var, int i7) {
        super(i7, pf0Var);
        this.O = bg0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(hx hxVar) {
        bg0 bg0Var = this.O;
        xf0 xf0Var = bg0Var.J;
        if (hxVar != null) {
            if (bg0Var.f44331k0 != null) {
                hxVar.f46507c = true;
                float f10 = (ix.f() * org.telegram.messenger.g0.f22536p) / 1.3f;
                float f11 = f10 / 3.0f;
                hxVar.d = f11;
                hxVar.f46508e = f11;
                hxVar.f46505a = Utilities.i(bg0Var.f44331k0.right - (0.75f * f10), org.telegram.messenger.g0.f22537q.x - f10, 0.0f);
                hxVar.f46506b = bg0Var.f44331k0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = bg0Var.P;
            if (q1Var != null && q1Var.isAttachedToWindow() && bg0Var.P.getMessageObject() != null && bg0Var.P.getMessageObject().f1() == bg0Var.Q) {
                org.telegram.ui.Cells.q1 q1Var2 = bg0Var.P;
                int[] iArr = this.N;
                q1Var2.getLocationOnScreen(iArr);
                hxVar.f46507c = true;
                float f12 = (ix.f() * org.telegram.messenger.g0.f22536p) / 1.3f;
                float f13 = f12 / 3.0f;
                hxVar.d = f13;
                hxVar.f46508e = f13;
                float f14 = f12 / 2.0f;
                hxVar.f46505a = Utilities.i(((xf0Var.getScaleX() * bg0Var.P.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f22537q.x - f12, 0.0f);
                hxVar.f46506b = ((xf0Var.getScaleY() * bg0Var.P.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
