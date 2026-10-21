package org.telegram.ui.Components;
public final class r11 implements Runnable {
    public final int f29781a;
    public final t11 f29782b;
    public final s11 f29783c;

    public r11(t11 t11Var, s11 s11Var, int i10) {
        this.f29781a = i10;
        this.f29782b = t11Var;
        this.f29783c = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f29781a) {
            case 0:
                this.f29782b.b(this.f29783c);
                return;
            case 1:
                this.f29782b.b(this.f29783c);
                return;
            default:
                this.f29782b.b(this.f29783c);
                return;
        }
    }
}
