package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class j50 extends Paint {
    public final int f27605a;
    public final Object f27606b;

    public j50(Object obj, int i10) {
        super(1);
        this.f27605a = i10;
        this.f27606b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f27605a) {
            case 0:
                super.setAlpha(i10);
                ((f60) this.f27606b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                om0 om0Var = (om0) this.f27606b;
                om0Var.f29406a.setAlpha(Math.round(i10 * 0.2f));
                om0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f27606b).fragmentView.invalidate();
                return;
        }
    }
}
