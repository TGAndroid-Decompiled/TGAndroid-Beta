package org.telegram.ui.Components;
public final class ay extends g.o {
    public final a00 f24798c;

    public ay(a00 a00Var) {
        this.f24798c = a00Var;
    }

    @Override
    public final int i(int i10) {
        a00 a00Var = this.f24798c;
        jy jyVar = a00Var.R;
        zx zxVar = a00Var.Q;
        s4.i0 adapter = a00Var.P.getAdapter();
        zy zyVar = a00Var.S;
        if (adapter == zyVar) {
            int j3 = zyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return zxVar.J;
            }
        } else if ((a00Var.f24403d0 && i10 == 0) || i10 == jyVar.d || i10 == jyVar.f27793c || i10 == jyVar.f27795f || jyVar.f27797r.indexOfKey(i10) >= 0 || jyVar.v.indexOfKey(i10) >= 0) {
            return zxVar.J;
        }
        return 1;
    }
}
