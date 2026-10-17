package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ai0 extends qy {
    public final int[] N;
    public final oi0 O;

    public ai0(oi0 oi0Var, zh0 zh0Var, int i10) {
        super(i10, zh0Var);
        this.O = oi0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(py pyVar) {
        oi0 oi0Var = this.O;
        hi0 hi0Var = oi0Var.K;
        if (pyVar != null) {
            if (oi0Var.f39802l0 != null) {
                pyVar.f40258c = true;
                float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                pyVar.d = f10;
                pyVar.e = f10;
                pyVar.f40256a = Utilities.clamp(oi0Var.f39802l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                pyVar.f40257b = oi0Var.f39802l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = oi0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && oi0Var.Q.getMessageObject() != null && oi0Var.Q.getMessageObject().getId() == oi0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = oi0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                pyVar.f40258c = true;
                float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                pyVar.d = f12;
                pyVar.e = f12;
                float f13 = f11 / 2.0f;
                pyVar.f40256a = Utilities.clamp(((hi0Var.getScaleX() * oi0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                pyVar.f40257b = ((hi0Var.getScaleY() * oi0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
