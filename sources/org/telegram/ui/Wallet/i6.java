package org.telegram.ui.Wallet;
public final class i6 implements Runnable {
    public final int f44481a;
    public final j6 f44482b;

    public i6(j6 j6Var, int i7) {
        this.f44481a = i7;
        this.f44482b = j6Var;
    }

    @Override
    public final void run() {
        switch (this.f44481a) {
            case 0:
                org.telegram.messenger.g0.g3(new i6(this.f44482b, 1));
                return;
            default:
                this.f44482b.a();
                return;
        }
    }
}
