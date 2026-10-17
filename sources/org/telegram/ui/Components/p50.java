package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class p50 extends Paint {
    public final int f29185a;
    public final Object f29186b;

    public p50(Object obj, int i10) {
        super(1);
        this.f29185a = i10;
        this.f29186b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f29185a) {
            case 0:
                super.setAlpha(i10);
                ((m60) this.f29186b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                um0 um0Var = (um0) this.f29186b;
                um0Var.f31049a.setAlpha(Math.round(i10 * 0.2f));
                um0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f29186b).fragmentView.invalidate();
                return;
        }
    }
}
