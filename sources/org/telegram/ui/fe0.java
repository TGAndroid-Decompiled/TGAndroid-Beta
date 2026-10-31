package org.telegram.ui;
public final class fe0 implements Runnable {
    public final int f37244a;
    public final me0 f37245b;
    public final int f37246c;

    public fe0(me0 me0Var, int i10, int i11) {
        this.f37244a = i11;
        this.f37245b = me0Var;
        this.f37246c = i10;
    }

    @Override
    public final void run() {
        switch (this.f37244a) {
            case 0:
                org.telegram.messenger.i0.g3(new fe0(this.f37245b, this.f37246c, 1));
                return;
            case 1:
                this.f37245b.z(this.f37246c);
                return;
            default:
                this.f37245b.f39664f.f44219f[this.f37246c].C(1.0f);
                return;
        }
    }
}
