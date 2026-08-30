package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ei0 extends bz {
    public final int[] K;
    public final si0 L;

    public ei0(si0 si0Var, di0 di0Var, int i10) {
        super(i10, di0Var);
        this.L = si0Var;
        this.K = new int[2];
    }

    @Override
    public final void h(az azVar) {
        si0 si0Var = this.L;
        li0 li0Var = si0Var.H;
        if (azVar != null) {
            if (si0Var.f38362i0 != null) {
                azVar.f32729c = true;
                float f10 = (bz.f() * AndroidUtilities.density) / 1.3f;
                float f11 = f10 / 3.0f;
                azVar.d = f11;
                azVar.e = f11;
                azVar.f32727a = Utilities.clamp(si0Var.f38362i0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
                azVar.f32728b = si0Var.f38362i0.bottom - (f10 / 2.0f);
                return;
            }
            org.telegram.ui.Cells.t1 t1Var = si0Var.N;
            if (t1Var != null && t1Var.isAttachedToWindow() && si0Var.N.getMessageObject() != null && si0Var.N.getMessageObject().getId() == si0Var.O) {
                org.telegram.ui.Cells.t1 t1Var2 = si0Var.N;
                int[] iArr = this.K;
                t1Var2.getLocationOnScreen(iArr);
                azVar.f32729c = true;
                float f12 = (bz.f() * AndroidUtilities.density) / 1.3f;
                float f13 = f12 / 3.0f;
                azVar.d = f13;
                azVar.e = f13;
                float f14 = f12 / 2.0f;
                azVar.f32727a = Utilities.clamp(((li0Var.getScaleX() * si0Var.N.getTimeX()) + iArr[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                azVar.f32728b = ((li0Var.getScaleY() * si0Var.N.getTimeY()) + iArr[1]) - f14;
            }
        }
    }
}
