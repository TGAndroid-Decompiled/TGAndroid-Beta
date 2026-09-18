package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class f50 extends Paint {
    public final int f24019a;
    public final Object f24020b;

    public f50(Object obj, int i10) {
        super(1);
        this.f24019a = i10;
        this.f24020b = obj;
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f24019a) {
            case 0:
                super.setAlpha(i10);
                ((b60) this.f24020b).invalidate();
                return;
            case 1:
                super.setAlpha(i10);
                jm0 jm0Var = (jm0) this.f24020b;
                float f7 = i10;
                jm0Var.f25369a.setAlpha(Math.round(0.2f * f7));
                jm0Var.f25370b.setAlpha(Math.round(f7 * 0.6f));
                jm0Var.f25371c.setAlpha(i10);
                jm0Var.d.setAlpha(i10);
                jm0Var.invalidate();
                return;
            default:
                super.setAlpha(i10);
                ((ProfileActivity) this.f24020b).fragmentView.invalidate();
                return;
        }
    }
}
