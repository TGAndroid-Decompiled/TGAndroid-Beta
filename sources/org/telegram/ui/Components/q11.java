package org.telegram.ui.Components;
public final class q11 implements Runnable {
    public final int f29489a;
    public final s11 f29490b;
    public final r11 f29491c;

    public q11(s11 s11Var, r11 r11Var, int i10) {
        this.f29489a = i10;
        this.f29490b = s11Var;
        this.f29491c = r11Var;
    }

    @Override
    public final void run() {
        switch (this.f29489a) {
            case 0:
                this.f29490b.b(this.f29491c);
                return;
            case 1:
                this.f29490b.b(this.f29491c);
                return;
            default:
                this.f29490b.b(this.f29491c);
                return;
        }
    }
}
