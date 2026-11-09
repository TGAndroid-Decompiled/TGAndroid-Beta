package org.telegram.ui.Wallet;

import android.view.View;
public final class g2 implements View.OnClickListener {
    public final int f42500a;
    public final s2 f42501b;

    public g2(s2 s2Var, int i7) {
        this.f42500a = i7;
        this.f42501b = s2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42500a) {
            case 0:
                s2 s2Var = this.f42501b;
                if (!s2Var.a() && !s2Var.d) {
                    s2Var.d = false;
                    if (!s2Var.f43085f) {
                        s2Var.f43085f = true;
                        s2Var.f43082b.c();
                    }
                    if (!s2Var.f43084e) {
                        s2Var.f43081a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                s2 s2Var2 = this.f42501b;
                if (!s2Var2.a() && !s2Var2.d) {
                    s2Var2.d = false;
                    if (!s2Var2.f43085f) {
                        s2Var2.f43085f = true;
                        s2Var2.f43082b.c();
                    }
                    if (!s2Var2.f43084e) {
                        s2Var2.f43081a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
