package org.telegram.ui.Components;
public final class zy0 implements Runnable {
    public final int f41165a;
    public final bz0 f41166b;
    public final az0 f41167c;

    public zy0(bz0 bz0Var, az0 az0Var, int i7) {
        this.f41165a = i7;
        this.f41166b = bz0Var;
        this.f41167c = az0Var;
    }

    @Override
    public final void run() {
        switch (this.f41165a) {
            case 0:
                this.f41166b.a(this.f41167c);
                return;
            case 1:
                this.f41166b.a(this.f41167c);
                return;
            default:
                this.f41166b.a(this.f41167c);
                return;
        }
    }
}
