package org.telegram.ui;
public final class o21 implements Runnable {
    public final int f36039a;
    public final q21 f36040b;
    public final int f36041c;
    public final int d;

    public o21(q21 q21Var, int i10, int i11, int i12) {
        this.f36039a = i12;
        this.f36040b = q21Var;
        this.f36041c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36039a) {
            case 0:
                this.f36040b.b(this.f36041c, this.d);
                return;
            case 1:
                this.f36040b.b(this.f36041c, this.d);
                return;
            default:
                this.f36040b.b(this.f36041c, this.d);
                return;
        }
    }
}
