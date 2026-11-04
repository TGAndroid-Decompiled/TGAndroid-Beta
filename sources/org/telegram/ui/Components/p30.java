package org.telegram.ui.Components;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class p30 extends Paint {
    public final int f37050a;
    public final Object f37051b;

    public p30(Object obj, int i3) {
        super(1);
        this.f37050a = i3;
        this.f37051b = obj;
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f37050a) {
            case 0:
                super.setAlpha(i3);
                ((k40) this.f37051b).invalidate();
                return;
            case 1:
                super.setAlpha(i3);
                jk0 jk0Var = (jk0) this.f37051b;
                jk0Var.f35095a.setAlpha(Math.round(i3 * 0.2f));
                jk0Var.invalidate();
                return;
            default:
                super.setAlpha(i3);
                ((ProfileActivity) this.f37051b).fragmentView.invalidate();
                return;
        }
    }
}
