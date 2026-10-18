package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t2 implements View.OnClickListener {
    public final int f34932a;
    public final Object f34933b;

    public t2(Object obj, int i10) {
        this.f34932a = i10;
        this.f34933b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34932a) {
            case 0:
                ((y2) this.f34933b).dismiss();
                return;
            case 1:
                pf.d.t((Activity) this.f34933b, "https://fragment.com/");
                return;
            case 2:
                ((j4) this.f34933b).dismiss();
                return;
            case 3:
                ((Runnable) this.f34933b).run();
                return;
            case 4:
                s6 s6Var = (s6) this.f34933b;
                if (!s6Var.f34917x && s6Var.f34914r && !s6Var.h.b()) {
                    s6Var.h.setProgress(0.0f);
                    s6Var.h.d();
                    return;
                }
                return;
            case 5:
                t8 t8Var = (t8) this.f34933b;
                t8Var.b(!t8Var.f34953x);
                return;
            case 6:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f34933b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                j9 j9Var = ((n9) this.f34933b).f34647b;
                j9Var.requestFocus();
                AndroidUtilities.showKeyboard(j9Var);
                return;
        }
    }
}
