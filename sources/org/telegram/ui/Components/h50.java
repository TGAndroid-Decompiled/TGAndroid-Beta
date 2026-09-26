package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class h50 extends Paint {
    public final int f24678a;
    public final Object f24679b;

    public h50(Object obj, int i10) {
        super(1);
        this.f24678a = i10;
        this.f24679b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24678a) {
            case 0:
                super.setAlpha(i10);
                ((d60) this.f24679b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                jm0 jm0Var = (jm0) this.f24679b;
                jm0Var.f25470a.setAlpha(Math.round(i10 * 0.2f));
                jm0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24679b).fragmentView.invalidate();
                return;
        }
    }
}
