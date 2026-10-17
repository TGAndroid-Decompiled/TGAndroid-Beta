package org.telegram.ui.Components;
public final class p11 implements Runnable {
    public final int f29133a;
    public final r11 f29134b;
    public final q11 f29135c;

    public p11(r11 r11Var, q11 q11Var, int i10) {
        this.f29133a = i10;
        this.f29134b = r11Var;
        this.f29135c = q11Var;
    }

    @Override
    public final void run() {
        switch (this.f29133a) {
            case 0:
                this.f29134b.b(this.f29135c);
                return;
            case 1:
                this.f29134b.b(this.f29135c);
                return;
            default:
                this.f29134b.b(this.f29135c);
                return;
        }
    }
}
