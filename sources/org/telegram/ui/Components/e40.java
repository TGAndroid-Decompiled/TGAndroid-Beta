package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class e40 extends Paint {
    public final int f34568a;
    public final Object f34569b;

    public e40(Object obj, int i7) {
        super(1);
        this.f34568a = i7;
        this.f34569b = obj;
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f34568a) {
            case 0:
                super.setAlpha(i7);
                ((z40) this.f34569b).invalidate();
                return;
            case 1:
                super.setAlpha(i7);
                uk0 uk0Var = (uk0) this.f34569b;
                uk0Var.f40397a.setAlpha(Math.round(i7 * 0.2f));
                uk0Var.invalidate();
                return;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.f34569b).fragmentView.invalidate();
                return;
        }
    }
}
