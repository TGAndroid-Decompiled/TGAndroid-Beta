package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f39214a;
    public final id0 f39215b;
    public final boolean f39216c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f39214a = i10;
        this.f39215b = id0Var;
        this.f39216c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39214a) {
            case 0:
                boolean z10 = this.f39216c;
                id0 id0Var = this.f39215b;
                if (!z10) {
                    id0Var.f37306b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f39215b.s0(this.f39216c);
                return;
        }
    }
}
