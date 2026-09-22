package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class f50 extends Paint {
    public final int f24112a;
    public final Object f24113b;

    public f50(Object obj, int i10) {
        super(1);
        this.f24112a = i10;
        this.f24113b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24112a) {
            case 0:
                super.setAlpha(i10);
                ((c60) this.f24113b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                km0 km0Var = (km0) this.f24113b;
                km0Var.f25761a.setAlpha(Math.round(i10 * 0.2f));
                km0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24113b).fragmentView.invalidate();
                return;
        }
    }
}
