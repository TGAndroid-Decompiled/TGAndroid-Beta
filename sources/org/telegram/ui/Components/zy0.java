package org.telegram.ui.Components;
public final class zy0 implements Runnable {
    public final int f41157a;
    public final bz0 f41158b;
    public final az0 f41159c;

    public zy0(bz0 bz0Var, az0 az0Var, int i7) {
        this.f41157a = i7;
        this.f41158b = bz0Var;
        this.f41159c = az0Var;
    }

    @Override
    public final void run() {
        switch (this.f41157a) {
            case 0:
                this.f41158b.a(this.f41159c);
                return;
            case 1:
                this.f41158b.a(this.f41159c);
                return;
            default:
                this.f41158b.a(this.f41159c);
                return;
        }
    }
}
