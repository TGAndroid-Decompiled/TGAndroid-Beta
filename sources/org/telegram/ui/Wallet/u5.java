package org.telegram.ui.Wallet;
public final class u5 implements Runnable {
    public final int f35273a;
    public final v5 f35274b;

    public u5(v5 v5Var, int i10) {
        this.f35273a = i10;
        this.f35274b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f35273a) {
            case 0:
                org.telegram.messenger.i0.g3(new u5(this.f35274b, 1));
                return;
            default:
                this.f35274b.a();
                return;
        }
    }
}
