package org.telegram.ui.Wallet;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f34618a;
    public final u2 f34619b;

    public h2(u2 u2Var, int i10) {
        this.f34618a = i10;
        this.f34619b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34618a) {
            case 0:
                u2 u2Var = this.f34619b;
                if (!u2Var.a() && !u2Var.d) {
                    u2Var.d = false;
                    if (!u2Var.f35273f) {
                        u2Var.f35273f = true;
                        u2Var.f35271b.c();
                    }
                    if (!u2Var.e) {
                        u2Var.f35270a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                u2 u2Var2 = this.f34619b;
                if (!u2Var2.a() && !u2Var2.d) {
                    u2Var2.d = false;
                    if (!u2Var2.f35273f) {
                        u2Var2.f35273f = true;
                        u2Var2.f35271b.c();
                    }
                    if (!u2Var2.e) {
                        u2Var2.f35270a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
