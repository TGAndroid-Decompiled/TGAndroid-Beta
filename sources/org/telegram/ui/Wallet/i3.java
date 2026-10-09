package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class i3 implements View.OnClickListener {
    public final int f35007a;
    public final Object f35008b;

    public i3(Object obj, int i10) {
        this.f35007a = i10;
        this.f35008b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35007a) {
            case 0:
                of.f.u((Activity) this.f35008b, "https://fragment.com/");
                return;
            case 1:
                ((x3) this.f35008b).dismiss();
                return;
            case 2:
                ((Runnable) this.f35008b).run();
                return;
            case 3:
                b6 b6Var = (b6) this.f35008b;
                if (!b6Var.f34679x && b6Var.f34676r && !b6Var.h.b()) {
                    b6Var.h.setProgress(0.0f);
                    b6Var.h.d();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f35008b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                d8 d8Var = ((h8) this.f35008b).f34984b;
                d8Var.requestFocus();
                AndroidUtilities.showKeyboard(d8Var);
                return;
        }
    }
}
