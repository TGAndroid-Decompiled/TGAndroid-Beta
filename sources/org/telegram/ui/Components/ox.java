package org.telegram.ui.Components;
public final class ox extends g.p {
    public final nz f27194c;

    public ox(nz nzVar) {
        this.f27194c = nzVar;
    }

    @Override
    public final int i(int i10) {
        nz nzVar = this.f27194c;
        wx wxVar = nzVar.R;
        nx nxVar = nzVar.Q;
        s4.h0 adapter = nzVar.P.getAdapter();
        ny nyVar = nzVar.S;
        if (adapter == nyVar) {
            int j3 = nyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return nxVar.J;
            }
        } else if ((nzVar.f26820d0 && i10 == 0) || i10 == wxVar.d || i10 == wxVar.f30075c || i10 == wxVar.f30076f || wxVar.f30078r.indexOfKey(i10) >= 0 || wxVar.v.indexOfKey(i10) >= 0) {
            return nxVar.J;
        }
        return 1;
    }
}
