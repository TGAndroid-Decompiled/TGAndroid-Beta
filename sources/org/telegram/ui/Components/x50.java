package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class x50 extends Paint {
    public final int f32751a;
    public final Object f32752b;

    public x50(Object obj, int i10) {
        super(1);
        this.f32751a = i10;
        this.f32752b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f32751a) {
            case 0:
                super.setAlpha(i10);
                ((t60) this.f32752b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                cn0 cn0Var = (cn0) this.f32752b;
                cn0Var.f25442a.setAlpha(Math.round(i10 * 0.2f));
                cn0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f32752b).fragmentView.invalidate();
                return;
        }
    }
}
