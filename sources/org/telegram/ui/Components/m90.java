package org.telegram.ui.Components;
public final class m90 implements Runnable {
    public final int f28561a;
    public final n90 f28562b;
    public final r90 f28563c;

    public m90(n90 n90Var, r90 r90Var, int i10) {
        this.f28561a = i10;
        this.f28562b = n90Var;
        this.f28563c = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f28561a) {
            case 0:
                this.f28562b.k(this.f28563c, false);
                return;
            default:
                this.f28562b.k(this.f28563c, false);
                return;
        }
    }
}
