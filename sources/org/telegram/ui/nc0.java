package org.telegram.ui;
public final class nc0 implements Runnable {
    public final int f40168a;
    public final hd0 f40169b;
    public final boolean f40170c;

    public nc0(hd0 hd0Var, boolean z10, int i10) {
        this.f40168a = i10;
        this.f40169b = hd0Var;
        this.f40170c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40168a) {
            case 0:
                boolean z10 = this.f40170c;
                hd0 hd0Var = this.f40169b;
                if (!z10) {
                    hd0Var.f38257b.setVisibility(8);
                    return;
                } else {
                    hd0Var.getClass();
                    return;
                }
            default:
                this.f40169b.r0(this.f40170c);
                return;
        }
    }
}
