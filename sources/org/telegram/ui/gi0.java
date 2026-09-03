package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class gi0 extends dz {
    public final int[] K;
    public final ui0 L;

    public gi0(ui0 ui0Var, fi0 fi0Var, int i10) {
        super(i10, fi0Var);
        this.L = ui0Var;
        this.K = new int[2];
    }

    @Override
    public final void h(cz czVar) {
        ui0 ui0Var = this.L;
        ni0 ni0Var = ui0Var.H;
        if (czVar != null) {
            if (ui0Var.f38837i0 != null) {
                czVar.f33261c = true;
                float f10 = (dz.f() * AndroidUtilities.density) / 1.3f;
                float f11 = f10 / 3.0f;
                czVar.d = f11;
                czVar.e = f11;
                czVar.f33259a = Utilities.clamp(ui0Var.f38837i0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
                czVar.f33260b = ui0Var.f38837i0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.s1 s1Var = ui0Var.N;
            if (s1Var != null && s1Var.isAttachedToWindow() && ui0Var.N.getMessageObject() != null && ui0Var.N.getMessageObject().getId() == ui0Var.O) {
                org.telegram.ui.Cells.s1 s1Var2 = ui0Var.N;
                int[] iArr = this.K;
                s1Var2.getLocationOnScreen(iArr);
                czVar.f33261c = true;
                float f12 = (dz.f() * AndroidUtilities.density) / 1.3f;
                float f13 = f12 / 3.0f;
                czVar.d = f13;
                czVar.e = f13;
                float f14 = f12 / 2.0f;
                czVar.f33259a = Utilities.clamp(((ni0Var.getScaleX() * ui0Var.N.getTimeX()) + iArr[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                czVar.f33260b = ((ni0Var.getScaleY() * ui0Var.N.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
