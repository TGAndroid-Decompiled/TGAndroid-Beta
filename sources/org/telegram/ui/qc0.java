package org.telegram.ui;
public final class qc0 implements Runnable {
    public final int f36892a;
    public final kd0 f36893b;
    public final boolean f36894c;

    public qc0(kd0 kd0Var, boolean z10, int i10) {
        this.f36892a = i10;
        this.f36893b = kd0Var;
        this.f36894c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36892a) {
            case 0:
                boolean z10 = this.f36894c;
                kd0 kd0Var = this.f36893b;
                if (!z10) {
                    kd0Var.f35216b.setVisibility(8);
                    return;
                } else {
                    kd0Var.getClass();
                    return;
                }
            default:
                this.f36893b.s0(this.f36894c);
                return;
        }
    }
}
