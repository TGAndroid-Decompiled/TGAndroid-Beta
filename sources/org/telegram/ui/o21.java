package org.telegram.ui;
public final class o21 implements Runnable {
    public final int f36038a;
    public final q21 f36039b;
    public final int f36040c;
    public final int d;

    public o21(q21 q21Var, int i10, int i11, int i12) {
        this.f36038a = i12;
        this.f36039b = q21Var;
        this.f36040c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36038a) {
            case 0:
                this.f36039b.b(this.f36040c, this.d);
                return;
            case 1:
                this.f36039b.b(this.f36040c, this.d);
                return;
            default:
                this.f36039b.b(this.f36040c, this.d);
                return;
        }
    }
}
