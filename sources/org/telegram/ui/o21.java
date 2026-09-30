package org.telegram.ui;
public final class o21 implements Runnable {
    public final int f36176a;
    public final q21 f36177b;
    public final int f36178c;
    public final int d;

    public o21(q21 q21Var, int i10, int i11, int i12) {
        this.f36176a = i12;
        this.f36177b = q21Var;
        this.f36178c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36176a) {
            case 0:
                this.f36177b.b(this.f36178c, this.d);
                return;
            case 1:
                this.f36177b.b(this.f36178c, this.d);
                return;
            default:
                this.f36177b.b(this.f36178c, this.d);
                return;
        }
    }
}
