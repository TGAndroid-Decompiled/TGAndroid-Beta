package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class af0 implements Runnable {
    public final int f35421a;
    public final jf0 f35422b;
    public final int f35423c;

    public af0(jf0 jf0Var, int i10, int i11) {
        this.f35421a = i11;
        this.f35422b = jf0Var;
        this.f35423c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35421a) {
            case 0:
                AndroidUtilities.runOnUIThread(new af0(this.f35422b, this.f35423c, 1));
                return;
            case 1:
                this.f35422b.A(this.f35423c);
                return;
            default:
                this.f35422b.f38142f.f41486f[this.f35423c].l(1.0f);
                return;
        }
    }
}
