package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f36192a;
    public final id0 f36193b;
    public final boolean f36194c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f36192a = i10;
        this.f36193b = id0Var;
        this.f36194c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36192a) {
            case 0:
                boolean z10 = this.f36194c;
                id0 id0Var = this.f36193b;
                if (!z10) {
                    id0Var.f34608b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f36193b.s0(this.f36194c);
                return;
        }
    }
}
