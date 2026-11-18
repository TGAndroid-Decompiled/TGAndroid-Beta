package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class e40 extends Paint {
    public final int f34600a;
    public final Object f34601b;

    public e40(Object obj, int i7) {
        super(1);
        this.f34600a = i7;
        this.f34601b = obj;
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f34600a) {
            case 0:
                super.setAlpha(i7);
                ((z40) this.f34601b).invalidate();
                return;
            case 1:
                super.setAlpha(i7);
                sk0 sk0Var = (sk0) this.f34601b;
                sk0Var.f39763a.setAlpha(Math.round(i7 * 0.2f));
                sk0Var.invalidate();
                return;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.f34601b).fragmentView.invalidate();
                return;
        }
    }
}
