package org.telegram.ui.Wallet;
public final class q0 implements Runnable {
    public final int f35055a;
    public final String f35056b;

    public q0(String str, int i10) {
        this.f35055a = i10;
        this.f35056b = str;
    }

    @Override
    public final void run() {
        switch (this.f35055a) {
            case 0:
                u0 u0Var = w7.k6.f52618b;
                if (u0Var != null) {
                    if (this.f35056b.equals(u0Var.d)) {
                        w7.k6.f52618b.c("STORAGE_CANCELED");
                        w7.k6.f52618b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g(this.f35056b);
                return;
        }
    }
}
