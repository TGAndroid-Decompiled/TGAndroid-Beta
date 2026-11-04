package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class kf0 extends fx {
    public final int[] O;
    public final vf0 P;

    public kf0(vf0 vf0Var, jf0 jf0Var, int i3) {
        super(i3, jf0Var);
        this.P = vf0Var;
        this.O = new int[2];
    }

    @Override
    public final void g(ex exVar) {
        vf0 vf0Var = this.P;
        rf0 rf0Var = vf0Var.K;
        if (exVar != null) {
            if (vf0Var.f50488l0 != null) {
                exVar.f45065c = true;
                float f10 = (fx.f() * org.telegram.messenger.g0.f22607p) / 1.3f;
                float f11 = f10 / 3.0f;
                exVar.d = f11;
                exVar.f45066e = f11;
                exVar.f45063a = Utilities.i(vf0Var.f50488l0.right - (0.75f * f10), org.telegram.messenger.g0.f22608q.x - f10, 0.0f);
                exVar.f45064b = vf0Var.f50488l0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.q1 q1Var = vf0Var.Q;
            if (q1Var != null && q1Var.isAttachedToWindow() && vf0Var.Q.getMessageObject() != null && vf0Var.Q.getMessageObject().f1() == vf0Var.R) {
                org.telegram.ui.Cells.q1 q1Var2 = vf0Var.Q;
                int[] iArr = this.O;
                q1Var2.getLocationOnScreen(iArr);
                exVar.f45065c = true;
                float f12 = (fx.f() * org.telegram.messenger.g0.f22607p) / 1.3f;
                float f13 = f12 / 3.0f;
                exVar.d = f13;
                exVar.f45066e = f13;
                float f14 = f12 / 2.0f;
                exVar.f45063a = Utilities.i(((rf0Var.getScaleX() * vf0Var.Q.getTimeX()) + iArr[0]) - f14, org.telegram.messenger.g0.f22608q.x - f12, 0.0f);
                exVar.f45064b = ((rf0Var.getScaleY() * vf0Var.Q.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
