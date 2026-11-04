package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class h3 implements View.OnClickListener {
    public final int f42612a;
    public final Object f42613b;

    public h3(Object obj, int i3) {
        this.f42612a = i3;
        this.f42613b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42612a) {
            case 0:
                ((n3) this.f42613b).dismiss();
                return;
            case 1:
                sf.c.v((Activity) this.f42613b, "https://fragment.com/", false);
                return;
            case 2:
                ((u4) this.f42613b).dismiss();
                return;
            case 3:
                ((Runnable) this.f42613b).run();
                return;
            case 4:
                u6 u6Var = (u6) this.f42613b;
                if (!u6Var.f43267y && u6Var.f43263r && !u6Var.h.b()) {
                    u6Var.h.setProgress(0.0f);
                    u6Var.h.d();
                    return;
                }
                return;
            case 5:
                s8 s8Var = (s8) this.f42613b;
                s8Var.b(!s8Var.f43175y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42613b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                h9 h9Var = ((l9) this.f42613b).f42795c;
                h9Var.requestFocus();
                org.telegram.messenger.g0.K3(h9Var);
                return;
        }
    }
}
