package org.telegram.ui.Components;
public final class wf0 implements Runnable {
    public final int f29958a;
    public final ag0 f29959b;

    public wf0(ag0 ag0Var, int i10) {
        this.f29958a = i10;
        this.f29959b = ag0Var;
    }

    @Override
    public final void run() {
        switch (this.f29958a) {
            case 0:
                this.f29959b.e();
                return;
            default:
                this.f29959b.g();
                return;
        }
    }
}
