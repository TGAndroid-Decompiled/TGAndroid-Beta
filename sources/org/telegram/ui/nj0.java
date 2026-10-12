package org.telegram.ui;
public final class nj0 implements Runnable {
    public final int f40425a;
    public final tj0 f40426b;

    public nj0(tj0 tj0Var, int i10) {
        this.f40425a = i10;
        this.f40426b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f40425a) {
            case 0:
                this.f40426b.dismiss();
                return;
            case 1:
                this.f40426b.V(true, false);
                return;
            default:
                this.f40426b.V(true, false);
                return;
        }
    }
}
