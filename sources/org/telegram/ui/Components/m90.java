package org.telegram.ui.Components;
public final class m90 implements Runnable {
    public final int f28555a;
    public final n90 f28556b;
    public final r90 f28557c;

    public m90(n90 n90Var, r90 r90Var, int i10) {
        this.f28555a = i10;
        this.f28556b = n90Var;
        this.f28557c = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f28555a) {
            case 0:
                this.f28556b.k(this.f28557c, false);
                return;
            default:
                this.f28556b.k(this.f28557c, false);
                return;
        }
    }
}
