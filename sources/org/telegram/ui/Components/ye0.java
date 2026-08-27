package org.telegram.ui.Components;

public final class ye0 implements Runnable {

    public final int f34887a;

    public final df0 f34888b;

    public ye0(df0 df0Var, int i10) {
        this.f34887a = i10;
        this.f34888b = df0Var;
    }

    @Override
    public final void run() {
        switch (this.f34887a) {
            case 0:
                this.f34888b.e();
                break;
            default:
                this.f34888b.g();
                break;
        }
    }
}
