package org.telegram.ui.Components;
public final class lg0 implements Runnable {
    public final int f27040a;
    public final qg0 f27041b;

    public lg0(qg0 qg0Var, int i10) {
        this.f27040a = i10;
        this.f27041b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f27040a) {
            case 0:
                this.f27041b.e();
                return;
            default:
                this.f27041b.g();
                return;
        }
    }
}
