package org.telegram.ui.Components;
public final class w90 implements Runnable {
    public final int f34474a;
    public final x90 f34475b;
    public final ba0 f34476c;

    public w90(x90 x90Var, ba0 ba0Var, int i10) {
        this.f34474a = i10;
        this.f34475b = x90Var;
        this.f34476c = ba0Var;
    }

    @Override
    public final void run() {
        switch (this.f34474a) {
            case 0:
                this.f34475b.k(this.f34476c, false);
                return;
            default:
                this.f34475b.k(this.f34476c, false);
                return;
        }
    }
}
