package org.telegram.ui.Components;
public final class c90 implements Runnable {
    public final int f25863a;
    public final d90 f25864b;
    public final h90 f25865c;

    public c90(d90 d90Var, h90 h90Var, int i10) {
        this.f25863a = i10;
        this.f25864b = d90Var;
        this.f25865c = h90Var;
    }

    @Override
    public final void run() {
        switch (this.f25863a) {
            case 0:
                this.f25864b.k(this.f25865c, false);
                return;
            default:
                this.f25864b.k(this.f25865c, false);
                return;
        }
    }
}
