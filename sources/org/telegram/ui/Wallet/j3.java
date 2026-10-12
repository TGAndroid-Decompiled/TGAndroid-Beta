package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j3 implements View.OnClickListener {
    public final int f33351a;
    public final Object f33352b;

    public j3(Object obj, int i10) {
        this.f33351a = i10;
        this.f33352b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33351a) {
            case 0:
                pf.d.u((Activity) this.f33352b, "https://fragment.com/");
                return;
            case 1:
                ((y3) this.f33352b).dismiss();
                return;
            case 2:
                ((Runnable) this.f33352b).run();
                return;
            case 3:
                b6 b6Var = (b6) this.f33352b;
                if (!b6Var.f32985x && b6Var.f32982r && !b6Var.h.b()) {
                    b6Var.h.setProgress(0.0f);
                    b6Var.h.d();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f33352b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                d8 d8Var = ((h8) this.f33352b).f33251b;
                d8Var.requestFocus();
                AndroidUtilities.showKeyboard(d8Var);
                return;
        }
    }
}
