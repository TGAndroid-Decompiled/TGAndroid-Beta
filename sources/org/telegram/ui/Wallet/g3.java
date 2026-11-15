package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class g3 implements View.OnClickListener {
    public final int f43870a;
    public final Object f43871b;

    public g3(Object obj, int i7) {
        this.f43870a = i7;
        this.f43871b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43870a) {
            case 0:
                ((o3) this.f43871b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f43871b, "https://fragment.com/", false);
                return;
            case 2:
                ((w4) this.f43871b).dismiss();
                return;
            case 3:
                ((Runnable) this.f43871b).run();
                return;
            case 4:
                w6 w6Var = (w6) this.f43871b;
                if (!w6Var.f44654y && w6Var.f44650r && !w6Var.h.b()) {
                    w6Var.h.setProgress(0.0f);
                    w6Var.h.d();
                    return;
                }
                return;
            case 5:
                u8 u8Var = (u8) this.f43871b;
                u8Var.b(!u8Var.f44575y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f43871b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                k9 k9Var = ((o9) this.f43871b).f44275c;
                k9Var.requestFocus();
                org.telegram.messenger.g0.J3(k9Var);
                return;
        }
    }
}
