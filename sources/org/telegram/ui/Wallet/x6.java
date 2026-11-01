package org.telegram.ui.Wallet;
public final class x6 implements Runnable {
    public final int f35395a;
    public final a7 f35396b;

    public x6(a7 a7Var, int i10) {
        this.f35395a = i10;
        this.f35396b = a7Var;
    }

    @Override
    public final void run() {
        switch (this.f35395a) {
            case 0:
                a7.a(this.f35396b);
                return;
            default:
                a7 a7Var = this.f35396b;
                Runnable runnable = a7Var.f34196c0;
                a7Var.f34196c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
