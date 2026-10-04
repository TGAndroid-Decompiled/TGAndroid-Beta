package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qf0 implements Runnable {
    public final int f39712a;
    public final xf0 f39713b;
    public final int f39714c;

    public qf0(xf0 xf0Var, int i10, int i11) {
        this.f39712a = i11;
        this.f39713b = xf0Var;
        this.f39714c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39712a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.f39713b, this.f39714c, 1));
                return;
            case 1:
                this.f39713b.A(this.f39714c);
                return;
            default:
                this.f39713b.f42859f.f35544f[this.f39714c].l(1.0f);
                return;
        }
    }
}
