package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f39213a;
    public final id0 f39214b;
    public final boolean f39215c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f39213a = i10;
        this.f39214b = id0Var;
        this.f39215c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39213a) {
            case 0:
                boolean z10 = this.f39215c;
                id0 id0Var = this.f39214b;
                if (!z10) {
                    id0Var.f37305b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f39214b.s0(this.f39215c);
                return;
        }
    }
}
