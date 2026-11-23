package org.telegram.ui.Wallet;
public final class h6 implements Runnable {
    public final int f44354a;
    public final i6 f44355b;

    public h6(i6 i6Var, int i7) {
        this.f44354a = i7;
        this.f44355b = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f44354a) {
            case 0:
                org.telegram.messenger.g0.g3(new h6(this.f44355b, 1));
                return;
            default:
                this.f44355b.a();
                return;
        }
    }
}
