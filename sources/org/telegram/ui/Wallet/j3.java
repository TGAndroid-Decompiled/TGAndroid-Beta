package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class j3 implements View.OnClickListener {
    public final int f34754a;
    public final Object f34755b;

    public j3(Object obj, int i10) {
        this.f34754a = i10;
        this.f34755b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34754a) {
            case 0:
                ((p3) this.f34755b).dismiss();
                return;
            case 1:
                gf.f.t((Activity) this.f34755b, "https://fragment.com/");
                return;
            case 2:
                ((x4) this.f34755b).dismiss();
                return;
            case 3:
                ((Runnable) this.f34755b).run();
                return;
            case 4:
                a7 a7Var = (a7) this.f34755b;
                if (!a7Var.f34212y && a7Var.f34208r && !a7Var.h.b()) {
                    a7Var.h.setProgress(0.0f);
                    a7Var.h.d();
                    return;
                }
                return;
            case 5:
                y8 y8Var = (y8) this.f34755b;
                y8Var.b(!y8Var.f35431y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f34755b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                m9 m9Var = ((q9) this.f34755b).f35094c;
                m9Var.requestFocus();
                org.telegram.messenger.i0.J3(m9Var);
                return;
        }
    }
}
