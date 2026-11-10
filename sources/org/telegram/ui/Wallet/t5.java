package org.telegram.ui.Wallet;
public final class t5 implements Runnable {
    public final int f43185a;
    public final u5 f43186b;

    public t5(u5 u5Var, int i7) {
        this.f43185a = i7;
        this.f43186b = u5Var;
    }

    @Override
    public final void run() {
        switch (this.f43185a) {
            case 0:
                org.telegram.messenger.g0.h3(new t5(this.f43186b, 1));
                return;
            default:
                this.f43186b.a();
                return;
        }
    }
}
