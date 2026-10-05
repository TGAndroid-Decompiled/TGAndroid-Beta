package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qf0 implements Runnable {
    public final int f39785a;
    public final xf0 f39786b;
    public final int f39787c;

    public qf0(xf0 xf0Var, int i10, int i11) {
        this.f39785a = i11;
        this.f39786b = xf0Var;
        this.f39787c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39785a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.f39786b, this.f39787c, 1));
                return;
            case 1:
                this.f39786b.A(this.f39787c);
                return;
            default:
                this.f39786b.f42918f.f35541f[this.f39787c].l(1.0f);
                return;
        }
    }
}
