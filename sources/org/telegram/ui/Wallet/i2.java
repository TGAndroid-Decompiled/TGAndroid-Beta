package org.telegram.ui.Wallet;

import android.view.View;
public final class i2 implements View.OnClickListener {
    public final int f42610a;
    public final u2 f42611b;

    public i2(u2 u2Var, int i7) {
        this.f42610a = i7;
        this.f42611b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42610a) {
            case 0:
                u2 u2Var = this.f42611b;
                if (!u2Var.a() && !u2Var.d) {
                    u2Var.d = false;
                    if (!u2Var.f43198f) {
                        u2Var.f43198f = true;
                        u2Var.f43195b.c();
                    }
                    if (!u2Var.f43197e) {
                        u2Var.f43194a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                u2 u2Var2 = this.f42611b;
                if (!u2Var2.a() && !u2Var2.d) {
                    u2Var2.d = false;
                    if (!u2Var2.f43198f) {
                        u2Var2.f43198f = true;
                        u2Var2.f43195b.c();
                    }
                    if (!u2Var2.f43197e) {
                        u2Var2.f43194a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
