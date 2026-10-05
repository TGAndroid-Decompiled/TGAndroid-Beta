package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f38569a;
    public final gd0 f38570b;
    public final boolean f38571c;

    public mc0(gd0 gd0Var, boolean z10, int i10) {
        this.f38569a = i10;
        this.f38570b = gd0Var;
        this.f38571c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38569a) {
            case 0:
                boolean z10 = this.f38571c;
                gd0 gd0Var = this.f38570b;
                if (!z10) {
                    gd0Var.f36603b.setVisibility(8);
                    return;
                } else {
                    gd0Var.getClass();
                    return;
                }
            default:
                this.f38570b.s0(this.f38571c);
                return;
        }
    }
}
