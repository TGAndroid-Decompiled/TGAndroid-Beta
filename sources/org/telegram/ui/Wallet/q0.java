package org.telegram.ui.Wallet;

import c8.xa;
public final class q0 implements Runnable {
    public final int f44379a;
    public final String f44380b;

    public q0(String str, int i7) {
        this.f44379a = i7;
        this.f44380b = str;
    }

    @Override
    public final void run() {
        switch (this.f44379a) {
            case 0:
                u0 u0Var = xa.f4781b;
                if (u0Var != null) {
                    if (this.f44380b.equals(u0Var.d)) {
                        xa.f4781b.c("STORAGE_CANCELED");
                        xa.f4781b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f44380b);
                return;
        }
    }
}
