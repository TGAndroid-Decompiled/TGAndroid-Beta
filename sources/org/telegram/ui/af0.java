package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class af0 implements Runnable {
    public final int f36539a;
    public final if0 f36540b;
    public final int f36541c;

    public af0(if0 if0Var, int i10, int i11) {
        this.f36539a = i11;
        this.f36540b = if0Var;
        this.f36541c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36539a) {
            case 0:
                AndroidUtilities.runOnUIThread(new af0(this.f36540b, this.f36541c, 1));
                return;
            case 1:
                this.f36540b.A(this.f36541c);
                return;
            default:
                this.f36540b.f39239f.f42455f[this.f36541c].l(1.0f);
                return;
        }
    }
}
