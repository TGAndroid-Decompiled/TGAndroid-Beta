package org.telegram.ui.Wallet;

import c8.va;
public final class q0 implements Runnable {
    public final int f43039a;
    public final String f43040b;

    public q0(String str, int i7) {
        this.f43039a = i7;
        this.f43040b = str;
    }

    @Override
    public final void run() {
        switch (this.f43039a) {
            case 0:
                u0 u0Var = va.f5915b;
                if (u0Var != null) {
                    if (this.f43040b.equals(u0Var.d)) {
                        va.f5915b.c("STORAGE_CANCELED");
                        va.f5915b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43040b);
                return;
        }
    }
}
