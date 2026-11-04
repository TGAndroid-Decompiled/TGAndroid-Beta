package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.jc {
    public final int f32018a;
    public final e0 f32019b;

    public b(e0 e0Var, int i3) {
        this.f32018a = i3;
        this.f32019b = e0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f32018a) {
            case 0:
                e0 e0Var = this.f32019b;
                e0Var.f33243k2 = str;
                e0Var.H2.O(true);
                return;
            default:
                e0 e0Var2 = this.f32019b;
                e0Var2.f33243k2 = str;
                e0Var2.H2.O(true);
                return;
        }
    }
}
