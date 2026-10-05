package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class li0 extends gz {
    public final int[] N;
    public final zi0 O;

    public li0(zi0 zi0Var, ki0 ki0Var, int i10) {
        super(i10, ki0Var);
        this.O = zi0Var;
        this.N = new int[2];
    }

    @Override
    public final void h(fz fzVar) {
        zi0 zi0Var = this.O;
        si0 si0Var = zi0Var.K;
        if (fzVar != null) {
            if (zi0Var.f43818l0 != null) {
                fzVar.f36446c = true;
                float f7 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                fzVar.d = f10;
                fzVar.f36447e = f10;
                fzVar.f36444a = Utilities.clamp(zi0Var.f43818l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                fzVar.f36445b = zi0Var.f43818l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = zi0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && zi0Var.Q.getMessageObject() != null && zi0Var.Q.getMessageObject().getId() == zi0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = zi0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                fzVar.f36446c = true;
                float f11 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                fzVar.d = f12;
                fzVar.f36447e = f12;
                float f13 = f11 / 2.0f;
                fzVar.f36444a = Utilities.clamp(((si0Var.getScaleX() * zi0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                fzVar.f36445b = ((si0Var.getScaleY() * zi0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
