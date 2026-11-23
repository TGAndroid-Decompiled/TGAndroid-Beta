package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class h40 extends Paint {
    public final int f35733a;
    public final Object f35734b;

    public h40(Object obj, int i7) {
        super(1);
        this.f35733a = i7;
        this.f35734b = obj;
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f35733a) {
            case 0:
                super.setAlpha(i7);
                ((c50) this.f35734b).invalidate();
                return;
            case 1:
                super.setAlpha(i7);
                uk0 uk0Var = (uk0) this.f35734b;
                uk0Var.f40456a.setAlpha(Math.round(i7 * 0.2f));
                uk0Var.invalidate();
                return;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.f35734b).fragmentView.invalidate();
                return;
        }
    }
}
