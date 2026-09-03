package org.telegram.ui;
public final class m21 implements Runnable {
    public final int f38843a;
    public final o21 f38844b;
    public final int f38845c;
    public final int d;

    public m21(o21 o21Var, int i10, int i11, int i12) {
        this.f38843a = i12;
        this.f38844b = o21Var;
        this.f38845c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f38843a) {
            case 0:
                this.f38844b.b(this.f38845c, this.d);
                return;
            case 1:
                this.f38844b.b(this.f38845c, this.d);
                return;
            default:
                this.f38844b.b(this.f38845c, this.d);
                return;
        }
    }
}
