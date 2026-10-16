package org.telegram.ui.Components;
public final class z90 implements Runnable {
    public final int f31517a;
    public final aa0 f31518b;
    public final ea0 f31519c;

    public z90(aa0 aa0Var, ea0 ea0Var, int i10) {
        this.f31517a = i10;
        this.f31518b = aa0Var;
        this.f31519c = ea0Var;
    }

    @Override
    public final void run() {
        switch (this.f31517a) {
            case 0:
                this.f31518b.k(this.f31519c, false);
                return;
            default:
                this.f31518b.k(this.f31519c, false);
                return;
        }
    }
}
