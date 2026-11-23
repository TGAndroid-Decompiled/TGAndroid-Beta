package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class o3 implements View.OnClickListener {
    public final int f44709a;
    public final Object f44710b;

    public o3(Object obj, int i7) {
        this.f44709a = i7;
        this.f44710b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44709a) {
            case 0:
                ((w3) this.f44710b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f44710b, "https://fragment.com/", false);
                return;
            case 2:
                ((l5) this.f44710b).dismiss();
                return;
            case 3:
                ((Runnable) this.f44710b).run();
                return;
            case 4:
                m7 m7Var = (m7) this.f44710b;
                if (!m7Var.f44600y && m7Var.f44596r && !m7Var.h.b()) {
                    m7Var.h.setProgress(0.0f);
                    m7Var.h.d();
                    return;
                }
                return;
            case 5:
                j9 j9Var = (j9) this.f44710b;
                j9Var.b(!j9Var.E);
                return;
            case 6:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f44710b;
                d2Var.c(!d2Var.b(), true);
                return;
            default:
                y9 y9Var = ((ca) this.f44710b).f44017c;
                y9Var.requestFocus();
                org.telegram.messenger.g0.I3(y9Var);
                return;
        }
    }
}
