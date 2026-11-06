package org.telegram.ui.Wallet;

import c8.va;
public final class s0 implements Runnable {
    public final int f43123a;
    public final String f43124b;

    public s0(String str, int i7) {
        this.f43123a = i7;
        this.f43124b = str;
    }

    @Override
    public final void run() {
        switch (this.f43123a) {
            case 0:
                w0 w0Var = va.f5912b;
                if (w0Var != null) {
                    if (this.f43124b.equals(w0Var.d)) {
                        va.f5912b.c("STORAGE_CANCELED");
                        va.f5912b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43124b);
                return;
        }
    }
}
