package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f39240a;
    public final id0 f39241b;
    public final boolean f39242c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f39240a = i10;
        this.f39241b = id0Var;
        this.f39242c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39240a) {
            case 0:
                boolean z10 = this.f39242c;
                id0 id0Var = this.f39241b;
                if (!z10) {
                    id0Var.f37332b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f39241b.s0(this.f39242c);
                return;
        }
    }
}
