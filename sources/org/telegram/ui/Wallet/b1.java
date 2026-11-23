package org.telegram.ui.Wallet;
public final class b1 implements Runnable {
    public final int f44083a;
    public final String f44084b;

    public b1(String str, int i7) {
        this.f44083a = i7;
        this.f44084b = str;
    }

    @Override
    public final void run() {
        switch (this.f44083a) {
            case 0:
                f1 f1Var = c8.ab.f4478b;
                if (f1Var != null) {
                    if (this.f44084b.equals(f1Var.d)) {
                        c8.ab.f4478b.c("STORAGE_CANCELED");
                        c8.ab.f4478b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g(this.f44084b);
                return;
        }
    }
}
