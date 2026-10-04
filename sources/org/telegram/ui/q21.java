package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f39593a;
    public final s21 f39594b;
    public final int f39595c;
    public final int d;

    public q21(s21 s21Var, int i10, int i11, int i12) {
        this.f39593a = i12;
        this.f39594b = s21Var;
        this.f39595c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39593a) {
            case 0:
                this.f39594b.b(this.f39595c, this.d);
                return;
            case 1:
                this.f39594b.b(this.f39595c, this.d);
                return;
            default:
                this.f39594b.b(this.f39595c, this.d);
                return;
        }
    }
}
