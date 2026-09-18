package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class a41 implements Runnable {
    public final int f31719a;
    public final c41 f31720b;

    public a41(c41 c41Var, int i10) {
        this.f31719a = i10;
        this.f31720b = c41Var;
    }

    @Override
    public final void run() {
        switch (this.f31719a) {
            case 0:
                c41 c41Var = this.f31720b;
                d41 d41Var = c41Var.v;
                if (c41Var.f32664a == 0) {
                    d41Var.dismiss();
                    return;
                } else {
                    d41Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f31720b.f32668n.f20240b);
                return;
        }
    }
}
