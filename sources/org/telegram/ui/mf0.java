package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f35549a;
    public final tf0 f35550b;
    public final int f35551c;

    public mf0(tf0 tf0Var, int i10, int i11) {
        this.f35549a = i11;
        this.f35550b = tf0Var;
        this.f35551c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35549a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f35550b, this.f35551c, 1));
                return;
            case 1:
                this.f35550b.A(this.f35551c);
                return;
            default:
                this.f35550b.f38082f.f40237f[this.f35551c].l(1.0f);
                return;
        }
    }
}
