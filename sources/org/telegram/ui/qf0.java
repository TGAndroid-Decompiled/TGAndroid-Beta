package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qf0 implements Runnable {
    public final int f39711a;
    public final xf0 f39712b;
    public final int f39713c;

    public qf0(xf0 xf0Var, int i10, int i11) {
        this.f39711a = i11;
        this.f39712b = xf0Var;
        this.f39713c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39711a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.f39712b, this.f39713c, 1));
                return;
            case 1:
                this.f39712b.A(this.f39713c);
                return;
            default:
                this.f39712b.f42858f.f35543f[this.f39713c].l(1.0f);
                return;
        }
    }
}
