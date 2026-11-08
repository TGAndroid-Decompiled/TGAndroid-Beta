package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class i3 implements View.OnClickListener {
    public final int f42624a;
    public final Object f42625b;

    public i3(Object obj, int i7) {
        this.f42624a = i7;
        this.f42625b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42624a) {
            case 0:
                ((o3) this.f42625b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f42625b, "https://fragment.com/", false);
                return;
            case 2:
                ((v4) this.f42625b).dismiss();
                return;
            case 3:
                ((Runnable) this.f42625b).run();
                return;
            case 4:
                v6 v6Var = (v6) this.f42625b;
                if (!v6Var.f43278y && v6Var.f43274r && !v6Var.h.b()) {
                    v6Var.h.setProgress(0.0f);
                    v6Var.h.d();
                    return;
                }
                return;
            case 5:
                s8 s8Var = (s8) this.f42625b;
                s8Var.b(!s8Var.f43151y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42625b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                h9 h9Var = ((l9) this.f42625b).f42749c;
                h9Var.requestFocus();
                org.telegram.messenger.g0.K3(h9Var);
                return;
        }
    }
}
