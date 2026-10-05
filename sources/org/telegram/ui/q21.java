package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f39677a;
    public final s21 f39678b;
    public final int f39679c;
    public final int d;

    public q21(s21 s21Var, int i10, int i11, int i12) {
        this.f39677a = i12;
        this.f39678b = s21Var;
        this.f39679c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39677a) {
            case 0:
                this.f39678b.b(this.f39679c, this.d);
                return;
            case 1:
                this.f39678b.b(this.f39679c, this.d);
                return;
            default:
                this.f39678b.b(this.f39679c, this.d);
                return;
        }
    }
}
