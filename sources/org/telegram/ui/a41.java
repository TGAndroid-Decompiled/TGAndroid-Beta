package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class a41 implements Runnable {
    public final int f31715a;
    public final c41 f31716b;

    public a41(c41 c41Var, int i10) {
        this.f31715a = i10;
        this.f31716b = c41Var;
    }

    @Override
    public final void run() {
        switch (this.f31715a) {
            case 0:
                c41 c41Var = this.f31716b;
                d41 d41Var = c41Var.v;
                if (c41Var.f32660a == 0) {
                    d41Var.dismiss();
                    return;
                } else {
                    d41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f31716b.f32664n.f20239b);
                return;
        }
    }
}
