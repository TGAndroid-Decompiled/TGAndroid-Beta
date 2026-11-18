package org.telegram.ui.Wallet;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f44611a;
    public final y2 f44612b;

    public n2(y2 y2Var, int i7) {
        this.f44611a = i7;
        this.f44612b = y2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44611a) {
            case 0:
                y2 y2Var = this.f44612b;
                if (!y2Var.a() && !y2Var.d) {
                    y2Var.d = false;
                    if (!y2Var.f45303f) {
                        y2Var.f45303f = true;
                        y2Var.f45300b.c();
                    }
                    if (!y2Var.f45302e) {
                        y2Var.f45299a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f44612b;
                if (!y2Var2.a() && !y2Var2.d) {
                    y2Var2.d = false;
                    if (!y2Var2.f45303f) {
                        y2Var2.f45303f = true;
                        y2Var2.f45300b.c();
                    }
                    if (!y2Var2.f45302e) {
                        y2Var2.f45299a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
