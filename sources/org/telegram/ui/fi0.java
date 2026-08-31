package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class fi0 extends cz {
    public final int[] K;
    public final ti0 L;

    public fi0(ti0 ti0Var, ei0 ei0Var, int i10) {
        super(i10, ei0Var);
        this.L = ti0Var;
        this.K = new int[2];
    }

    @Override
    public final void h(bz bzVar) {
        ti0 ti0Var = this.L;
        mi0 mi0Var = ti0Var.H;
        if (bzVar != null) {
            if (ti0Var.f41637i0 != null) {
                bzVar.f35615c = true;
                float f10 = (cz.f() * AndroidUtilities.density) / 1.3f;
                float f11 = f10 / 3.0f;
                bzVar.d = f11;
                bzVar.f35616e = f11;
                bzVar.f35613a = Utilities.clamp(ti0Var.f41637i0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
                bzVar.f35614b = ti0Var.f41637i0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = ti0Var.N;
            if (t1Var != null && t1Var.isAttachedToWindow() && ti0Var.N.getMessageObject() != null && ti0Var.N.getMessageObject().getId() == ti0Var.O) {
                org.telegram.ui.Cells.t1 t1Var2 = ti0Var.N;
                int[] iArr = this.K;
                t1Var2.getLocationOnScreen(iArr);
                bzVar.f35615c = true;
                float f12 = (cz.f() * AndroidUtilities.density) / 1.3f;
                float f13 = f12 / 3.0f;
                bzVar.d = f13;
                bzVar.f35616e = f13;
                float f14 = f12 / 2.0f;
                bzVar.f35613a = Utilities.clamp(((mi0Var.getScaleX() * ti0Var.N.getTimeX()) + iArr[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                bzVar.f35614b = ((mi0Var.getScaleY() * ti0Var.N.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
