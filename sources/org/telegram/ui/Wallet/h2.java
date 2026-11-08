package org.telegram.ui.Wallet;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f42581a;
    public final t2 f42582b;

    public h2(t2 t2Var, int i7) {
        this.f42581a = i7;
        this.f42582b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42581a) {
            case 0:
                t2 t2Var = this.f42582b;
                if (!t2Var.a() && !t2Var.d) {
                    t2Var.d = false;
                    if (!t2Var.f43167f) {
                        t2Var.f43167f = true;
                        t2Var.f43164b.c();
                    }
                    if (!t2Var.f43166e) {
                        t2Var.f43163a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                t2 t2Var2 = this.f42582b;
                if (!t2Var2.a() && !t2Var2.d) {
                    t2Var2.d = false;
                    if (!t2Var2.f43167f) {
                        t2Var2.f43167f = true;
                        t2Var2.f43164b.c();
                    }
                    if (!t2Var2.f43166e) {
                        t2Var2.f43163a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
