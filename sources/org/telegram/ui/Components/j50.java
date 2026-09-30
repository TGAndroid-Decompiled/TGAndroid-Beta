package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class j50 extends Paint {
    public final int f25300a;
    public final Object f25301b;

    public j50(Object obj, int i10) {
        super(1);
        this.f25300a = i10;
        this.f25301b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f25300a) {
            case 0:
                super.setAlpha(i10);
                ((f60) this.f25301b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                lm0 lm0Var = (lm0) this.f25301b;
                lm0Var.f26055a.setAlpha(Math.round(i10 * 0.2f));
                lm0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f25301b).fragmentView.invalidate();
                return;
        }
    }
}
