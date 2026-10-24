package org.telegram.ui.Components;
public final class s90 implements Runnable {
    public final int f30467a;
    public final t90 f30468b;
    public final x90 f30469c;

    public s90(t90 t90Var, x90 x90Var, int i10) {
        this.f30467a = i10;
        this.f30468b = t90Var;
        this.f30469c = x90Var;
    }

    @Override
    public final void run() {
        switch (this.f30467a) {
            case 0:
                this.f30468b.k(this.f30469c, false);
                return;
            default:
                this.f30468b.k(this.f30469c, false);
                return;
        }
    }
}
