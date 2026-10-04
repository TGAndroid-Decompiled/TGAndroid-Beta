package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f39587a;
    public final s21 f39588b;
    public final int f39589c;
    public final int d;

    public q21(s21 s21Var, int i10, int i11, int i12) {
        this.f39587a = i12;
        this.f39588b = s21Var;
        this.f39589c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f39587a) {
            case 0:
                this.f39588b.b(this.f39589c, this.d);
                return;
            case 1:
                this.f39588b.b(this.f39589c, this.d);
                return;
            default:
                this.f39588b.b(this.f39589c, this.d);
                return;
        }
    }
}
