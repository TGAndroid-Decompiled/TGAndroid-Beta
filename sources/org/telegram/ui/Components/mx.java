package org.telegram.ui.Components;
public final class mx extends f2.v {
    public final mz f29264c;

    public mx(mz mzVar) {
        this.f29264c = mzVar;
    }

    @Override
    public final int i(int i10) {
        mz mzVar = this.f29264c;
        tx txVar = mzVar.O;
        lx lxVar = mzVar.N;
        f2.p0 adapter = mzVar.M.getAdapter();
        ly lyVar = mzVar.P;
        if (adapter == lyVar) {
            int j10 = lyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return lxVar.J;
            }
        } else if ((mzVar.f29266a0 && i10 == 0) || i10 == txVar.d || i10 == txVar.f31425c || i10 == txVar.f31427f || txVar.f31429r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
