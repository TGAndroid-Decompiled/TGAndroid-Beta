package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qf0 implements Runnable {
    public final int f39717a;
    public final xf0 f39718b;
    public final int f39719c;

    public qf0(xf0 xf0Var, int i10, int i11) {
        this.f39717a = i11;
        this.f39718b = xf0Var;
        this.f39719c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39717a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.f39718b, this.f39719c, 1));
                return;
            case 1:
                this.f39718b.A(this.f39719c);
                return;
            default:
                this.f39718b.f42866f.f35549f[this.f39719c].l(1.0f);
                return;
        }
    }
}
