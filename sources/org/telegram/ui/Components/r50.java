package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class r50 extends Paint {
    public final int f32103a;
    public final Object f32104b;

    public r50(Object obj, int i10) {
        super(1);
        this.f32103a = i10;
        this.f32104b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f32103a) {
            case 0:
                super.setAlpha(i10);
                ((o60) this.f32104b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                dn0 dn0Var = (dn0) this.f32104b;
                dn0Var.f27569a.setAlpha(Math.round(i10 * 0.2f));
                dn0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f32104b).fragmentView.invalidate();
                return;
        }
    }
}
