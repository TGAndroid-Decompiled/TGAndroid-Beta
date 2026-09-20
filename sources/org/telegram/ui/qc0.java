package org.telegram.ui;
public final class qc0 implements Runnable {
    public final int f36879a;
    public final kd0 f36880b;
    public final boolean f36881c;

    public qc0(kd0 kd0Var, boolean z10, int i10) {
        this.f36879a = i10;
        this.f36880b = kd0Var;
        this.f36881c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36879a) {
            case 0:
                boolean z10 = this.f36881c;
                kd0 kd0Var = this.f36880b;
                if (!z10) {
                    kd0Var.f35095b.setVisibility(8);
                    return;
                } else {
                    kd0Var.getClass();
                    return;
                }
            default:
                this.f36880b.s0(this.f36881c);
                return;
        }
    }
}
