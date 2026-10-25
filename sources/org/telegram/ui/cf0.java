package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cf0 implements Runnable {
    public final int f38441a;
    public final jf0 f38442b;
    public final int f38443c;

    public cf0(jf0 jf0Var, int i10, int i11) {
        this.f38441a = i11;
        this.f38442b = jf0Var;
        this.f38443c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38441a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cf0(this.f38442b, this.f38443c, 1));
                return;
            case 1:
                this.f38442b.z(this.f38443c);
                return;
            default:
                this.f38442b.f40598f.f44894f[this.f38443c].l(1.0f);
                return;
        }
    }
}
