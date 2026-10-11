package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class y50 extends Paint {
    public final int f33091a;
    public final Object f33092b;

    public y50(Object obj, int i10) {
        super(1);
        this.f33091a = i10;
        this.f33092b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f33091a) {
            case 0:
                super.setAlpha(i10);
                ((u60) this.f33092b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                en0 en0Var = (en0) this.f33092b;
                en0Var.f26104a.setAlpha(Math.round(i10 * 0.2f));
                en0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f33092b).fragmentView.invalidate();
                return;
        }
    }
}
