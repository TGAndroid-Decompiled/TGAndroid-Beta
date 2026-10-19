package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class p50 extends Paint {
    public final int f29172a;
    public final Object f29173b;

    public p50(Object obj, int i10) {
        super(1);
        this.f29172a = i10;
        this.f29173b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29172a) {
            case 0:
                super.setAlpha(i10);
                ((m60) this.f29173b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                um0 um0Var = (um0) this.f29173b;
                um0Var.f31022a.setAlpha(Math.round(i10 * 0.2f));
                um0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f29173b).fragmentView.invalidate();
                return;
        }
    }
}
