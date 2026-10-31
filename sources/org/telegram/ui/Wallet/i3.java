package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class i3 implements View.OnClickListener {
    public final int f34708a;
    public final Object f34709b;

    public i3(Object obj, int i10) {
        this.f34708a = i10;
        this.f34709b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34708a) {
            case 0:
                ((p3) this.f34709b).dismiss();
                return;
            case 1:
                gf.f.t((Activity) this.f34709b, "https://fragment.com/");
                return;
            case 2:
                ((x4) this.f34709b).dismiss();
                return;
            case 3:
                ((Runnable) this.f34709b).run();
                return;
            case 4:
                a7 a7Var = (a7) this.f34709b;
                if (!a7Var.f34213y && a7Var.f34209r && !a7Var.h.b()) {
                    a7Var.h.setProgress(0.0f);
                    a7Var.h.d();
                    return;
                }
                return;
            case 5:
                y8 y8Var = (y8) this.f34709b;
                y8Var.b(!y8Var.f35428y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f34709b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                m9 m9Var = ((q9) this.f34709b).f35088c;
                m9Var.requestFocus();
                org.telegram.messenger.i0.J3(m9Var);
                return;
        }
    }
}
