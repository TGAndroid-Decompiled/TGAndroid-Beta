package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f35459a;
    public final id0 f35460b;
    public final boolean f35461c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f35459a = i10;
        this.f35460b = id0Var;
        this.f35461c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35459a) {
            case 0:
                boolean z10 = this.f35461c;
                id0 id0Var = this.f35460b;
                if (!z10) {
                    id0Var.f33616b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f35460b.s0(this.f35461c);
                return;
        }
    }
}
