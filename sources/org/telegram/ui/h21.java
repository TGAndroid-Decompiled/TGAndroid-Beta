package org.telegram.ui;
public final class h21 implements Runnable {
    public final int f37313a;
    public final j21 f37314b;
    public final int f37315c;
    public final int d;

    public h21(j21 j21Var, int i10, int i11, int i12) {
        this.f37313a = i12;
        this.f37314b = j21Var;
        this.f37315c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f37313a) {
            case 0:
                this.f37314b.b(this.f37315c, this.d);
                return;
            case 1:
                this.f37314b.b(this.f37315c, this.d);
                return;
            default:
                this.f37314b.b(this.f37315c, this.d);
                return;
        }
    }
}
