package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f39935a;
    public final gd0 f39936b;
    public final boolean f39937c;

    public mc0(gd0 gd0Var, boolean z10, int i10) {
        this.f39935a = i10;
        this.f39936b = gd0Var;
        this.f39937c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39935a) {
            case 0:
                boolean z10 = this.f39937c;
                gd0 gd0Var = this.f39936b;
                if (!z10) {
                    gd0Var.f38049b.setVisibility(8);
                    return;
                } else {
                    gd0Var.getClass();
                    return;
                }
            default:
                this.f39936b.r0(this.f39937c);
                return;
        }
    }
}
