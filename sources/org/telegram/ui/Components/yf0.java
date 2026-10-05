package org.telegram.ui.Components;
public final class yf0 implements Runnable {
    public final int f33264a;
    public final dg0 f33265b;

    public yf0(dg0 dg0Var, int i10) {
        this.f33264a = i10;
        this.f33265b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33264a) {
            case 0:
                this.f33265b.e();
                return;
            default:
                this.f33265b.g();
                return;
        }
    }
}
