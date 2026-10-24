package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class df0 implements Runnable {
    public final int f36616a;
    public final lf0 f36617b;
    public final int f36618c;

    public df0(lf0 lf0Var, int i10, int i11) {
        this.f36616a = i11;
        this.f36617b = lf0Var;
        this.f36618c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36616a) {
            case 0:
                AndroidUtilities.runOnUIThread(new df0(this.f36617b, this.f36618c, 1));
                return;
            case 1:
                this.f36617b.z(this.f36618c);
                return;
            default:
                this.f36617b.f39237f.f41792f[this.f36618c].l(1.0f);
                return;
        }
    }
}
