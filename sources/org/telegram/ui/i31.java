package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class i31 implements Runnable {
    public final int f37735a;
    public final l31 f37736b;

    public i31(l31 l31Var, int i10) {
        this.f37735a = i10;
        this.f37736b = l31Var;
    }

    @Override
    public final void run() {
        switch (this.f37735a) {
            case 0:
                l31 l31Var = this.f37736b;
                m31 m31Var = l31Var.v;
                if (l31Var.f38571a == 0) {
                    m31Var.dismiss();
                    return;
                } else {
                    m31Var.onBackPressed();
                    return;
                }
            default:
                AndroidUtilities.showKeyboard(this.f37736b.f38576n.f22955b);
                return;
        }
    }
}
