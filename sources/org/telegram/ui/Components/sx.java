package org.telegram.ui.Components;
public final class sx extends g.o {
    public final tz f30404c;

    public sx(tz tzVar) {
        this.f30404c = tzVar;
    }

    @Override
    public final int i(int i10) {
        tz tzVar = this.f30404c;
        ay ayVar = tzVar.R;
        rx rxVar = tzVar.Q;
        s4.g0 adapter = tzVar.P.getAdapter();
        ty tyVar = tzVar.S;
        if (adapter == tyVar) {
            int j10 = tyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return rxVar.J;
            }
        } else if ((tzVar.f30749d0 && i10 == 0) || i10 == ayVar.d || i10 == ayVar.f24731c || i10 == ayVar.f24732f || ayVar.f24734r.indexOfKey(i10) >= 0 || ayVar.v.indexOfKey(i10) >= 0) {
            return rxVar.J;
        }
        return 1;
    }
}
