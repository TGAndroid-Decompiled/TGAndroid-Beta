package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.oc {
    public final int f33658a;
    public final n0 f33659b;

    public b(n0 n0Var, int i7) {
        this.f33658a = i7;
        this.f33659b = n0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f33658a) {
            case 0:
                n0 n0Var = this.f33659b;
                n0Var.f37649n2 = str;
                n0Var.P2.O(true);
                return;
            default:
                n0 n0Var2 = this.f33659b;
                n0Var2.f37649n2 = str;
                n0Var2.P2.O(true);
                return;
        }
    }
}
