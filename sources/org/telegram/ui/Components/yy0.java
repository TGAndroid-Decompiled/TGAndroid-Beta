package org.telegram.ui.Components;
public final class yy0 implements Runnable {
    public final int f40758a;
    public final az0 f40759b;
    public final zy0 f40760c;

    public yy0(az0 az0Var, zy0 zy0Var, int i7) {
        this.f40758a = i7;
        this.f40759b = az0Var;
        this.f40760c = zy0Var;
    }

    @Override
    public final void run() {
        switch (this.f40758a) {
            case 0:
                this.f40759b.a(this.f40760c);
                return;
            case 1:
                this.f40759b.a(this.f40760c);
                return;
            default:
                this.f40759b.a(this.f40760c);
                return;
        }
    }
}
