package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f29487a;
    public final s11 f29488b;
    public final r11 f29489c;

    public q11(s11 s11Var, r11 r11Var, int i10) {
        this.f29487a = i10;
        this.f29488b = s11Var;
        this.f29489c = r11Var;
    }

    @Override
    public final void run() {
        switch (this.f29487a) {
            case 0:
                this.f29488b.b(this.f29489c);
                return;
            case 1:
                this.f29488b.b(this.f29489c);
                return;
            default:
                this.f29488b.b(this.f29489c);
                return;
        }
    }
}
