package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class i50 extends Paint {
    public final int f25010a;
    public final Object f25011b;

    public i50(Object obj, int i10) {
        super(1);
        this.f25010a = i10;
        this.f25011b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f25010a) {
            case 0:
                super.setAlpha(i10);
                ((e60) this.f25011b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                km0 km0Var = (km0) this.f25011b;
                km0Var.f25764a.setAlpha(Math.round(i10 * 0.2f));
                km0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f25011b).fragmentView.invalidate();
                return;
        }
    }
}
