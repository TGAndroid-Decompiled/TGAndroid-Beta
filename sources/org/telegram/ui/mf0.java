package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f35548a;
    public final tf0 f35549b;
    public final int f35550c;

    public mf0(tf0 tf0Var, int i10, int i11) {
        this.f35548a = i11;
        this.f35549b = tf0Var;
        this.f35550c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35548a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f35549b, this.f35550c, 1));
                return;
            case 1:
                this.f35549b.A(this.f35550c);
                return;
            default:
                this.f35549b.f38081f.f40236f[this.f35550c].l(1.0f);
                return;
        }
    }
}
