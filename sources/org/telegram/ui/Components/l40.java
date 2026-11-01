package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class l40 extends Paint {
    public final int f28047a;
    public final Object f28048b;

    public l40(Object obj, int i10) {
        super(1);
        this.f28047a = i10;
        this.f28048b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28047a) {
            case 0:
                super.setAlpha(i10);
                ((e50) this.f28048b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                kl0 kl0Var = (kl0) this.f28048b;
                kl0Var.f27894a.setAlpha(Math.round(i10 * 0.2f));
                kl0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f28048b).fragmentView.invalidate();
                return;
        }
    }
}
