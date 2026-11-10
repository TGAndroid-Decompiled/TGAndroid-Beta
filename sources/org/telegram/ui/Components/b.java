package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.pc {
    public final int f32061a;
    public final f0 f32062b;

    public b(f0 f0Var, int i7) {
        this.f32061a = i7;
        this.f32062b = f0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f32061a) {
            case 0:
                f0 f0Var = this.f32062b;
                f0Var.f33416m2 = str;
                f0Var.J2.O(true);
                return;
            default:
                f0 f0Var2 = this.f32062b;
                f0Var2.f33416m2 = str;
                f0Var2.J2.O(true);
                return;
        }
    }
}
