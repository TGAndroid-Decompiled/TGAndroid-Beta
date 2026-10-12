package org.telegram.ui;
public final class oc0 implements Runnable {
    public final int f40644a;
    public final id0 f40645b;
    public final boolean f40646c;

    public oc0(id0 id0Var, boolean z10, int i10) {
        this.f40644a = i10;
        this.f40645b = id0Var;
        this.f40646c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40644a) {
            case 0:
                boolean z10 = this.f40646c;
                id0 id0Var = this.f40645b;
                if (!z10) {
                    id0Var.f38844b.setVisibility(8);
                    return;
                } else {
                    id0Var.getClass();
                    return;
                }
            default:
                this.f40645b.r0(this.f40646c);
                return;
        }
    }
}
