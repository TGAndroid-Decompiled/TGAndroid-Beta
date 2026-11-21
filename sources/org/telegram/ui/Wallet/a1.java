package org.telegram.ui.Wallet;
public final class a1 implements Runnable {
    public final int f43953a;
    public final String f43954b;

    public a1(String str, int i7) {
        this.f43953a = i7;
        this.f43954b = str;
    }

    @Override
    public final void run() {
        switch (this.f43953a) {
            case 0:
                e1 e1Var = c8.za.f5128b;
                if (e1Var != null) {
                    if (this.f43954b.equals(e1Var.d)) {
                        c8.za.f5128b.c("STORAGE_CANCELED");
                        c8.za.f5128b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43954b);
                return;
        }
    }
}
