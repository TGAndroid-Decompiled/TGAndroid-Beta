package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class p3 implements View.OnClickListener {
    public final int f44871a;
    public final Object f44872b;

    public p3(Object obj, int i7) {
        this.f44871a = i7;
        this.f44872b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44871a) {
            case 0:
                ((x3) this.f44872b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f44872b, "https://fragment.com/", false);
                return;
            case 2:
                ((l5) this.f44872b).dismiss();
                return;
            case 3:
                ((Runnable) this.f44872b).run();
                return;
            case 4:
                n7 n7Var = (n7) this.f44872b;
                if (!n7Var.f44774y && n7Var.f44770r && !n7Var.h.b()) {
                    n7Var.h.setProgress(0.0f);
                    n7Var.h.d();
                    return;
                }
                return;
            case 5:
                k9 k9Var = (k9) this.f44872b;
                k9Var.b(!k9Var.E);
                return;
            case 6:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f44872b;
                d2Var.c(!d2Var.b(), true);
                return;
            default:
                z9 z9Var = ((da) this.f44872b).f44177c;
                z9Var.requestFocus();
                org.telegram.messenger.g0.I3(z9Var);
                return;
        }
    }
}
