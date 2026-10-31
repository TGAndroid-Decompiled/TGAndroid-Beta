package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.qc {
    public final int f24481a;
    public final g0 f24482b;

    public b(g0 g0Var, int i10) {
        this.f24481a = i10;
        this.f24482b = g0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f24481a) {
            case 0:
                g0 g0Var = this.f24482b;
                g0Var.f26187j2 = str;
                g0Var.G2.O(true);
                return;
            default:
                g0 g0Var2 = this.f24482b;
                g0Var2.f26187j2 = str;
                g0Var2.G2.O(true);
                return;
        }
    }
}
