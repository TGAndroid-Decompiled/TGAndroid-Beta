package org.telegram.ui;
public final class o21 implements Runnable {
    public final int f36032a;
    public final q21 f36033b;
    public final int f36034c;
    public final int d;

    public o21(q21 q21Var, int i10, int i11, int i12) {
        this.f36032a = i12;
        this.f36033b = q21Var;
        this.f36034c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36032a) {
            case 0:
                this.f36033b.b(this.f36034c, this.d);
                return;
            case 1:
                this.f36033b.b(this.f36034c, this.d);
                return;
            default:
                this.f36033b.b(this.f36034c, this.d);
                return;
        }
    }
}
