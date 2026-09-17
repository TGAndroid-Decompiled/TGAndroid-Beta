package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f39241a;
    public final id0 f39242b;
    public final boolean f39243c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f39241a = i10;
        this.f39242b = id0Var;
        this.f39243c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39241a) {
            case 0:
                boolean z10 = this.f39243c;
                id0 id0Var = this.f39242b;
                if (!z10) {
                    id0Var.f37333b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f39242b.s0(this.f39243c);
                return;
        }
    }
}
