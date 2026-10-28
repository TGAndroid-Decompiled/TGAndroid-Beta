package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class r50 extends Paint {
    public final int f32130a;
    public final Object f32131b;

    public r50(Object obj, int i10) {
        super(1);
        this.f32130a = i10;
        this.f32131b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f32130a) {
            case 0:
                super.setAlpha(i10);
                ((p60) this.f32131b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                en0 en0Var = (en0) this.f32131b;
                en0Var.f27893a.setAlpha(Math.round(i10 * 0.2f));
                en0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f32131b).fragmentView.invalidate();
                return;
        }
    }
}
