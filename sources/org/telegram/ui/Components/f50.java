package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class f50 extends Paint {
    public final int f24003a;
    public final Object f24004b;

    public f50(Object obj, int i10) {
        super(1);
        this.f24003a = i10;
        this.f24004b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24003a) {
            case 0:
                super.setAlpha(i10);
                ((a60) this.f24004b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                im0 im0Var = (im0) this.f24004b;
                float f7 = i10;
                im0Var.f25075a.setAlpha(Math.round(0.2f * f7));
                im0Var.f25076b.setAlpha(Math.round(f7 * 0.6f));
                im0Var.f25077c.setAlpha(i10);
                im0Var.d.setAlpha(i10);
                im0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24004b).fragmentView.invalidate();
                return;
        }
    }
}
