package org.telegram.ui.Components;
public final class m90 implements Runnable {
    public final int f28556a;
    public final n90 f28557b;
    public final r90 f28558c;

    public m90(n90 n90Var, r90 r90Var, int i10) {
        this.f28556a = i10;
        this.f28557b = n90Var;
        this.f28558c = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f28556a) {
            case 0:
                this.f28557b.k(this.f28558c, false);
                return;
            default:
                this.f28557b.k(this.f28558c, false);
                return;
        }
    }
}
