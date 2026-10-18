package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class n21 implements Runnable {
    public final int f39283a;
    public final p21 f39284b;

    public n21(p21 p21Var, int i10) {
        this.f39283a = i10;
        this.f39284b = p21Var;
    }

    @Override
    public final void run() {
        switch (this.f39283a) {
            case 0:
                p21 p21Var = this.f39284b;
                q21 q21Var = p21Var.v;
                if (p21Var.f39921a == 0) {
                    q21Var.dismiss();
                    return;
                } else {
                    q21Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f39284b.f39925n.f22398b);
                return;
        }
    }
}
