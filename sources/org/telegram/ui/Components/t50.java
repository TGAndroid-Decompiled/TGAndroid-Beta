package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class t50 extends Paint {
    public final int f29278a;
    public final Object f29279b;

    public t50(Object obj, int i10) {
        super(1);
        this.f29278a = i10;
        this.f29279b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29278a) {
            case 0:
                super.setAlpha(i10);
                ((p60) this.f29279b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                ym0 ym0Var = (ym0) this.f29279b;
                ym0Var.f31648a.setAlpha(Math.round(i10 * 0.2f));
                ym0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f29279b).fragmentView.invalidate();
                return;
        }
    }
}
