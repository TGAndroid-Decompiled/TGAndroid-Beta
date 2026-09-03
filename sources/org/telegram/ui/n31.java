package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n31 implements Runnable {
    public final int f39169a;
    public final p31 f39170b;

    public n31(p31 p31Var, int i10) {
        this.f39169a = i10;
        this.f39170b = p31Var;
    }

    @Override
    public final void run() {
        switch (this.f39169a) {
            case 0:
                p31 p31Var = this.f39170b;
                q31 q31Var = p31Var.v;
                if (p31Var.f39872a == 0) {
                    q31Var.dismiss();
                    return;
                } else {
                    q31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f39170b.f39877n.f22957b);
                return;
        }
    }
}
