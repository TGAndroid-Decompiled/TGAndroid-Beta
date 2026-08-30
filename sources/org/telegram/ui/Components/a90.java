package org.telegram.ui.Components;
public final class a90 implements Runnable {
    public final int f23320a;
    public final b90 f23321b;
    public final f90 f23322c;

    public a90(b90 b90Var, f90 f90Var, int i10) {
        this.f23320a = i10;
        this.f23321b = b90Var;
        this.f23322c = f90Var;
    }

    @Override
    public final void run() {
        switch (this.f23320a) {
            case 0:
                this.f23321b.k(this.f23322c, false);
                return;
            default:
                this.f23321b.k(this.f23322c, false);
                return;
        }
    }
}
