package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t2 implements View.OnClickListener {
    public final int f34892a;
    public final Object f34893b;

    public t2(Object obj, int i10) {
        this.f34892a = i10;
        this.f34893b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34892a) {
            case 0:
                ((x2) this.f34893b).dismiss();
                return;
            case 1:
                pf.d.t((Activity) this.f34893b, "https://fragment.com/");
                return;
            case 2:
                ((i4) this.f34893b).dismiss();
                return;
            case 3:
                ((Runnable) this.f34893b).run();
                return;
            case 4:
                p6 p6Var = (p6) this.f34893b;
                if (!p6Var.f34747x && p6Var.f34744r && !p6Var.h.b()) {
                    p6Var.h.setProgress(0.0f);
                    p6Var.h.d();
                    return;
                }
                return;
            case 5:
                q8 q8Var = (q8) this.f34893b;
                q8Var.b(!q8Var.f34815x);
                return;
            case 6:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34893b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                g9 g9Var = ((k9) this.f34893b).f34444b;
                g9Var.requestFocus();
                AndroidUtilities.showKeyboard(g9Var);
                return;
        }
    }
}
