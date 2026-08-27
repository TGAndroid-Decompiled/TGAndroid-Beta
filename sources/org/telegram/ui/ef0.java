package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class ef0 implements Runnable {

    public final int f37750a;

    public final mf0 f37751b;

    public final int f37752c;

    public ef0(mf0 mf0Var, int i10, int i11) {
        this.f37750a = i11;
        this.f37751b = mf0Var;
        this.f37752c = i10;
    }

    @Override
    public final void run() {
        switch (this.f37750a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ef0(this.f37751b, this.f37752c, 1));
                break;
            case 1:
                this.f37751b.A(this.f37752c);
                break;
            default:
                this.f37751b.f40487f.f43279f[this.f37752c].l(1.0f);
                break;
        }
    }
}
