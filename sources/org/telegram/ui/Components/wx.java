package org.telegram.ui.Components;
public final class wx extends g.o {
    public final wz f30994c;

    public wx(wz wzVar) {
        this.f30994c = wzVar;
    }

    @Override
    public final int i(int i10) {
        wz wzVar = this.f30994c;
        fy fyVar = wzVar.R;
        vx vxVar = wzVar.Q;
        s4.g0 adapter = wzVar.P.getAdapter();
        vy vyVar = wzVar.S;
        if (adapter == vyVar) {
            int j10 = vyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return vxVar.J;
            }
        } else if ((wzVar.f31016d0 && i10 == 0) || i10 == fyVar.d || i10 == fyVar.f25134c || i10 == fyVar.f25135f || fyVar.f25137r.indexOfKey(i10) >= 0 || fyVar.v.indexOfKey(i10) >= 0) {
            return vxVar.J;
        }
        return 1;
    }
}
