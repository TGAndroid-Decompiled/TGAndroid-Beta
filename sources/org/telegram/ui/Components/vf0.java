package org.telegram.ui.Components;
public final class vf0 implements Runnable {
    public final int f28993a;
    public final zf0 f28994b;

    public vf0(zf0 zf0Var, int i10) {
        this.f28993a = i10;
        this.f28994b = zf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28993a) {
            case 0:
                this.f28994b.e();
                return;
            default:
                this.f28994b.g();
                return;
        }
    }
}
