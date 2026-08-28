package org.telegram.ui.Components;
public final class f7 implements Runnable {
    public final int f28319a;
    public final c8 f28320b;

    public f7(c8 c8Var, int i9) {
        this.f28319a = i9;
        this.f28320b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f28319a) {
            case 0:
                c8.n(this.f28320b);
                return;
            default:
                c8.F(this.f28320b);
                return;
        }
    }
}
