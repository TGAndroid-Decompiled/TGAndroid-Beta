package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class y50 extends Paint {
    public final int f33146a;
    public final Object f33147b;

    public y50(Object obj, int i10) {
        super(1);
        this.f33146a = i10;
        this.f33147b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f33146a) {
            case 0:
                super.setAlpha(i10);
                ((t60) this.f33147b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                dn0 dn0Var = (dn0) this.f33147b;
                dn0Var.f25848a.setAlpha(Math.round(i10 * 0.2f));
                dn0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f33147b).fragmentView.invalidate();
                return;
        }
    }
}
