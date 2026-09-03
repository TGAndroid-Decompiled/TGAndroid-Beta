package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n31 implements Runnable {
    public final int f36333a;
    public final p31 f36334b;

    public n31(p31 p31Var, int i10) {
        this.f36333a = i10;
        this.f36334b = p31Var;
    }

    @Override
    public final void run() {
        switch (this.f36333a) {
            case 0:
                p31 p31Var = this.f36334b;
                q31 q31Var = p31Var.v;
                if (p31Var.f36929a == 0) {
                    q31Var.dismiss();
                    return;
                } else {
                    q31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f36334b.f36933n.f21132b);
                return;
        }
    }
}
