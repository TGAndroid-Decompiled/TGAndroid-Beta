package org.telegram.ui.Wallet;

import c8.ua;
public final class s0 implements Runnable {
    public final int f43124a;
    public final String f43125b;

    public s0(String str, int i7) {
        this.f43124a = i7;
        this.f43125b = str;
    }

    @Override
    public final void run() {
        switch (this.f43124a) {
            case 0:
                w0 w0Var = ua.f5882b;
                if (w0Var != null) {
                    if (this.f43125b.equals(w0Var.d)) {
                        ua.f5882b.c("STORAGE_CANCELED");
                        ua.f5882b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43125b);
                return;
        }
    }
}
