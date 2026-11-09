package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.pc {
    public final int f32025a;
    public final g0 f32026b;

    public b(g0 g0Var, int i7) {
        this.f32025a = i7;
        this.f32026b = g0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f32025a) {
            case 0:
                g0 g0Var = this.f32026b;
                g0Var.f33815j2 = str;
                g0Var.G2.O(true);
                return;
            default:
                g0 g0Var2 = this.f32026b;
                g0Var2.f33815j2 = str;
                g0Var2.G2.O(true);
                return;
        }
    }
}
