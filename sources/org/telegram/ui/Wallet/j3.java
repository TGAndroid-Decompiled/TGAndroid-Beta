package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j3 implements View.OnClickListener {
    public final int f35078a;
    public final Object f35079b;

    public j3(Object obj, int i10) {
        this.f35078a = i10;
        this.f35079b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35078a) {
            case 0:
                of.f.u((Activity) this.f35079b, "https://fragment.com/");
                return;
            case 1:
                ((y3) this.f35079b).dismiss();
                return;
            case 2:
                ((Runnable) this.f35079b).run();
                return;
            case 3:
                c6 c6Var = (c6) this.f35079b;
                if (!c6Var.f34750x && c6Var.f34747r && !c6Var.h.b()) {
                    c6Var.h.setProgress(0.0f);
                    c6Var.h.d();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f35079b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                e8 e8Var = ((i8) this.f35079b).f35047b;
                e8Var.requestFocus();
                AndroidUtilities.showKeyboard(e8Var);
                return;
        }
    }
}
