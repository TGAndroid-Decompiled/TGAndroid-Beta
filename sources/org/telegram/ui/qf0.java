package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qf0 implements Runnable {
    public final int f41168a;
    public final yf0 f41169b;
    public final int f41170c;

    public qf0(yf0 yf0Var, int i10, int i11) {
        this.f41168a = i11;
        this.f41169b = yf0Var;
        this.f41170c = i10;
    }

    @Override
    public final void run() {
        switch (this.f41168a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qf0(this.f41169b, this.f41170c, 1));
                return;
            case 1:
                this.f41169b.A(this.f41170c);
                return;
            default:
                this.f41169b.f44366f.f36450f[this.f41170c].l(1.0f);
                return;
        }
    }
}
