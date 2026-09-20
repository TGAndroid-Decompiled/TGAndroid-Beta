package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pi0 extends gz {
    public final int[] N;
    public final dj0 O;

    public pi0(dj0 dj0Var, oi0 oi0Var, int i10) {
        super(i10, oi0Var);
        this.O = dj0Var;
        this.N = new int[2];
    }

    @Override
    public final void h(fz fzVar) {
        dj0 dj0Var = this.O;
        wi0 wi0Var = dj0Var.K;
        if (fzVar != null) {
            if (dj0Var.f33073l0 != null) {
                fzVar.f33756c = true;
                float f7 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f10 = f7 / 3.0f;
                fzVar.d = f10;
                fzVar.e = f10;
                fzVar.f33754a = Utilities.clamp(dj0Var.f33073l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
                fzVar.f33755b = dj0Var.f33073l0.bottom - (f7 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.u1 u1Var = dj0Var.Q;
            if (u1Var != null && u1Var.isAttachedToWindow() && dj0Var.Q.getMessageObject() != null && dj0Var.Q.getMessageObject().getId() == dj0Var.R) {
                org.telegram.ui.Cells.u1 u1Var2 = dj0Var.Q;
                int[] iArr = this.N;
                u1Var2.getLocationOnScreen(iArr);
                fzVar.f33756c = true;
                float f11 = (gz.f() * AndroidUtilities.density) / 1.3f;
                float f12 = f11 / 3.0f;
                fzVar.d = f12;
                fzVar.e = f12;
                float f13 = f11 / 2.0f;
                fzVar.f33754a = Utilities.clamp(((wi0Var.getScaleX() * dj0Var.Q.getTimeX()) + iArr[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
                fzVar.f33755b = ((wi0Var.getScaleY() * dj0Var.Q.getTimeY()) + iArr[1]) - f13;
            }
        }
    }
}
