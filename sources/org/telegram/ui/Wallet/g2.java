package org.telegram.ui.Wallet;

import android.view.View;
public final class g2 implements View.OnClickListener {
    public final int f42566a;
    public final s2 f42567b;

    public g2(s2 s2Var, int i3) {
        this.f42566a = i3;
        this.f42567b = s2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42566a) {
            case 0:
                s2 s2Var = this.f42567b;
                if (!s2Var.a() && !s2Var.d) {
                    s2Var.d = false;
                    if (!s2Var.f43148f) {
                        s2Var.f43148f = true;
                        s2Var.f43145b.c();
                    }
                    if (!s2Var.f43147e) {
                        s2Var.f43144a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                s2 s2Var2 = this.f42567b;
                if (!s2Var2.a() && !s2Var2.d) {
                    s2Var2.d = false;
                    if (!s2Var2.f43148f) {
                        s2Var2.f43148f = true;
                        s2Var2.f43145b.c();
                    }
                    if (!s2Var2.f43147e) {
                        s2Var2.f43144a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
