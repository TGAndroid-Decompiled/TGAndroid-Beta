package org.telegram.ui;
public final class ee0 implements Runnable {
    public final int f36809a;
    public final le0 f36810b;
    public final int f36811c;

    public ee0(le0 le0Var, int i10, int i11) {
        this.f36809a = i11;
        this.f36810b = le0Var;
        this.f36811c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36809a) {
            case 0:
                org.telegram.messenger.i0.g3(new ee0(this.f36810b, this.f36811c, 1));
                return;
            case 1:
                this.f36810b.z(this.f36811c);
                return;
            default:
                this.f36810b.f39241f.f44045f[this.f36811c].C(1.0f);
                return;
        }
    }
}
