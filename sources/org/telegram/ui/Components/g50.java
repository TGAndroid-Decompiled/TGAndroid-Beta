package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class g50 extends Paint {
    public final int f24353a;
    public final Object f24354b;

    public g50(Object obj, int i10) {
        super(1);
        this.f24353a = i10;
        this.f24354b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24353a) {
            case 0:
                super.setAlpha(i10);
                ((c60) this.f24354b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                im0 im0Var = (im0) this.f24354b;
                im0Var.f25090a.setAlpha(Math.round(i10 * 0.2f));
                im0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24354b).fragmentView.invalidate();
                return;
        }
    }
}
