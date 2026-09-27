package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f36605a;
    public final s21 f36606b;
    public final int f36607c;
    public final int d;

    public q21(s21 s21Var, int i10, int i11, int i12) {
        this.f36605a = i12;
        this.f36606b = s21Var;
        this.f36607c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36605a) {
            case 0:
                this.f36606b.b(this.f36607c, this.d);
                return;
            case 1:
                this.f36606b.b(this.f36607c, this.d);
                return;
            default:
                this.f36606b.b(this.f36607c, this.d);
                return;
        }
    }
}
