package org.telegram.ui;
public final class cd0 implements Runnable {
    public final int f44330a;
    public final jd0 f44331b;
    public final int f44332c;

    public cd0(jd0 jd0Var, int i7, int i10) {
        this.f44330a = i10;
        this.f44331b = jd0Var;
        this.f44332c = i7;
    }

    @Override
    public final void run() {
        switch (this.f44330a) {
            case 0:
                org.telegram.messenger.g0.h3(new cd0(this.f44331b, this.f44332c, 1));
                return;
            case 1:
                this.f44331b.z(this.f44332c);
                return;
            default:
                this.f44331b.f46967f.f44118f[this.f44332c].C(1.0f);
                return;
        }
    }
}
