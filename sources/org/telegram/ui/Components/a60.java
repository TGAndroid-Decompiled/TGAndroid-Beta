package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class a60 extends Paint {
    public final int f24241a;
    public final Object f24242b;

    public a60(Object obj, int i10) {
        super(1);
        this.f24241a = i10;
        this.f24242b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24241a) {
            case 0:
                super.setAlpha(i10);
                ((w60) this.f24242b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                in0 in0Var = (in0) this.f24242b;
                in0Var.f27237a.setAlpha(Math.round(i10 * 0.2f));
                in0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24242b).fragmentView.invalidate();
                return;
        }
    }
}
