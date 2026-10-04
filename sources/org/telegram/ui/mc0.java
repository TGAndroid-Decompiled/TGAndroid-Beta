package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f38530a;
    public final gd0 f38531b;
    public final boolean f38532c;

    public mc0(gd0 gd0Var, boolean z10, int i10) {
        this.f38530a = i10;
        this.f38531b = gd0Var;
        this.f38532c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38530a) {
            case 0:
                boolean z10 = this.f38532c;
                gd0 gd0Var = this.f38531b;
                if (!z10) {
                    gd0Var.f36563b.setVisibility(8);
                    return;
                } else {
                    gd0Var.getClass();
                    return;
                }
            default:
                this.f38531b.s0(this.f38532c);
                return;
        }
    }
}
