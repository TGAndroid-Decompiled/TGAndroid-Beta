package org.telegram.ui.Components;
public final class kx extends g.p {
    public final kz f25700c;

    public kx(kz kzVar) {
        this.f25700c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f25700c;
        sx sxVar = kzVar.R;
        jx jxVar = kzVar.Q;
        s4.h0 adapter = kzVar.P.getAdapter();
        jy jyVar = kzVar.S;
        if (adapter == jyVar) {
            int j3 = jyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return jxVar.J;
            }
        } else if ((kzVar.f25715d0 && i10 == 0) || i10 == sxVar.d || i10 == sxVar.f27942c || i10 == sxVar.f27943f || sxVar.f27945r.indexOfKey(i10) >= 0 || sxVar.v.indexOfKey(i10) >= 0) {
            return jxVar.J;
        }
        return 1;
    }
}
