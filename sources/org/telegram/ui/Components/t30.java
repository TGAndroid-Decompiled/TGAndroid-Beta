package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class t30 extends Paint {
    public final int f38148a;
    public final Object f38149b;

    public t30(Object obj, int i7) {
        super(1);
        this.f38148a = i7;
        this.f38149b = obj;
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f38148a) {
            case 0:
                super.setAlpha(i7);
                ((o40) this.f38149b).invalidate();
                return;
            case 1:
                super.setAlpha(i7);
                fk0 fk0Var = (fk0) this.f38149b;
                fk0Var.f33560a.setAlpha(Math.round(i7 * 0.2f));
                fk0Var.invalidate();
                return;
            default:
                super.setAlpha(i7);
                ((ProfileActivity) this.f38149b).fragmentView.invalidate();
                return;
        }
    }
}
