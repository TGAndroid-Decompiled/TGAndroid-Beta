package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class n50 extends Paint {
    public final int f28789a;
    public final Object f28790b;

    public n50(Object obj, int i10) {
        super(1);
        this.f28789a = i10;
        this.f28790b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28789a) {
            case 0:
                super.setAlpha(i10);
                ((l60) this.f28790b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                xm0 xm0Var = (xm0) this.f28790b;
                xm0Var.f32659a.setAlpha(Math.round(i10 * 0.2f));
                xm0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f28790b).fragmentView.invalidate();
                return;
        }
    }
}
