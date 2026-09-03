package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class mf0 implements Runnable {
    public final int f36071a;
    public final tf0 f36072b;
    public final int f36073c;

    public mf0(tf0 tf0Var, int i10, int i11) {
        this.f36071a = i11;
        this.f36072b = tf0Var;
        this.f36073c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36071a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f36072b, this.f36073c, 1));
                return;
            case 1:
                this.f36072b.A(this.f36073c);
                return;
            default:
                this.f36072b.f38492f.f32635f[this.f36073c].l(1.0f);
                return;
        }
    }
}
