package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qf0 implements Runnable {
    public final int f41202a;
    public final yf0 f41203b;
    public final int f41204c;

    public qf0(yf0 yf0Var, int i10, int i11) {
        this.f41202a = i11;
        this.f41203b = yf0Var;
        this.f41204c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41202a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.f41203b, this.f41204c, 1));
                return;
            case 1:
                this.f41203b.A(this.f41204c);
                return;
            default:
                this.f41203b.f44400f.f36484f[this.f41204c].l(1.0f);
                return;
        }
    }
}
