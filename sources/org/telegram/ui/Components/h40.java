package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class h40 extends Paint {
    public final int f35787a;
    public final Object f35788b;

    public h40(Object obj, int i7) {
        super(1);
        this.f35787a = i7;
        this.f35788b = obj;
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f35787a) {
            case 0:
                super.setAlpha(i7);
                ((c50) this.f35788b).invalidate();
                return;
            case 1:
                super.setAlpha(i7);
                uk0 uk0Var = (uk0) this.f35788b;
                uk0Var.f40479a.setAlpha(Math.round(i7 * 0.2f));
                uk0Var.invalidate();
                return;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.f35788b).fragmentView.invalidate();
                return;
        }
    }
}
