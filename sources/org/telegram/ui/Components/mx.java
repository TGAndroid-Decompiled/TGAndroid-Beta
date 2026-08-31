package org.telegram.ui.Components;
public final class mx extends f2.v {
    public final mz f29260c;

    public mx(mz mzVar) {
        this.f29260c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f29260c;
        tx txVar = mzVar.O;
        lx lxVar = mzVar.N;
        f2.p0 adapter = mzVar.M.getAdapter();
        ly lyVar = mzVar.P;
        if (adapter == lyVar) {
            int j10 = lyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return lxVar.J;
            }
        } else if ((mzVar.f29264a0 && i10 == 0) || i10 == txVar.d || i10 == txVar.f31470c || i10 == txVar.f31472f || txVar.f31474r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
