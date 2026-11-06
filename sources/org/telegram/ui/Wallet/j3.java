package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
public final class j3 implements View.OnClickListener {
    public final int f42655a;
    public final Object f42656b;

    public j3(Object obj, int i7) {
        this.f42655a = i7;
        this.f42656b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42655a) {
            case 0:
                ((p3) this.f42656b).dismiss();
                return;
            case 1:
                vf.c.v((Activity) this.f42656b, "https://fragment.com/", false);
                return;
            case 2:
                ((w4) this.f42656b).dismiss();
                return;
            case 3:
                ((Runnable) this.f42656b).run();
                return;
            case 4:
                w6 w6Var = (w6) this.f42656b;
                if (!w6Var.f43308y && w6Var.f43304r && !w6Var.h.b()) {
                    w6Var.h.setProgress(0.0f);
                    w6Var.h.d();
                    return;
                }
                return;
            case 5:
                t8 t8Var = (t8) this.f42656b;
                t8Var.b(!t8Var.f43182y);
                return;
            case 6:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f42656b;
                c2Var.c(!c2Var.b(), true);
                return;
            default:
                i9 i9Var = ((m9) this.f42656b).f42780c;
                i9Var.requestFocus();
                org.telegram.messenger.g0.K3(i9Var);
                return;
        }
    }
}
