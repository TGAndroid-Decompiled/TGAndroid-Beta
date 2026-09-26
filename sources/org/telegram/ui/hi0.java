package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class hi0 extends cz {
    public final int[] N;
    public final vi0 O;

    public hi0(vi0 vi0Var, gi0 gi0Var, int i10) {
        super(i10, gi0Var);
        this.O = vi0Var;
        this.N = new int[2];
    }

    @Override
    public final void h(bz bzVar) {
        vi0 vi0Var = this.O;
        oi0 oi0Var = vi0Var.K;
        if (bzVar != null) {
            if (vi0Var.f38740l0 != null) {
                bzVar.f32513c = true;
                float f7 = (cz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                bzVar.d = f10;
                bzVar.e = f10;
                bzVar.f32511a = Utilities.clamp(vi0Var.f38740l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                bzVar.f32512b = vi0Var.f38740l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = vi0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && vi0Var.Q.getMessageObject() != null && vi0Var.Q.getMessageObject().getId() == vi0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = vi0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                bzVar.f32513c = true;
                float f11 = (cz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                bzVar.d = f12;
                bzVar.e = f12;
                float f13 = f11 / 2.0f;
                bzVar.f32511a = Utilities.clamp(((oi0Var.getScaleX() * vi0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                bzVar.f32512b = ((oi0Var.getScaleY() * vi0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
