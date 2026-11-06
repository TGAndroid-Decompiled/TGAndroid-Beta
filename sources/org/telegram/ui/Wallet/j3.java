package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class j3 implements View.OnClickListener {
    public final int f42630a;
    public final Object f42631b;

    public j3(Object obj, int i7) {
        this.f42630a = i7;
        this.f42631b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42630a) {
            case 0:
                ((p3) this.f42631b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f42631b, "https://fragment.com/", false);
                return;
            case 2:
                ((w4) this.f42631b).dismiss();
                return;
            case 3:
                ((Runnable) this.f42631b).run();
                return;
            case 4:
                w6 w6Var = (w6) this.f42631b;
                if (!w6Var.f43283y && w6Var.f43279r && !w6Var.h.b()) {
                    w6Var.h.setProgress(0.0f);
                    w6Var.h.d();
                    return;
                }
                return;
            case 5:
                t8 t8Var = (t8) this.f42631b;
                t8Var.b(!t8Var.f43157y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42631b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                i9 i9Var = ((m9) this.f42631b).f42755c;
                i9Var.requestFocus();
                org.telegram.messenger.g0.K3(i9Var);
                return;
        }
    }
}
