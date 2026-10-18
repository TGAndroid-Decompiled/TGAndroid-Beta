package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t2 implements View.OnClickListener {
    public final int f34877a;
    public final Object f34878b;

    public t2(Object obj, int i10) {
        this.f34877a = i10;
        this.f34878b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34877a) {
            case 0:
                ((z2) this.f34878b).dismiss();
                return;
            case 1:
                pf.d.t((Activity) this.f34878b, "https://fragment.com/");
                return;
            case 2:
                ((k4) this.f34878b).dismiss();
                return;
            case 3:
                ((Runnable) this.f34878b).run();
                return;
            case 4:
                m6 m6Var = (m6) this.f34878b;
                if (!m6Var.f34555x && m6Var.f34552r && !m6Var.h.b()) {
                    m6Var.h.setProgress(0.0f);
                    m6Var.h.d();
                    return;
                }
                return;
            case 5:
                n8 n8Var = (n8) this.f34878b;
                n8Var.b(!n8Var.f34623x);
                return;
            case 6:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34878b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                d9 d9Var = ((h9) this.f34878b).f34278b;
                d9Var.requestFocus();
                AndroidUtilities.showKeyboard(d9Var);
                return;
        }
    }
}
