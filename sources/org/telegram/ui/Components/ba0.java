package org.telegram.ui.Components;
public final class ba0 implements Runnable {
    public final int f24904a;
    public final ca0 f24905b;
    public final ga0 f24906c;

    public ba0(ca0 ca0Var, ga0 ga0Var, int i10) {
        this.f24904a = i10;
        this.f24905b = ca0Var;
        this.f24906c = ga0Var;
    }

    @Override
    public final void run() {
        switch (this.f24904a) {
            case 0:
                this.f24905b.k(this.f24906c, false);
                return;
            default:
                this.f24905b.k(this.f24906c, false);
                return;
        }
    }
}
