package org.telegram.ui.Components;
public final class g90 implements Runnable {
    public final int f24312a;
    public final h90 f24313b;
    public final l90 f24314c;

    public g90(h90 h90Var, l90 l90Var, int i10) {
        this.f24312a = i10;
        this.f24313b = h90Var;
        this.f24314c = l90Var;
    }

    @Override
    public final void run() {
        switch (this.f24312a) {
            case 0:
                this.f24313b.k(this.f24314c, false);
                return;
            default:
                this.f24313b.k(this.f24314c, false);
                return;
        }
    }
}
