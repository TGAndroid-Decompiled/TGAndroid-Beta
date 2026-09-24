package org.telegram.ui;
public final class o21 implements Runnable {
    public final int f36014a;
    public final q21 f36015b;
    public final int f36016c;
    public final int d;

    public o21(q21 q21Var, int i10, int i11, int i12) {
        this.f36014a = i12;
        this.f36015b = q21Var;
        this.f36016c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36014a) {
            case 0:
                this.f36015b.b(this.f36016c, this.d);
                return;
            case 1:
                this.f36015b.b(this.f36016c, this.d);
                return;
            default:
                this.f36015b.b(this.f36016c, this.d);
                return;
        }
    }
}
