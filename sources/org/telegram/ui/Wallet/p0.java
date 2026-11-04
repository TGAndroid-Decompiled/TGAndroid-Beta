package org.telegram.ui.Wallet;

import b8.vf;
public final class p0 implements Runnable {
    public final int f43033a;
    public final String f43034b;

    public p0(String str, int i3) {
        this.f43033a = i3;
        this.f43034b = str;
    }

    @Override
    public final void run() {
        switch (this.f43033a) {
            case 0:
                t0 t0Var = vf.f3099b;
                if (t0Var != null) {
                    if (this.f43034b.equals(t0Var.d)) {
                        vf.f3099b.c("STORAGE_CANCELED");
                        vf.f3099b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43034b);
                return;
        }
    }
}
