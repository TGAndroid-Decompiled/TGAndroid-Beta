package org.telegram.ui.Wallet;
public final class a1 implements Runnable {
    public final int f43957a;
    public final String f43958b;

    public a1(String str, int i7) {
        this.f43957a = i7;
        this.f43958b = str;
    }

    @Override
    public final void run() {
        switch (this.f43957a) {
            case 0:
                e1 e1Var = c8.za.f5131b;
                if (e1Var != null) {
                    if (this.f43958b.equals(e1Var.d)) {
                        c8.za.f5131b.c("STORAGE_CANCELED");
                        c8.za.f5131b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43958b);
                return;
        }
    }
}
