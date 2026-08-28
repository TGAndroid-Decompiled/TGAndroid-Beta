package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bf0 implements Runnable {
    public final int f36847a;
    public final jf0 f36848b;
    public final int f36849c;

    public bf0(jf0 jf0Var, int i9, int i10) {
        this.f36847a = i10;
        this.f36848b = jf0Var;
        this.f36849c = i9;
    }

    @Override
    public final void run() {
        switch (this.f36847a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bf0(this.f36848b, this.f36849c, 1));
                return;
            case 1:
                this.f36848b.A(this.f36849c);
                return;
            default:
                this.f36848b.f39478f.f42755f[this.f36849c].l(1.0f);
                return;
        }
    }
}
