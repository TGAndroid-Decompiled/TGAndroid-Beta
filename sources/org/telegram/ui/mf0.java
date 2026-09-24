package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f35537a;
    public final tf0 f35538b;
    public final int f35539c;

    public mf0(tf0 tf0Var, int i10, int i11) {
        this.f35537a = i11;
        this.f35538b = tf0Var;
        this.f35539c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35537a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f35538b, this.f35539c, 1));
                return;
            case 1:
                this.f35538b.A(this.f35539c);
                return;
            default:
                this.f35538b.f38065f.f40221f[this.f35539c].l(1.0f);
                return;
        }
    }
}
