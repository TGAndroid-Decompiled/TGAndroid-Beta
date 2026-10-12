package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l3 implements View.OnClickListener {
    public final int f35028a;
    public final Object f35029b;

    public l3(Object obj, int i10) {
        this.f35028a = i10;
        this.f35029b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35028a) {
            case 0:
                of.f.u((Activity) this.f35029b, "https://fragment.com/");
                return;
            case 1:
                ((a4) this.f35029b).dismiss();
                return;
            case 2:
                ((Runnable) this.f35029b).run();
                return;
            case 3:
                e6 e6Var = (e6) this.f35029b;
                if (!e6Var.f34678x && e6Var.f34675r && !e6Var.h.b()) {
                    e6Var.h.setProgress(0.0f);
                    e6Var.h.d();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f35029b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                g8 g8Var = ((k8) this.f35029b).f34981b;
                g8Var.requestFocus();
                AndroidUtilities.showKeyboard(g8Var);
                return;
        }
    }
}
