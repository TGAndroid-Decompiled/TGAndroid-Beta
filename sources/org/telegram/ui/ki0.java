package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ki0 extends fz {
    public final int[] N;
    public final yi0 O;

    public ki0(yi0 yi0Var, ji0 ji0Var, int i10) {
        super(i10, ji0Var);
        this.O = yi0Var;
        this.N = new int[2];
    }

    @Override
    public final void h(ez ezVar) {
        yi0 yi0Var = this.O;
        ri0 ri0Var = yi0Var.K;
        if (ezVar != null) {
            if (yi0Var.f40236l0 != null) {
                ezVar.f33354c = true;
                float f7 = (fz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                ezVar.d = f10;
                ezVar.e = f10;
                ezVar.f33352a = Utilities.clamp(yi0Var.f40236l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                ezVar.f33353b = yi0Var.f40236l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = yi0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && yi0Var.Q.getMessageObject() != null && yi0Var.Q.getMessageObject().getId() == yi0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = yi0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                ezVar.f33354c = true;
                float f11 = (fz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                ezVar.d = f12;
                ezVar.e = f12;
                float f13 = f11 / 2.0f;
                ezVar.f33352a = Utilities.clamp(((ri0Var.getScaleX() * yi0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                ezVar.f33353b = ((ri0Var.getScaleY() * yi0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
