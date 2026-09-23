package org.telegram.ui;
public final class p21 implements Runnable {
    public final int f36012a;
    public final r21 f36013b;
    public final int f36014c;
    public final int d;

    public p21(r21 r21Var, int i10, int i11, int i12) {
        this.f36012a = i12;
        this.f36013b = r21Var;
        this.f36014c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f36012a) {
            case 0:
                this.f36013b.b(this.f36014c, this.d);
                return;
            case 1:
                this.f36013b.b(this.f36014c, this.d);
                return;
            default:
                this.f36013b.b(this.f36014c, this.d);
                return;
        }
    }
}
