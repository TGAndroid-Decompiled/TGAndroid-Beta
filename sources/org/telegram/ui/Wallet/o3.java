package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class o3 implements View.OnClickListener {
    public final int f44743a;
    public final Object f44744b;

    public o3(Object obj, int i7) {
        this.f44743a = i7;
        this.f44744b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44743a) {
            case 0:
                ((w3) this.f44744b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f44744b, "https://fragment.com/", false);
                return;
            case 2:
                ((l5) this.f44744b).dismiss();
                return;
            case 3:
                ((Runnable) this.f44744b).run();
                return;
            case 4:
                m7 m7Var = (m7) this.f44744b;
                if (!m7Var.f44634y && m7Var.f44630r && !m7Var.h.b()) {
                    m7Var.h.setProgress(0.0f);
                    m7Var.h.d();
                    return;
                }
                return;
            case 5:
                j9 j9Var = (j9) this.f44744b;
                j9Var.b(!j9Var.E);
                return;
            case 6:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.f44744b;
                d2Var.c(!d2Var.b(), true);
                return;
            default:
                y9 y9Var = ((ca) this.f44744b).f44051c;
                y9Var.requestFocus();
                org.telegram.messenger.g0.I3(y9Var);
                return;
        }
    }
}
