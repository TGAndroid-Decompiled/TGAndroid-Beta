package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k3 implements View.OnClickListener {
    public final int f33124a;
    public final Object f33125b;

    public k3(Object obj, int i10) {
        this.f33124a = i10;
        this.f33125b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33124a) {
            case 0:
                pf.d.t((Activity) this.f33125b, "https://fragment.com/");
                return;
            case 1:
                ((z3) this.f33125b).dismiss();
                return;
            case 2:
                ((Runnable) this.f33125b).run();
                return;
            case 3:
                c6 c6Var = (c6) this.f33125b;
                if (!c6Var.f32761x && c6Var.f32758r && !c6Var.h.b()) {
                    c6Var.h.setProgress(0.0f);
                    c6Var.h.d();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.f33125b;
                a2Var.c(!a2Var.b(), true);
                return;
            default:
                e8 e8Var = ((i8) this.f33125b).f33034b;
                e8Var.requestFocus();
                AndroidUtilities.showKeyboard(e8Var);
                return;
        }
    }
}
