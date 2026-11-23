package org.telegram.ui.Wallet;

import android.view.View;
public final class n2 implements View.OnClickListener {
    public final int f44655a;
    public final y2 f44656b;

    public n2(y2 y2Var, int i7) {
        this.f44655a = i7;
        this.f44656b = y2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44655a) {
            case 0:
                y2 y2Var = this.f44656b;
                if (!y2Var.a() && !y2Var.d) {
                    y2Var.d = false;
                    if (!y2Var.f45347f) {
                        y2Var.f45347f = true;
                        y2Var.f45344b.c();
                    }
                    if (!y2Var.f45346e) {
                        y2Var.f45343a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f44656b;
                if (!y2Var2.a() && !y2Var2.d) {
                    y2Var2.d = false;
                    if (!y2Var2.f45347f) {
                        y2Var2.f45347f = true;
                        y2Var2.f45344b.c();
                    }
                    if (!y2Var2.f45346e) {
                        y2Var2.f45343a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
