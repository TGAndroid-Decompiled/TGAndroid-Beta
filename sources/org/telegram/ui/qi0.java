package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class qi0 extends hz {
    public final int[] N;
    public final ej0 O;

    public qi0(ej0 ej0Var, pi0 pi0Var, int i10) {
        super(i10, pi0Var);
        this.O = ej0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(gz gzVar) {
        ej0 ej0Var = this.O;
        xi0 xi0Var = ej0Var.K;
        if (gzVar != null) {
            if (ej0Var.f37146l0 != null) {
                gzVar.f38180c = true;
                float f7 = (hz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                gzVar.d = f10;
                gzVar.f38181e = f10;
                gzVar.f38178a = Utilities.clamp(ej0Var.f37146l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                gzVar.f38179b = ej0Var.f37146l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = ej0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && ej0Var.Q.getMessageObject() != null && ej0Var.Q.getMessageObject().getId() == ej0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = ej0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                gzVar.f38180c = true;
                float f11 = (hz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                gzVar.d = f12;
                gzVar.f38181e = f12;
                float f13 = f11 / 2.0f;
                gzVar.f38178a = Utilities.clamp(((xi0Var.getScaleX() * ej0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                gzVar.f38179b = ((xi0Var.getScaleY() * ej0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
