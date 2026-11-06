package org.telegram.ui.Wallet;

import android.view.View;
public final class i2 implements View.OnClickListener {
    public final int f42611a;
    public final u2 f42612b;

    public i2(u2 u2Var, int i7) {
        this.f42611a = i7;
        this.f42612b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42611a) {
            case 0:
                u2 u2Var = this.f42612b;
                if (!u2Var.a() && !u2Var.d) {
                    u2Var.d = false;
                    if (!u2Var.f43199f) {
                        u2Var.f43199f = true;
                        u2Var.f43196b.c();
                    }
                    if (!u2Var.f43198e) {
                        u2Var.f43195a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                u2 u2Var2 = this.f42612b;
                if (!u2Var2.a() && !u2Var2.d) {
                    u2Var2.d = false;
                    if (!u2Var2.f43199f) {
                        u2Var2.f43199f = true;
                        u2Var2.f43196b.c();
                    }
                    if (!u2Var2.f43198e) {
                        u2Var2.f43195a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
