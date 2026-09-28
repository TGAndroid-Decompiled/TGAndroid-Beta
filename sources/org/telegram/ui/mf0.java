package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f35550a;
    public final tf0 f35551b;
    public final int f35552c;

    public mf0(tf0 tf0Var, int i10, int i11) {
        this.f35550a = i11;
        this.f35551b = tf0Var;
        this.f35552c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35550a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f35551b, this.f35552c, 1));
                return;
            case 1:
                this.f35551b.A(this.f35552c);
                return;
            default:
                this.f35551b.f38083f.f40238f[this.f35552c].l(1.0f);
                return;
        }
    }
}
