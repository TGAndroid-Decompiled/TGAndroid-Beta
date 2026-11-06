package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.pc {
    public final int f31973a;
    public final g0 f31974b;

    public b(g0 g0Var, int i7) {
        this.f31973a = i7;
        this.f31974b = g0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f31973a) {
            case 0:
                g0 g0Var = this.f31974b;
                g0Var.f33711j2 = str;
                g0Var.G2.O(true);
                return;
            default:
                g0 g0Var2 = this.f31974b;
                g0Var2.f33711j2 = str;
                g0Var2.G2.O(true);
                return;
        }
    }
}
