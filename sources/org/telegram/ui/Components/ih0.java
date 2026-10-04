package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f27420a;
    public final lh0 f27421b;

    public ih0(lh0 lh0Var, int i10) {
        this.f27420a = i10;
        this.f27421b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f27420a) {
            case 0:
                this.f27421b.a(true);
                return;
            default:
                this.f27421b.d();
                return;
        }
    }
}
