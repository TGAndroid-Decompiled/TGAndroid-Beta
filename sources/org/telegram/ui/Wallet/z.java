package org.telegram.ui.Wallet;
public final class z implements Runnable {
    public final int f45464a;
    public final boolean[] f45465b;

    public z(int i7, boolean[] zArr) {
        this.f45464a = i7;
        this.f45465b = zArr;
    }

    @Override
    public final void run() {
        switch (this.f45464a) {
            case 0:
                this.f45465b[0] = true;
                return;
            default:
                this.f45465b[0] = true;
                return;
        }
    }
}
