package org.telegram.ui.Components;
public final class s51 extends f2.v {
    public final r51 f32529c;
    public final u51 d;

    public s51(u51 u51Var, r51 r51Var) {
        this.d = u51Var;
        this.f32529c = r51Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k51 k51Var = this.d.U2;
        r51 r51Var = this.f32529c;
        if (k51Var == null) {
            return r51Var.J;
        }
        w41 G = k51Var.G(i10);
        if (G != null && (i11 = G.f34309u) != -1) {
            return i11;
        }
        return r51Var.J;
    }
}
