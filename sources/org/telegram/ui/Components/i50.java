package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class i50 extends Paint {
    public final int f24989a;
    public final Object f24990b;

    public i50(Object obj, int i10) {
        super(1);
        this.f24989a = i10;
        this.f24990b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24989a) {
            case 0:
                super.setAlpha(i10);
                ((e60) this.f24990b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                km0 km0Var = (km0) this.f24990b;
                km0Var.f25763a.setAlpha(Math.round(i10 * 0.2f));
                km0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24990b).fragmentView.invalidate();
                return;
        }
    }
}
