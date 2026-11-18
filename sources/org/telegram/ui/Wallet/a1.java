package org.telegram.ui.Wallet;
public final class a1 implements Runnable {
    public final int f43912a;
    public final String f43913b;

    public a1(String str, int i7) {
        this.f43912a = i7;
        this.f43913b = str;
    }

    @Override
    public final void run() {
        switch (this.f43912a) {
            case 0:
                e1 e1Var = c8.za.f5099b;
                if (e1Var != null) {
                    if (this.f43913b.equals(e1Var.d)) {
                        c8.za.f5099b.c("STORAGE_CANCELED");
                        c8.za.f5099b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43913b);
                return;
        }
    }
}
