package org.telegram.ui.Components;
public final class p11 implements Runnable {
    public final int f29140a;
    public final r11 f29141b;
    public final q11 f29142c;

    public p11(r11 r11Var, q11 q11Var, int i10) {
        this.f29140a = i10;
        this.f29141b = r11Var;
        this.f29142c = q11Var;
    }

    @Override
    public final void run() {
        switch (this.f29140a) {
            case 0:
                this.f29141b.b(this.f29142c);
                return;
            case 1:
                this.f29141b.b(this.f29142c);
                return;
            default:
                this.f29141b.b(this.f29142c);
                return;
        }
    }
}
