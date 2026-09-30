package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f35639a;
    public final tf0 f35640b;
    public final int f35641c;

    public mf0(tf0 tf0Var, int i10, int i11) {
        this.f35639a = i11;
        this.f35640b = tf0Var;
        this.f35641c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35639a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f35640b, this.f35641c, 1));
                return;
            case 1:
                this.f35640b.A(this.f35641c);
                return;
            default:
                this.f35640b.f38192f.f40347f[this.f35641c].l(1.0f);
                return;
        }
    }
}
