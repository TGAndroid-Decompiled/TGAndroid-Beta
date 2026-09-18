package org.telegram.ui;
public final class qc0 implements Runnable {
    public final int f36897a;
    public final kd0 f36898b;
    public final boolean f36899c;

    public qc0(kd0 kd0Var, boolean z10, int i10) {
        this.f36897a = i10;
        this.f36898b = kd0Var;
        this.f36899c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36897a) {
            case 0:
                boolean z10 = this.f36899c;
                kd0 kd0Var = this.f36898b;
                if (!z10) {
                    kd0Var.f35221b.setVisibility(8);
                    return;
                } else {
                    kd0Var.getClass();
                    return;
                }
            default:
                this.f36898b.s0(this.f36899c);
                return;
        }
    }
}
