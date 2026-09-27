package org.telegram.ui.Components;
public final class mx extends g.p {
    public final mz f26554c;

    public mx(mz mzVar) {
        this.f26554c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f26554c;
        ux uxVar = mzVar.R;
        lx lxVar = mzVar.Q;
        s4.h0 adapter = mzVar.P.getAdapter();
        my myVar = mzVar.S;
        if (adapter == myVar) {
            int j3 = myVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return lxVar.J;
            }
        } else if ((mzVar.f26576d0 && i10 == 0) || i10 == uxVar.d || i10 == uxVar.f28952c || i10 == uxVar.f28953f || uxVar.f28955r.indexOfKey(i10) >= 0 || uxVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
