package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ef0 implements Runnable {
    public final int f38855a;
    public final lf0 f38856b;
    public final int f38857c;

    public ef0(lf0 lf0Var, int i10, int i11) {
        this.f38855a = i11;
        this.f38856b = lf0Var;
        this.f38857c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38855a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ef0(this.f38856b, this.f38857c, 1));
                return;
            case 1:
                this.f38856b.z(this.f38857c);
                return;
            default:
                this.f38856b.f41116f.f45772f[this.f38857c].l(1.0f);
                return;
        }
    }
}
