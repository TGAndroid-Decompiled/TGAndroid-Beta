package org.telegram.ui.Components;
public final class r11 implements Runnable {
    public final int f29785a;
    public final t11 f29786b;
    public final s11 f29787c;

    public r11(t11 t11Var, s11 s11Var, int i10) {
        this.f29785a = i10;
        this.f29786b = t11Var;
        this.f29787c = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f29785a) {
            case 0:
                this.f29786b.b(this.f29787c);
                return;
            case 1:
                this.f29786b.b(this.f29787c);
                return;
            default:
                this.f29786b.b(this.f29787c);
                return;
        }
    }
}
