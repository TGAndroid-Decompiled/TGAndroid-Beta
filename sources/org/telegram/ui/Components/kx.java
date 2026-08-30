package org.telegram.ui.Components;
public final class kx extends f2.v {
    public final kz f26395c;

    public kx(kz kzVar) {
        this.f26395c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f26395c;
        rx rxVar = kzVar.O;
        jx jxVar = kzVar.N;
        f2.o0 adapter = kzVar.M.getAdapter();
        jy jyVar = kzVar.P;
        if (adapter == jyVar) {
            int j10 = jyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return jxVar.J;
            }
        } else if ((kzVar.f26410a0 && i10 == 0) || i10 == rxVar.d || i10 == rxVar.f28548c || i10 == rxVar.f28549f || rxVar.f28551r.indexOfKey(i10) >= 0 || rxVar.v.indexOfKey(i10) >= 0) {
            return jxVar.J;
        }
        return 1;
    }
}
