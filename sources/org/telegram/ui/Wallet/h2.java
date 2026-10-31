package org.telegram.ui.Wallet;

import android.view.View;
public final class h2 implements View.OnClickListener {
    public final int f34612a;
    public final t2 f34613b;

    public h2(t2 t2Var, int i10) {
        this.f34612a = i10;
        this.f34613b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34612a) {
            case 0:
                t2 t2Var = this.f34613b;
                if (!t2Var.a() && !t2Var.d) {
                    t2Var.d = false;
                    if (!t2Var.f35229f) {
                        t2Var.f35229f = true;
                        t2Var.f35227b.c();
                    }
                    if (!t2Var.e) {
                        t2Var.f35226a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                t2 t2Var2 = this.f34613b;
                if (!t2Var2.a() && !t2Var2.d) {
                    t2Var2.d = false;
                    if (!t2Var2.f35229f) {
                        t2Var2.f35229f = true;
                        t2Var2.f35227b.c();
                    }
                    if (!t2Var2.e) {
                        t2Var2.f35226a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
