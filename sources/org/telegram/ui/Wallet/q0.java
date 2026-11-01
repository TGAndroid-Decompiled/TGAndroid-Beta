package org.telegram.ui.Wallet;
public final class q0 implements Runnable {
    public final int f35054a;
    public final String f35055b;

    public q0(String str, int i10) {
        this.f35054a = i10;
        this.f35055b = str;
    }

    @Override
    public final void run() {
        switch (this.f35054a) {
            case 0:
                u0 u0Var = w7.k6.f52636b;
                if (u0Var != null) {
                    if (this.f35055b.equals(u0Var.d)) {
                        w7.k6.f52636b.c("STORAGE_CANCELED");
                        w7.k6.f52636b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g(this.f35055b);
                return;
        }
    }
}
