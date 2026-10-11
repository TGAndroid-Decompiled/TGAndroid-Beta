package org.telegram.ui.Components;
public final class og0 implements Runnable {
    public final int f29503a;
    public final tg0 f29504b;

    public og0(tg0 tg0Var, int i10) {
        this.f29503a = i10;
        this.f29504b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29503a) {
            case 0:
                this.f29504b.e();
                return;
            default:
                this.f29504b.g();
                return;
        }
    }
}
