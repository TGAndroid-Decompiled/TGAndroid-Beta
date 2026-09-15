package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f36185a;
    public final id0 f36186b;
    public final boolean f36187c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f36185a = i10;
        this.f36186b = id0Var;
        this.f36187c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36185a) {
            case 0:
                boolean z10 = this.f36187c;
                id0 id0Var = this.f36186b;
                if (!z10) {
                    id0Var.f34614b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f36186b.s0(this.f36187c);
                return;
        }
    }
}
