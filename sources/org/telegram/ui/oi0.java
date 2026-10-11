package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oi0 extends ez {
    public final int[] N;
    public final cj0 O;

    public oi0(cj0 cj0Var, ni0 ni0Var, int i10) {
        super(i10, ni0Var);
        this.O = cj0Var;
        this.N = new int[2];
    }

    @Override
    public final void g(dz dzVar) {
        cj0 cj0Var = this.O;
        vi0 vi0Var = cj0Var.K;
        if (dzVar != null) {
            if (cj0Var.f36773l0 != null) {
                dzVar.f37180c = true;
                float f7 = (ez.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                dzVar.d = f10;
                dzVar.f37181e = f10;
                dzVar.f37178a = Utilities.clamp(cj0Var.f36773l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                dzVar.f37179b = cj0Var.f36773l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = cj0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && cj0Var.Q.getMessageObject() != null && cj0Var.Q.getMessageObject().getId() == cj0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = cj0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                dzVar.f37180c = true;
                float f11 = (ez.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                dzVar.d = f12;
                dzVar.f37181e = f12;
                float f13 = f11 / 2.0f;
                dzVar.f37178a = Utilities.clamp(((vi0Var.getScaleX() * cj0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                dzVar.f37179b = ((vi0Var.getScaleY() * cj0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
