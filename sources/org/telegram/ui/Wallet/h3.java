package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class h3 implements View.OnClickListener {
    public final int f42582a;
    public final Object f42583b;

    public h3(Object obj, int i7) {
        this.f42582a = i7;
        this.f42583b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42582a) {
            case 0:
                ((p3) this.f42583b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f42583b, "https://fragment.com/", false);
                return;
            case 2:
                ((x4) this.f42583b).dismiss();
                return;
            case 3:
                ((Runnable) this.f42583b).run();
                return;
            case 4:
                x6 x6Var = (x6) this.f42583b;
                if (!x6Var.f43355y && x6Var.f43351r && !x6Var.h.b()) {
                    x6Var.h.setProgress(0.0f);
                    x6Var.h.d();
                    return;
                }
                return;
            case 5:
                u8 u8Var = (u8) this.f42583b;
                u8Var.b(!u8Var.f43243y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42583b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                j9 j9Var = ((n9) this.f42583b).f42869c;
                j9Var.requestFocus();
                org.telegram.messenger.g0.K3(j9Var);
                return;
        }
    }
}
