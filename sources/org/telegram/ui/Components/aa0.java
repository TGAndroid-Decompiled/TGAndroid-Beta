package org.telegram.ui.Components;
public final class aa0 implements Runnable {
    public final int f24647a;
    public final ba0 f24648b;
    public final fa0 f24649c;

    public aa0(ba0 ba0Var, fa0 fa0Var, int i10) {
        this.f24647a = i10;
        this.f24648b = ba0Var;
        this.f24649c = fa0Var;
    }

    @Override
    public final void run() {
        switch (this.f24647a) {
            case 0:
                this.f24648b.k(this.f24649c, false);
                return;
            default:
                this.f24648b.k(this.f24649c, false);
                return;
        }
    }
}
