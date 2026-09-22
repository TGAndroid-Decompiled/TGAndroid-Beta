package org.telegram.ui;
public final class qc0 implements Runnable {
    public final int f36902a;
    public final kd0 f36903b;
    public final boolean f36904c;

    public qc0(kd0 kd0Var, boolean z10, int i10) {
        this.f36902a = i10;
        this.f36903b = kd0Var;
        this.f36904c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36902a) {
            case 0:
                boolean z10 = this.f36904c;
                kd0 kd0Var = this.f36903b;
                if (!z10) {
                    kd0Var.f35117b.setVisibility(8);
                    return;
                } else {
                    kd0Var.getClass();
                    return;
                }
            default:
                this.f36903b.s0(this.f36904c);
                return;
        }
    }
}
