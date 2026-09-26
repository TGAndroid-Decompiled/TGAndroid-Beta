package org.telegram.ui;
public final class o21 implements Runnable {
    public final int f36037a;
    public final q21 f36038b;
    public final int f36039c;
    public final int d;

    public o21(q21 q21Var, int i10, int i11, int i12) {
        this.f36037a = i12;
        this.f36038b = q21Var;
        this.f36039c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36037a) {
            case 0:
                this.f36038b.b(this.f36039c, this.d);
                return;
            case 1:
                this.f36038b.b(this.f36039c, this.d);
                return;
            default:
                this.f36038b.b(this.f36039c, this.d);
                return;
        }
    }
}
