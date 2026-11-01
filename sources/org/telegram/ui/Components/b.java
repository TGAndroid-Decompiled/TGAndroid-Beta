package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.rc {
    public final int f24589a;
    public final g0 f24590b;

    public b(g0 g0Var, int i10) {
        this.f24589a = i10;
        this.f24590b = g0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f24589a) {
            case 0:
                g0 g0Var = this.f24590b;
                g0Var.f26248j2 = str;
                g0Var.G2.O(true);
                return;
            default:
                g0 g0Var2 = this.f24590b;
                g0Var2.f26248j2 = str;
                g0Var2.G2.O(true);
                return;
        }
    }
}
