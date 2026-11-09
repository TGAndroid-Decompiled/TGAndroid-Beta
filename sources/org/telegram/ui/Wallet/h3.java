package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class h3 implements View.OnClickListener {
    public final int f42543a;
    public final Object f42544b;

    public h3(Object obj, int i7) {
        this.f42543a = i7;
        this.f42544b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42543a) {
            case 0:
                ((n3) this.f42544b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f42544b, "https://fragment.com/", false);
                return;
            case 2:
                ((u4) this.f42544b).dismiss();
                return;
            case 3:
                ((Runnable) this.f42544b).run();
                return;
            case 4:
                u6 u6Var = (u6) this.f42544b;
                if (!u6Var.f43196y && u6Var.f43192r && !u6Var.h.b()) {
                    u6Var.h.setProgress(0.0f);
                    u6Var.h.d();
                    return;
                }
                return;
            case 5:
                r8 r8Var = (r8) this.f42544b;
                r8Var.b(!r8Var.f43069y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42544b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                g9 g9Var = ((k9) this.f42544b).f42668c;
                g9Var.requestFocus();
                org.telegram.messenger.g0.K3(g9Var);
                return;
        }
    }
}
