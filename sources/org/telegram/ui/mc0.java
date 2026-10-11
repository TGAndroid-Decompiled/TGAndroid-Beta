package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f39901a;
    public final gd0 f39902b;
    public final boolean f39903c;

    public mc0(gd0 gd0Var, boolean z10, int i10) {
        this.f39901a = i10;
        this.f39902b = gd0Var;
        this.f39903c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39901a) {
            case 0:
                boolean z10 = this.f39903c;
                gd0 gd0Var = this.f39902b;
                if (!z10) {
                    gd0Var.f38015b.setVisibility(8);
                    return;
                } else {
                    gd0Var.getClass();
                    return;
                }
            default:
                this.f39902b.r0(this.f39903c);
                return;
        }
    }
}
