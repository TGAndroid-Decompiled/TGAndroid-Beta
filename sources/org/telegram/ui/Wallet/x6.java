package org.telegram.ui.Wallet;
public final class x6 implements Runnable {
    public final int f35389a;
    public final a7 f35390b;

    public x6(a7 a7Var, int i10) {
        this.f35389a = i10;
        this.f35390b = a7Var;
    }

    @Override
    public final void run() {
        switch (this.f35389a) {
            case 0:
                a7.a(this.f35390b);
                return;
            default:
                a7 a7Var = this.f35390b;
                Runnable runnable = a7Var.f34197c0;
                a7Var.f34197c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
