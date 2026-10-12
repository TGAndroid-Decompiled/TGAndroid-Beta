package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class a60 extends Paint {
    public final int f24240a;
    public final Object f24241b;

    public a60(Object obj, int i10) {
        super(1);
        this.f24240a = i10;
        this.f24241b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24240a) {
            case 0:
                super.setAlpha(i10);
                ((w60) this.f24241b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                in0 in0Var = (in0) this.f24241b;
                in0Var.f27243a.setAlpha(Math.round(i10 * 0.2f));
                in0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24241b).fragmentView.invalidate();
                return;
        }
    }
}
