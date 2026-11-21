package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.nc {
    public final int f33668a;
    public final n0 f33669b;

    public b(n0 n0Var, int i7) {
        this.f33668a = i7;
        this.f33669b = n0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f33668a) {
            case 0:
                n0 n0Var = this.f33669b;
                n0Var.f37696n2 = str;
                n0Var.P2.O(true);
                return;
            default:
                n0 n0Var2 = this.f33669b;
                n0Var2.f37696n2 = str;
                n0Var2.P2.O(true);
                return;
        }
    }
}
