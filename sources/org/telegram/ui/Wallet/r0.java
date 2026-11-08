package org.telegram.ui.Wallet;

import c8.va;
public final class r0 implements Runnable {
    public final int f43086a;
    public final String f43087b;

    public r0(String str, int i7) {
        this.f43086a = i7;
        this.f43087b = str;
    }

    @Override
    public final void run() {
        switch (this.f43086a) {
            case 0:
                v0 v0Var = va.f5912b;
                if (v0Var != null) {
                    if (this.f43087b.equals(v0Var.d)) {
                        va.f5912b.c("STORAGE_CANCELED");
                        va.f5912b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43087b);
                return;
        }
    }
}
