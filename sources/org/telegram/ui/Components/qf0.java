package org.telegram.ui.Components;
public final class qf0 implements Runnable {
    public final int f28127a;
    public final vf0 f28128b;

    public qf0(vf0 vf0Var, int i10) {
        this.f28127a = i10;
        this.f28128b = vf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28127a) {
            case 0:
                this.f28128b.e();
                return;
            default:
                this.f28128b.g();
                return;
        }
    }
}
