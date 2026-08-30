package org.telegram.ui;
public final class f21 implements Runnable {
    public final int f34143a;
    public final h21 f34144b;
    public final int f34145c;
    public final int d;

    public f21(h21 h21Var, int i10, int i11, int i12) {
        this.f34143a = i12;
        this.f34144b = h21Var;
        this.f34145c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f34143a) {
            case 0:
                this.f34144b.b(this.f34145c, this.d);
                return;
            case 1:
                this.f34144b.b(this.f34145c, this.d);
                return;
            default:
                this.f34144b.b(this.f34145c, this.d);
                return;
        }
    }
}
