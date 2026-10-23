package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ci0 extends qy {
    public final int[] N;
    public final qi0 O;

    public ci0(qi0 qi0Var, bi0 bi0Var, int i10) {
        super(i10, bi0Var);
        this.O = qi0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(py pyVar) {
        qi0 qi0Var = this.O;
        ji0 ji0Var = qi0Var.J;
        if (pyVar != null) {
            if (qi0Var.f40832k0 != null) {
                pyVar.f40560c = true;
                float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                pyVar.d = f10;
                pyVar.e = f10;
                pyVar.f40558a = Utilities.clamp(qi0Var.f40832k0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                pyVar.f40559b = qi0Var.f40832k0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = qi0Var.P;
            if (t1Var != null && t1Var.isAttachedToWindow() && qi0Var.P.getMessageObject() != null && qi0Var.P.getMessageObject().getId() == qi0Var.Q) {
                org.telegram.ui.Cells.t1 t1Var2 = qi0Var.P;
                int[] iArr = this.N;
                t1Var2.getLocationOnScreen(iArr);
                pyVar.f40560c = true;
                float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                pyVar.d = f12;
                pyVar.e = f12;
                float f13 = f11 / 2.0f;
                pyVar.f40558a = Utilities.clamp(((ji0Var.getScaleX() * qi0Var.P.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                pyVar.f40559b = ((ji0Var.getScaleY() * qi0Var.P.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
