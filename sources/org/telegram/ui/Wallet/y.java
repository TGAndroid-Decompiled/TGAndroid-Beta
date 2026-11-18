package org.telegram.ui.Wallet;
public final class y implements Runnable {
    public final int f45292a;
    public final boolean[] f45293b;

    public y(int i7, boolean[] zArr) {
        this.f45292a = i7;
        this.f45293b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f45292a) {
            case 0:
                this.f45293b[0] = true;
                return;
            default:
                this.f45293b[0] = true;
                return;
        }
    }
}
