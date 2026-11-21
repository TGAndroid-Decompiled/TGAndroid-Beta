package org.telegram.ui.Wallet;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f44651a;
    public final y2 f44652b;

    public n2(y2 y2Var, int i7) {
        this.f44651a = i7;
        this.f44652b = y2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44651a) {
            case 0:
                y2 y2Var = this.f44652b;
                if (!y2Var.a() && !y2Var.d) {
                    y2Var.d = false;
                    if (!y2Var.f45343f) {
                        y2Var.f45343f = true;
                        y2Var.f45340b.c();
                    }
                    if (!y2Var.f45342e) {
                        y2Var.f45339a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f44652b;
                if (!y2Var2.a() && !y2Var2.d) {
                    y2Var2.d = false;
                    if (!y2Var2.f45343f) {
                        y2Var2.f45343f = true;
                        y2Var2.f45340b.c();
                    }
                    if (!y2Var2.f45342e) {
                        y2Var2.f45339a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
