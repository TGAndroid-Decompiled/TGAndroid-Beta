package org.telegram.ui.Components;
public final class zy0 implements Runnable {
    public final int f41159a;
    public final bz0 f41160b;
    public final az0 f41161c;

    public zy0(bz0 bz0Var, az0 az0Var, int i7) {
        this.f41159a = i7;
        this.f41160b = bz0Var;
        this.f41161c = az0Var;
    }

    @Override
    public final void run() {
        switch (this.f41159a) {
            case 0:
                this.f41160b.a(this.f41161c);
                return;
            case 1:
                this.f41160b.a(this.f41161c);
                return;
            default:
                this.f41160b.a(this.f41161c);
                return;
        }
    }
}
