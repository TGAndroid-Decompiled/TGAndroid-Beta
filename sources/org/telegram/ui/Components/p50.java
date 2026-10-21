package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class p50 extends Paint {
    public final int f29218a;
    public final Object f29219b;

    public p50(Object obj, int i10) {
        super(1);
        this.f29218a = i10;
        this.f29219b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29218a) {
            case 0:
                super.setAlpha(i10);
                ((m60) this.f29219b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                vm0 vm0Var = (vm0) this.f29219b;
                vm0Var.f31311a.setAlpha(Math.round(i10 * 0.2f));
                vm0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f29219b).fragmentView.invalidate();
                return;
        }
    }
}
