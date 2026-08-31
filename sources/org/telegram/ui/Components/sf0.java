package org.telegram.ui.Components;
public final class sf0 implements Runnable {
    public final int f31053a;
    public final xf0 f31054b;

    public sf0(xf0 xf0Var, int i10) {
        this.f31053a = i10;
        this.f31054b = xf0Var;
    }

    @Override
    public final void run() {
        switch (this.f31053a) {
            case 0:
                this.f31054b.e();
                return;
            default:
                this.f31054b.g();
                return;
        }
    }
}
