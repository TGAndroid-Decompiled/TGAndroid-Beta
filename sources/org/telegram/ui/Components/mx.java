package org.telegram.ui.Components;
public final class mx extends g.p {
    public final lz f26581c;

    public mx(lz lzVar) {
        this.f26581c = lzVar;
    }

    @Override
    public final int i(int i10) {
        lz lzVar = this.f26581c;
        ux uxVar = lzVar.R;
        lx lxVar = lzVar.Q;
        s4.h0 adapter = lzVar.P.getAdapter();
        ly lyVar = lzVar.S;
        if (adapter == lyVar) {
            int j3 = lyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return lxVar.J;
            }
        } else if ((lzVar.f26231d0 && i10 == 0) || i10 == uxVar.d || i10 == uxVar.f28930c || i10 == uxVar.f28931f || uxVar.f28933r.indexOfKey(i10) >= 0 || uxVar.v.indexOfKey(i10) >= 0) {
            return lxVar.J;
        }
        return 1;
    }
}
