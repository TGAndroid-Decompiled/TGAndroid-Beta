package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.oc {
    public final int f33681a;
    public final n0 f33682b;

    public b(n0 n0Var, int i7) {
        this.f33681a = i7;
        this.f33682b = n0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f33681a) {
            case 0:
                n0 n0Var = this.f33682b;
                n0Var.f37693n2 = str;
                n0Var.P2.O(true);
                return;
            default:
                n0 n0Var2 = this.f33682b;
                n0Var2.f37693n2 = str;
                n0Var2.P2.O(true);
                return;
        }
    }
}
