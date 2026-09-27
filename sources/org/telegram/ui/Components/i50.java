package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class i50 extends Paint {
    public final int f25024a;
    public final Object f25025b;

    public i50(Object obj, int i10) {
        super(1);
        this.f25024a = i10;
        this.f25025b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f25024a) {
            case 0:
                super.setAlpha(i10);
                ((e60) this.f25025b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                km0 km0Var = (km0) this.f25025b;
                km0Var.f25793a.setAlpha(Math.round(i10 * 0.2f));
                km0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f25025b).fragmentView.invalidate();
                return;
        }
    }
}
