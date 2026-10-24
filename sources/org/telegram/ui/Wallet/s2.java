package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s2 implements View.OnClickListener {
    public final int f35124a;
    public final Object f35125b;

    public s2(Object obj, int i10) {
        this.f35124a = i10;
        this.f35125b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35124a) {
            case 0:
                ((y2) this.f35125b).dismiss();
                return;
            case 1:
                pf.d.t((Activity) this.f35125b, "https://fragment.com/");
                return;
            case 2:
                ((j4) this.f35125b).dismiss();
                return;
            case 3:
                ((Runnable) this.f35125b).run();
                return;
            case 4:
                m6 m6Var = (m6) this.f35125b;
                if (!m6Var.f34879x && m6Var.f34876r && !m6Var.h.b()) {
                    m6Var.h.setProgress(0.0f);
                    m6Var.h.d();
                    return;
                }
                return;
            case 5:
                o8 o8Var = (o8) this.f35125b;
                o8Var.b(!o8Var.f34978x);
                return;
            case 6:
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.f35125b;
                z1Var.c(!z1Var.b(), true);
                return;
            default:
                e9 e9Var = ((i9) this.f35125b).f34613c;
                e9Var.requestFocus();
                AndroidUtilities.showKeyboard(e9Var);
                return;
        }
    }
}
