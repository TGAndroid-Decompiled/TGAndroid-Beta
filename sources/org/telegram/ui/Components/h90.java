package org.telegram.ui.Components;
public final class h90 implements Runnable {
    public final int f24614a;
    public final i90 f24615b;
    public final m90 f24616c;

    public h90(i90 i90Var, m90 m90Var, int i10) {
        this.f24614a = i10;
        this.f24615b = i90Var;
        this.f24616c = m90Var;
    }

    @Override
    public final void run() {
        switch (this.f24614a) {
            case 0:
                this.f24615b.k(this.f24616c, false);
                return;
            default:
                this.f24615b.k(this.f24616c, false);
                return;
        }
    }
}
