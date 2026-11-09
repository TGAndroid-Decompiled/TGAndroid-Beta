package org.telegram.ui.Wallet;

import c8.va;
public final class q0 implements Runnable {
    public final int f43004a;
    public final String f43005b;

    public q0(String str, int i7) {
        this.f43004a = i7;
        this.f43005b = str;
    }

    @Override
    public final void run() {
        switch (this.f43004a) {
            case 0:
                u0 u0Var = va.f5910b;
                if (u0Var != null) {
                    if (this.f43005b.equals(u0Var.d)) {
                        va.f5910b.c("STORAGE_CANCELED");
                        va.f5910b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43005b);
                return;
        }
    }
}
