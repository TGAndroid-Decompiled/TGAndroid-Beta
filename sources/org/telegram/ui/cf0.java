package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cf0 implements Runnable {
    public final int f38444a;
    public final jf0 f38445b;
    public final int f38446c;

    public cf0(jf0 jf0Var, int i10, int i11) {
        this.f38444a = i11;
        this.f38445b = jf0Var;
        this.f38446c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38444a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cf0(this.f38445b, this.f38446c, 1));
                return;
            case 1:
                this.f38445b.z(this.f38446c);
                return;
            default:
                this.f38445b.f40601f.f44897f[this.f38446c].l(1.0f);
                return;
        }
    }
}
