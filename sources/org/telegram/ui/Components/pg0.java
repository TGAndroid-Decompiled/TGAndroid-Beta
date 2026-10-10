package org.telegram.ui.Components;
public final class pg0 implements Runnable {
    public final int f29765a;
    public final tg0 f29766b;

    public pg0(tg0 tg0Var, int i10) {
        this.f29765a = i10;
        this.f29766b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29765a) {
            case 0:
                this.f29766b.e();
                return;
            default:
                this.f29766b.g();
                return;
        }
    }
}
