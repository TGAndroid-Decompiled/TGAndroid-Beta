package org.telegram.ui;
public final class hg1 implements Runnable {
    public final int f37865a;
    public final ig1 f37866b;

    public hg1(ig1 ig1Var, int i10) {
        this.f37865a = i10;
        this.f37866b = ig1Var;
    }

    @Override
    public final void run() {
        switch (this.f37865a) {
            case 0:
                org.telegram.ui.Components.c71 c71Var = this.f37866b.f25615a;
                if (c71Var != null) {
                    c71Var.Z2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.c71 c71Var2 = this.f37866b.f25615a;
                if (c71Var2 != null) {
                    c71Var2.Z2.N(true);
                    return;
                }
                return;
        }
    }
}
