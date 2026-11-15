package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class w30 extends Paint {
    public final int f41241a;
    public final Object f41242b;

    public w30(Object obj, int i7) {
        super(1);
        this.f41241a = i7;
        this.f41242b = obj;
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f41241a) {
            case 0:
                super.setAlpha(i7);
                ((r40) this.f41242b).invalidate();
                return;
            case 1:
                super.setAlpha(i7);
                kk0 kk0Var = (kk0) this.f41242b;
                kk0Var.f36540a.setAlpha(Math.round(i7 * 0.2f));
                kk0Var.invalidate();
                return;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.f41242b).fragmentView.invalidate();
                return;
        }
    }
}
