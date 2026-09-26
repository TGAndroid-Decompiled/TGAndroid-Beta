package org.telegram.ui.Components;
public final class wf0 implements Runnable {
    public final int f29978a;
    public final ag0 f29979b;

    public wf0(ag0 ag0Var, int i10) {
        this.f29978a = i10;
        this.f29979b = ag0Var;
    }

    @Override
    public final void run() {
        switch (this.f29978a) {
            case 0:
                this.f29979b.e();
                return;
            default:
                this.f29979b.g();
                return;
        }
    }
}
