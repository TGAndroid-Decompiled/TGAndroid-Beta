package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class p21 implements Runnable {
    public final int f40335a;
    public final r21 f40336b;

    public p21(r21 r21Var, int i10) {
        this.f40335a = i10;
        this.f40336b = r21Var;
    }

    @Override
    public final void run() {
        switch (this.f40335a) {
            case 0:
                r21 r21Var = this.f40336b;
                s21 s21Var = r21Var.v;
                if (r21Var.f40979a == 0) {
                    s21Var.dismiss();
                    return;
                } else {
                    s21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f40336b.f40983n.d);
                return;
        }
    }
}
