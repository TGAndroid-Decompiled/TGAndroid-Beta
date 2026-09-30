package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f35553a;
    public final tf0 f35554b;
    public final int f35555c;

    public mf0(tf0 tf0Var, int i10, int i11) {
        this.f35553a = i11;
        this.f35554b = tf0Var;
        this.f35555c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35553a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f35554b, this.f35555c, 1));
                return;
            case 1:
                this.f35554b.A(this.f35555c);
                return;
            default:
                this.f35554b.f38082f.f40237f[this.f35555c].l(1.0f);
                return;
        }
    }
}
