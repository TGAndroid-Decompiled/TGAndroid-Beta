package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.oc {
    public final int f33114a;
    public final d0 f33115b;

    public b(d0 d0Var, int i7) {
        this.f33114a = i7;
        this.f33115b = d0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f33114a) {
            case 0:
                d0 d0Var = this.f33115b;
                d0Var.f33761n2 = str;
                d0Var.K2.O(true);
                return;
            default:
                d0 d0Var2 = this.f33115b;
                d0Var2.f33761n2 = str;
                d0Var2.K2.O(true);
                return;
        }
    }
}
