package org.telegram.ui.Components;
public final class f11 implements Runnable {
    public final int f24028a;
    public final i11 f24029b;
    public final h11 f24030c;

    public f11(i11 i11Var, h11 h11Var, int i10) {
        this.f24028a = i10;
        this.f24029b = i11Var;
        this.f24030c = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f24028a) {
            case 0:
                this.f24029b.b(this.f24030c);
                return;
            case 1:
                this.f24029b.b(this.f24030c);
                return;
            default:
                this.f24029b.b(this.f24030c);
                return;
        }
    }
}
