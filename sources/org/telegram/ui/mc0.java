package org.telegram.ui;
public final class mc0 implements Runnable {
    public final int f38536a;
    public final gd0 f38537b;
    public final boolean f38538c;

    public mc0(gd0 gd0Var, boolean z10, int i10) {
        this.f38536a = i10;
        this.f38537b = gd0Var;
        this.f38538c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38536a) {
            case 0:
                boolean z10 = this.f38538c;
                gd0 gd0Var = this.f38537b;
                if (!z10) {
                    gd0Var.f36569b.setVisibility(8);
                    return;
                } else {
                    gd0Var.getClass();
                    return;
                }
            default:
                this.f38537b.s0(this.f38538c);
                return;
        }
    }
}
