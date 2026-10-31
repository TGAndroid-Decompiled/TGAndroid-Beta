package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class l40 extends Paint {
    public final int f28006a;
    public final Object f28007b;

    public l40(Object obj, int i10) {
        super(1);
        this.f28006a = i10;
        this.f28007b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f28006a) {
            case 0:
                super.setAlpha(i10);
                ((e50) this.f28007b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                jl0 jl0Var = (jl0) this.f28007b;
                jl0Var.f27398a.setAlpha(Math.round(i10 * 0.2f));
                jl0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f28007b).fragmentView.invalidate();
                return;
        }
    }
}
