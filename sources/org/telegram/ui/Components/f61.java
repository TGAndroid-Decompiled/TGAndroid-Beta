package org.telegram.ui.Components;
public final class f61 extends f2.v {
    public final e61 f26776c;
    public final i61 d;

    public f61(i61 i61Var, e61 e61Var) {
        this.d = i61Var;
        this.f26776c = e61Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        x51 x51Var = this.d.V2;
        e61 e61Var = this.f26776c;
        if (x51Var == null) {
            return e61Var.J;
        }
        j51 G = x51Var.G(i10);
        if (G != null && (i11 = G.f28023u) != -1) {
            return i11;
        }
        return e61Var.J;
    }
}
