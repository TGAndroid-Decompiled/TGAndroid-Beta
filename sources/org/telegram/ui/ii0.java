package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ii0 extends dz {
    public final int[] N;
    public final wi0 O;

    public ii0(wi0 wi0Var, hi0 hi0Var, int i10) {
        super(i10, hi0Var);
        this.O = wi0Var;
        this.N = new int[2];
    }

    @Override
    public final void h(cz czVar) {
        wi0 wi0Var = this.O;
        pi0 pi0Var = wi0Var.K;
        if (czVar != null) {
            if (wi0Var.f39011l0 != null) {
                czVar.f32442c = true;
                float f7 = (dz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                czVar.d = f10;
                czVar.e = f10;
                czVar.f32440a = Utilities.clamp(wi0Var.f39011l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                czVar.f32441b = wi0Var.f39011l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = wi0Var.Q;
            if (t1Var != null && t1Var.isAttachedToWindow() && wi0Var.Q.getMessageObject() != null && wi0Var.Q.getMessageObject().getId() == wi0Var.R) {
                org.telegram.ui.Cells.t1 t1Var2 = wi0Var.Q;
                int[] iArr = this.N;
                t1Var2.getLocationOnScreen(iArr);
                czVar.f32442c = true;
                float f11 = (dz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                czVar.d = f12;
                czVar.e = f12;
                float f13 = f11 / 2.0f;
                czVar.f32440a = Utilities.clamp(((pi0Var.getScaleX() * wi0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                czVar.f32441b = ((pi0Var.getScaleY() * wi0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
