package org.telegram.ui.Components;
public final class r11 implements Runnable {
    public final int f29784a;
    public final t11 f29785b;
    public final s11 f29786c;

    public r11(t11 t11Var, s11 s11Var, int i10) {
        this.f29784a = i10;
        this.f29785b = t11Var;
        this.f29786c = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f29784a) {
            case 0:
                this.f29785b.b(this.f29786c);
                return;
            case 1:
                this.f29785b.b(this.f29786c);
                return;
            default:
                this.f29785b.b(this.f29786c);
                return;
        }
    }
}
