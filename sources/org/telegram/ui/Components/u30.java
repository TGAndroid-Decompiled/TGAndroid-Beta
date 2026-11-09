package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class u30 extends Paint {
    public final int f38576a;
    public final Object f38577b;

    public u30(Object obj, int i7) {
        super(1);
        this.f38576a = i7;
        this.f38577b = obj;
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f38576a) {
            case 0:
                super.setAlpha(i7);
                ((p40) this.f38577b).invalidate();
                return;
            case 1:
                super.setAlpha(i7);
                gk0 gk0Var = (gk0) this.f38577b;
                gk0Var.f33965a.setAlpha(Math.round(i7 * 0.2f));
                gk0Var.invalidate();
                return;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.f38577b).fragmentView.invalidate();
                return;
        }
    }
}
