package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f38531a;
    public final gd0 f38532b;
    public final boolean f38533c;

    public mc0(gd0 gd0Var, boolean z10, int i10) {
        this.f38531a = i10;
        this.f38532b = gd0Var;
        this.f38533c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38531a) {
            case 0:
                boolean z10 = this.f38533c;
                gd0 gd0Var = this.f38532b;
                if (!z10) {
                    gd0Var.f36564b.setVisibility(8);
                    return;
                } else {
                    gd0Var.getClass();
                    return;
                }
            default:
                this.f38532b.s0(this.f38533c);
                return;
        }
    }
}
