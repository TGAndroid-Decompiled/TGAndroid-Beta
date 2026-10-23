package org.telegram.ui.Components;
public final class u90 implements Runnable {
    public final int f31125a;
    public final v90 f31126b;
    public final z90 f31127c;

    public u90(v90 v90Var, z90 z90Var, int i10) {
        this.f31125a = i10;
        this.f31126b = v90Var;
        this.f31127c = z90Var;
    }

    @Override
    public final void run() {
        switch (this.f31125a) {
            case 0:
                this.f31126b.k(this.f31127c, false);
                return;
            default:
                this.f31126b.k(this.f31127c, false);
                return;
        }
    }
}
