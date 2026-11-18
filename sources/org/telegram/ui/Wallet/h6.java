package org.telegram.ui.Wallet;
public final class h6 implements Runnable {
    public final int f44310a;
    public final i6 f44311b;

    public h6(i6 i6Var, int i7) {
        this.f44310a = i7;
        this.f44311b = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f44310a) {
            case 0:
                org.telegram.messenger.g0.g3(new h6(this.f44311b, 1));
                return;
            default:
                this.f44311b.a();
                return;
        }
    }
}
