package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class t50 extends Paint {
    public final int f28975a;
    public final Object f28976b;

    public t50(Object obj, int i10) {
        super(1);
        this.f28975a = i10;
        this.f28976b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28975a) {
            case 0:
                super.setAlpha(i10);
                ((p60) this.f28976b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                ym0 ym0Var = (ym0) this.f28976b;
                ym0Var.f31331a.setAlpha(Math.round(i10 * 0.2f));
                ym0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f28976b).fragmentView.invalidate();
                return;
        }
    }
}
