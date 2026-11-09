package org.telegram.ui;
public final class ad0 implements Runnable {
    public final int f43672a;
    public final id0 f43673b;
    public final int f43674c;

    public ad0(id0 id0Var, int i7, int i10) {
        this.f43672a = i10;
        this.f43673b = id0Var;
        this.f43674c = i7;
    }

    @Override
    public final void run() {
        switch (this.f43672a) {
            case 0:
                org.telegram.messenger.g0.h3(new ad0(this.f43673b, this.f43674c, 1));
                return;
            case 1:
                this.f43673b.z(this.f43674c);
                return;
            default:
                this.f43673b.f46631f.f43768f[this.f43674c].C(1.0f);
                return;
        }
    }
}
