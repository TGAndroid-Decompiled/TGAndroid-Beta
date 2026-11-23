package org.telegram.ui.Wallet;
public final class a1 implements Runnable {
    public final int f43922a;
    public final String f43923b;

    public a1(String str, int i7) {
        this.f43922a = i7;
        this.f43923b = str;
    }

    @Override
    public final void run() {
        switch (this.f43922a) {
            case 0:
                e1 e1Var = c8.ab.f4478b;
                if (e1Var != null) {
                    if (this.f43923b.equals(e1Var.d)) {
                        c8.ab.f4478b.c("STORAGE_CANCELED");
                        c8.ab.f4478b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f43923b);
                return;
        }
    }
}
