package org.telegram.ui.Components;
public final class yy0 implements Runnable {
    public final int f40777a;
    public final az0 f40778b;
    public final zy0 f40779c;

    public yy0(az0 az0Var, zy0 zy0Var, int i7) {
        this.f40777a = i7;
        this.f40778b = az0Var;
        this.f40779c = zy0Var;
    }

    @Override
    public final void run() {
        switch (this.f40777a) {
            case 0:
                this.f40778b.a(this.f40779c);
                return;
            case 1:
                this.f40778b.a(this.f40779c);
                return;
            default:
                this.f40778b.a(this.f40779c);
                return;
        }
    }
}
