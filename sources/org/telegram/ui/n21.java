package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n21 implements Runnable {
    public final int f39324a;
    public final p21 f39325b;

    public n21(p21 p21Var, int i10) {
        this.f39324a = i10;
        this.f39325b = p21Var;
    }

    @Override
    public final void run() {
        switch (this.f39324a) {
            case 0:
                p21 p21Var = this.f39325b;
                q21 q21Var = p21Var.v;
                if (p21Var.f39960a == 0) {
                    q21Var.dismiss();
                    return;
                } else {
                    q21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f39325b.f39964n.f22405b);
                return;
        }
    }
}
