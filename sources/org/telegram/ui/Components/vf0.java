package org.telegram.ui.Components;
public final class vf0 implements Runnable {
    public final int f27929a;
    public final zf0 f27930b;

    public vf0(zf0 zf0Var, int i10) {
        this.f27929a = i10;
        this.f27930b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f27929a) {
            case 0:
                this.f27930b.e();
                return;
            default:
                this.f27930b.g();
                return;
        }
    }
}
