package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f39588a;
    public final s21 f39589b;
    public final int f39590c;
    public final int d;

    public q21(s21 s21Var, int i10, int i11, int i12) {
        this.f39588a = i12;
        this.f39589b = s21Var;
        this.f39590c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39588a) {
            case 0:
                this.f39589b.b(this.f39590c, this.d);
                return;
            case 1:
                this.f39589b.b(this.f39590c, this.d);
                return;
            default:
                this.f39589b.b(this.f39590c, this.d);
                return;
        }
    }
}
