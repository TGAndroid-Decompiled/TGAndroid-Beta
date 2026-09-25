package org.telegram.ui.Components;
public final class wf0 implements Runnable {
    public final int f29979a;
    public final ag0 f29980b;

    public wf0(ag0 ag0Var, int i10) {
        this.f29979a = i10;
        this.f29980b = ag0Var;
    }

    @Override
    public final void run() {
        switch (this.f29979a) {
            case 0:
                this.f29980b.e();
                return;
            default:
                this.f29980b.g();
                return;
        }
    }
}
