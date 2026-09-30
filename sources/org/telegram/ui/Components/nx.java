package org.telegram.ui.Components;
public final class nx extends g.p {
    public final mz f26876c;

    public nx(mz mzVar) {
        this.f26876c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f26876c;
        vx vxVar = mzVar.R;
        mx mxVar = mzVar.Q;
        s4.h0 adapter = mzVar.P.getAdapter();
        my myVar = mzVar.S;
        if (adapter == myVar) {
            int j3 = myVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return mxVar.J;
            }
        } else if ((mzVar.f26533d0 && i10 == 0) || i10 == vxVar.d || i10 == vxVar.f29750c || i10 == vxVar.f29751f || vxVar.f29753r.indexOfKey(i10) >= 0 || vxVar.v.indexOfKey(i10) >= 0) {
            return mxVar.J;
        }
        return 1;
    }
}
