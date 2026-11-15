package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.oc {
    public final int f33111a;
    public final d0 f33112b;

    public b(d0 d0Var, int i7) {
        this.f33111a = i7;
        this.f33112b = d0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f33111a) {
            case 0:
                d0 d0Var = this.f33112b;
                d0Var.f33759n2 = str;
                d0Var.K2.O(true);
                return;
            default:
                d0 d0Var2 = this.f33112b;
                d0Var2.f33759n2 = str;
                d0Var2.K2.O(true);
                return;
        }
    }
}
