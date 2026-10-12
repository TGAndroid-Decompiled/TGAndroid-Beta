package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f40647a;
    public final id0 f40648b;
    public final boolean f40649c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f40647a = i10;
        this.f40648b = id0Var;
        this.f40649c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40647a) {
            case 0:
                boolean z10 = this.f40649c;
                id0 id0Var = this.f40648b;
                if (!z10) {
                    id0Var.f38847b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f40648b.r0(this.f40649c);
                return;
        }
    }
}
