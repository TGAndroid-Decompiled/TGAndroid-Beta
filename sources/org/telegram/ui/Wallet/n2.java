package org.telegram.ui.Wallet;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f44621a;
    public final y2 f44622b;

    public n2(y2 y2Var, int i7) {
        this.f44621a = i7;
        this.f44622b = y2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44621a) {
            case 0:
                y2 y2Var = this.f44622b;
                if (!y2Var.a() && !y2Var.d) {
                    y2Var.d = false;
                    if (!y2Var.f45313f) {
                        y2Var.f45313f = true;
                        y2Var.f45310b.c();
                    }
                    if (!y2Var.f45312e) {
                        y2Var.f45309a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f44622b;
                if (!y2Var2.a() && !y2Var2.d) {
                    y2Var2.d = false;
                    if (!y2Var2.f45313f) {
                        y2Var2.f45313f = true;
                        y2Var2.f45310b.c();
                    }
                    if (!y2Var2.f45312e) {
                        y2Var2.f45309a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
