package org.telegram.ui.Components;
public final class nw extends g.p {
    public final ly f37743c;

    public nw(ly lyVar) {
        this.f37743c = lyVar;
    }

    @Override
    public final int i(int i7) {
        ly lyVar = this.f37743c;
        vw vwVar = lyVar.S;
        mw mwVar = lyVar.R;
        v4.h0 adapter = lyVar.Q.getAdapter();
        lx lxVar = lyVar.T;
        if (adapter == lxVar) {
            int d = lxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return mwVar.J;
            }
        } else if ((lyVar.f36943e0 && i7 == 0) || i7 == vwVar.d || i7 == vwVar.f41162c || i7 == vwVar.f41164f || vwVar.f41166r.indexOfKey(i7) >= 0 || vwVar.f41168w.indexOfKey(i7) >= 0) {
            return mwVar.J;
        }
        return 1;
    }
}
