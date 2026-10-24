package org.telegram.ui.Components;
public final class qx extends g.o {
    public final rz f30006c;

    public qx(rz rzVar) {
        this.f30006c = rzVar;
    }

    @Override
    public final int i(int i10) {
        rz rzVar = this.f30006c;
        yx yxVar = rzVar.R;
        px pxVar = rzVar.Q;
        s4.g0 adapter = rzVar.P.getAdapter();
        ry ryVar = rzVar.S;
        if (adapter == ryVar) {
            int j10 = ryVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return pxVar.J;
            }
        } else if ((rzVar.f30312d0 && i10 == 0) || i10 == yxVar.d || i10 == yxVar.f33070c || i10 == yxVar.f33071f || yxVar.f33073r.indexOfKey(i10) >= 0 || yxVar.v.indexOfKey(i10) >= 0) {
            return pxVar.J;
        }
        return 1;
    }
}
