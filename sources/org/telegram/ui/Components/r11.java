package org.telegram.ui.Components;
public final class r11 implements Runnable {
    public final int f29780a;
    public final t11 f29781b;
    public final s11 f29782c;

    public r11(t11 t11Var, s11 s11Var, int i10) {
        this.f29780a = i10;
        this.f29781b = t11Var;
        this.f29782c = s11Var;
    }

    @Override
    public final void run() {
        switch (this.f29780a) {
            case 0:
                this.f29781b.b(this.f29782c);
                return;
            case 1:
                this.f29781b.b(this.f29782c);
                return;
            default:
                this.f29781b.b(this.f29782c);
                return;
        }
    }
}
