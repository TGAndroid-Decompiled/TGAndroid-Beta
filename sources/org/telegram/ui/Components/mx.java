package org.telegram.ui.Components;
public final class mx extends g.p {
    public final kz f28577c;

    public mx(kz kzVar) {
        this.f28577c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f28577c;
        tx txVar = kzVar.R;
        lx lxVar = kzVar.Q;
        s4.h0 adapter = kzVar.P.getAdapter();
        ky kyVar = kzVar.S;
        if (adapter == kyVar) {
            int j3 = kyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return lxVar.J;
            }
        } else if ((kzVar.f27962d0 && i10 == 0) || i10 == txVar.d || i10 == txVar.f30752c || i10 == txVar.f30754f || txVar.f30756r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
