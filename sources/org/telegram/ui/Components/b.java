package org.telegram.ui.Components;
public final class b implements org.telegram.messenger.nc {
    public final int f33587a;
    public final m0 f33588b;

    public b(m0 m0Var, int i7) {
        this.f33587a = i7;
        this.f33588b = m0Var;
    }

    @Override
    public final void a(String str) {
        switch (this.f33587a) {
            case 0:
                m0 m0Var = this.f33588b;
                m0Var.f37293n2 = str;
                m0Var.P2.O(true);
                return;
            default:
                m0 m0Var2 = this.f33588b;
                m0Var2.f37293n2 = str;
                m0Var2.P2.O(true);
                return;
        }
    }
}
