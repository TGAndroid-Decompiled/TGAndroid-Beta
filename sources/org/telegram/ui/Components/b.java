package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.pc {
    public final int f31966a;
    public final g0 f31967b;

    public b(g0 g0Var, int i7) {
        this.f31966a = i7;
        this.f31967b = g0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f31966a) {
            case 0:
                g0 g0Var = this.f31967b;
                g0Var.f33684j2 = str;
                g0Var.G2.O(true);
                return;
            default:
                g0 g0Var2 = this.f31967b;
                g0Var2.f33684j2 = str;
                g0Var2.G2.O(true);
                return;
        }
    }
}
