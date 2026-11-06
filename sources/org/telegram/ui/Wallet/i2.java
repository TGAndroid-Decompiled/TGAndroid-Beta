package org.telegram.ui.Wallet;

import android.view.View;
public final class i2 implements View.OnClickListener {
    public final int f42586a;
    public final u2 f42587b;

    public i2(u2 u2Var, int i7) {
        this.f42586a = i7;
        this.f42587b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42586a) {
            case 0:
                u2 u2Var = this.f42587b;
                if (!u2Var.a() && !u2Var.d) {
                    u2Var.d = false;
                    if (!u2Var.f43174f) {
                        u2Var.f43174f = true;
                        u2Var.f43171b.c();
                    }
                    if (!u2Var.f43173e) {
                        u2Var.f43170a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                u2 u2Var2 = this.f42587b;
                if (!u2Var2.a() && !u2Var2.d) {
                    u2Var2.d = false;
                    if (!u2Var2.f43174f) {
                        u2Var2.f43174f = true;
                        u2Var2.f43171b.c();
                    }
                    if (!u2Var2.f43173e) {
                        u2Var2.f43170a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
