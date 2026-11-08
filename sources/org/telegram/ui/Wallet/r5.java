package org.telegram.ui.Wallet;
public final class r5 implements Runnable {
    public final int f43096a;
    public final s5 f43097b;

    public r5(s5 s5Var, int i7) {
        this.f43096a = i7;
        this.f43097b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f43096a) {
            case 0:
                org.telegram.messenger.g0.h3(new r5(this.f43097b, 1));
                return;
            default:
                this.f43097b.a();
                return;
        }
    }
}
