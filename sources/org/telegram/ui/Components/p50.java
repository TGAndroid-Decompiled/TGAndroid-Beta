package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class p50 extends Paint {
    public final int f29423a;
    public final Object f29424b;

    public p50(Object obj, int i10) {
        super(1);
        this.f29423a = i10;
        this.f29424b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29423a) {
            case 0:
                super.setAlpha(i10);
                ((n60) this.f29424b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                ym0 ym0Var = (ym0) this.f29424b;
                ym0Var.f32998a.setAlpha(Math.round(i10 * 0.2f));
                ym0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f29424b).fragmentView.invalidate();
                return;
        }
    }
}
