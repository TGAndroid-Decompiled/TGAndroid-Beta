package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ni0 extends gz {
    public final int[] N;
    public final bj0 O;

    public ni0(bj0 bj0Var, mi0 mi0Var, int i10) {
        super(i10, mi0Var);
        this.O = bj0Var;
        this.N = new int[2];
    }

    @Override
    public final void h(fz fzVar) {
        bj0 bj0Var = this.O;
        ui0 ui0Var = bj0Var.K;
        if (fzVar != null) {
            if (bj0Var.f32190l0 != null) {
                fzVar.f33704c = true;
                float f7 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                fzVar.d = f10;
                fzVar.e = f10;
                fzVar.f33702a = Utilities.clamp(bj0Var.f32190l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                fzVar.f33703b = bj0Var.f32190l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = bj0Var.Q;
            if (t1Var != null && t1Var.isAttachedToWindow() && bj0Var.Q.getMessageObject() != null && bj0Var.Q.getMessageObject().getId() == bj0Var.R) {
                org.telegram.ui.Cells.t1 t1Var2 = bj0Var.Q;
                int[] iArr = this.N;
                t1Var2.getLocationOnScreen(iArr);
                fzVar.f33704c = true;
                float f11 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                fzVar.d = f12;
                fzVar.e = f12;
                float f13 = f11 / 2.0f;
                fzVar.f33702a = Utilities.clamp(((ui0Var.getScaleX() * bj0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                fzVar.f33703b = ((ui0Var.getScaleY() * bj0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
