package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class bi0 extends qy {
    public final int[] N;
    public final pi0 O;

    public bi0(pi0 pi0Var, ai0 ai0Var, int i10) {
        super(i10, ai0Var);
        this.O = pi0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(py pyVar) {
        pi0 pi0Var = this.O;
        ii0 ii0Var = pi0Var.J;
        if (pyVar != null) {
            if (pi0Var.f40563k0 != null) {
                pyVar.f40649c = true;
                float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                pyVar.d = f10;
                pyVar.e = f10;
                pyVar.f40647a = Utilities.clamp(pi0Var.f40563k0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                pyVar.f40648b = pi0Var.f40563k0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = pi0Var.P;
            if (t1Var != null && t1Var.isAttachedToWindow() && pi0Var.P.getMessageObject() != null && pi0Var.P.getMessageObject().getId() == pi0Var.Q) {
                org.telegram.ui.Cells.t1 t1Var2 = pi0Var.P;
                int[] iArr = this.N;
                t1Var2.getLocationOnScreen(iArr);
                pyVar.f40649c = true;
                float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                pyVar.d = f12;
                pyVar.e = f12;
                float f13 = f11 / 2.0f;
                pyVar.f40647a = Utilities.clamp(((ii0Var.getScaleX() * pi0Var.P.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                pyVar.f40648b = ((ii0Var.getScaleY() * pi0Var.P.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
