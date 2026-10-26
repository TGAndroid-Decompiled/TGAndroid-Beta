package org.telegram.ui.Components;
public final class rx extends g.o {
    public final sz f32345c;

    public rx(sz szVar) {
        this.f32345c = szVar;
    }

    @Override
    public final int i(int i10) {
        sz szVar = this.f32345c;
        zx zxVar = szVar.R;
        qx qxVar = szVar.Q;
        s4.h0 adapter = szVar.P.getAdapter();
        sy syVar = szVar.S;
        if (adapter == syVar) {
            int j10 = syVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return qxVar.J;
            }
        } else if ((szVar.f32721d0 && i10 == 0) || i10 == zxVar.d || i10 == zxVar.f35427c || i10 == zxVar.f35428f || zxVar.f35430r.indexOfKey(i10) >= 0 || zxVar.v.indexOfKey(i10) >= 0) {
            return qxVar.J;
        }
        return 1;
    }
}
