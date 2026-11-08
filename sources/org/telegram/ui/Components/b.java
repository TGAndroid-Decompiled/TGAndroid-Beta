package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.pc {
    public final int f31975a;
    public final g0 f31976b;

    public b(g0 g0Var, int i7) {
        this.f31975a = i7;
        this.f31976b = g0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f31975a) {
            case 0:
                g0 g0Var = this.f31976b;
                g0Var.f33745j2 = str;
                g0Var.G2.O(true);
                return;
            default:
                g0 g0Var2 = this.f31976b;
                g0Var2.f33745j2 = str;
                g0Var2.G2.O(true);
                return;
        }
    }
}
