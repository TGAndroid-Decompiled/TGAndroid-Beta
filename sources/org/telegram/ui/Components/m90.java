package org.telegram.ui.Components;
public final class m90 implements Runnable {
    public final int f28639a;
    public final n90 f28640b;
    public final r90 f28641c;

    public m90(n90 n90Var, r90 r90Var, int i10) {
        this.f28639a = i10;
        this.f28640b = n90Var;
        this.f28641c = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f28639a) {
            case 0:
                this.f28640b.k(this.f28641c, false);
                return;
            default:
                this.f28640b.k(this.f28641c, false);
                return;
        }
    }
}
