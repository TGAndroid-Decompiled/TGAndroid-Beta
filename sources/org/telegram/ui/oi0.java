package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class oi0 extends gz {
    public final int[] N;
    public final cj0 O;

    public oi0(cj0 cj0Var, ni0 ni0Var, int i10) {
        super(i10, ni0Var);
        this.O = cj0Var;
        this.N = new int[2];
    }

    @Override
    public final void h(fz fzVar) {
        cj0 cj0Var = this.O;
        vi0 vi0Var = cj0Var.K;
        if (fzVar != null) {
            if (cj0Var.f35143l0 != null) {
                fzVar.f36498c = true;
                float f7 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                fzVar.d = f10;
                fzVar.f36499e = f10;
                fzVar.f36496a = Utilities.clamp(cj0Var.f35143l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                fzVar.f36497b = cj0Var.f35143l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = cj0Var.Q;
            if (t1Var != null && t1Var.isAttachedToWindow() && cj0Var.Q.getMessageObject() != null && cj0Var.Q.getMessageObject().getId() == cj0Var.R) {
                org.telegram.ui.Cells.t1 t1Var2 = cj0Var.Q;
                int[] iArr = this.N;
                t1Var2.getLocationOnScreen(iArr);
                fzVar.f36498c = true;
                float f11 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                fzVar.d = f12;
                fzVar.f36499e = f12;
                float f13 = f11 / 2.0f;
                fzVar.f36496a = Utilities.clamp(((vi0Var.getScaleX() * cj0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                fzVar.f36497b = ((vi0Var.getScaleY() * cj0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
