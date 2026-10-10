package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k3 implements View.OnClickListener {
    public final int f35189a;
    public final Object f35190b;

    public k3(Object obj, int i10) {
        this.f35189a = i10;
        this.f35190b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35189a) {
            case 0:
                of.f.u((Activity) this.f35190b, "https://fragment.com/");
                return;
            case 1:
                ((z3) this.f35190b).dismiss();
                return;
            case 2:
                ((Runnable) this.f35190b).run();
                return;
            case 3:
                d6 d6Var = (d6) this.f35190b;
                if (!d6Var.f34839x && d6Var.f34836r && !d6Var.h.b()) {
                    d6Var.h.setProgress(0.0f);
                    d6Var.h.d();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f35190b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                f8 f8Var = ((j8) this.f35190b).f35143b;
                f8Var.requestFocus();
                AndroidUtilities.showKeyboard(f8Var);
                return;
        }
    }
}
