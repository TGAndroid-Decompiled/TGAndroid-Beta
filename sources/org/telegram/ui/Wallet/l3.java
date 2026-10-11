package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l3 implements View.OnClickListener {
    public final int f35253a;
    public final Object f35254b;

    public l3(Object obj, int i10) {
        this.f35253a = i10;
        this.f35254b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35253a) {
            case 0:
                of.f.u((Activity) this.f35254b, "https://fragment.com/");
                return;
            case 1:
                ((a4) this.f35254b).dismiss();
                return;
            case 2:
                ((Runnable) this.f35254b).run();
                return;
            case 3:
                e6 e6Var = (e6) this.f35254b;
                if (!e6Var.f34903x && e6Var.f34900r && !e6Var.h.b()) {
                    e6Var.h.setProgress(0.0f);
                    e6Var.h.d();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f35254b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                g8 g8Var = ((k8) this.f35254b).f35207b;
                g8Var.requestFocus();
                AndroidUtilities.showKeyboard(g8Var);
                return;
        }
    }
}
