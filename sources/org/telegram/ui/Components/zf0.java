package org.telegram.ui.Components;
public final class zf0 implements Runnable {
    public final int f30962a;
    public final dg0 f30963b;

    public zf0(dg0 dg0Var, int i10) {
        this.f30962a = i10;
        this.f30963b = dg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30962a) {
            case 0:
                this.f30963b.e();
                return;
            default:
                this.f30963b.g();
                return;
        }
    }
}
