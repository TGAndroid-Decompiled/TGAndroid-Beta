package org.telegram.ui.Wallet;

import android.view.View;
public final class g2 implements View.OnClickListener {
    public final int f42522a;
    public final s2 f42523b;

    public g2(s2 s2Var, int i7) {
        this.f42522a = i7;
        this.f42523b = s2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42522a) {
            case 0:
                s2 s2Var = this.f42523b;
                if (!s2Var.a() && !s2Var.d) {
                    s2Var.d = false;
                    if (!s2Var.f43149f) {
                        s2Var.f43149f = true;
                        s2Var.f43146b.c();
                    }
                    if (!s2Var.f43148e) {
                        s2Var.f43145a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                s2 s2Var2 = this.f42523b;
                if (!s2Var2.a() && !s2Var2.d) {
                    s2Var2.d = false;
                    if (!s2Var2.f43149f) {
                        s2Var2.f43149f = true;
                        s2Var2.f43146b.c();
                    }
                    if (!s2Var2.f43148e) {
                        s2Var2.f43145a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
