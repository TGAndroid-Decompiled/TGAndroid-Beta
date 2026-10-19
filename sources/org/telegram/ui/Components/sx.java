package org.telegram.ui.Components;
public final class sx extends g.o {
    public final tz f30351c;

    public sx(tz tzVar) {
        this.f30351c = tzVar;
    }

    @Override
    public final int i(int i10) {
        tz tzVar = this.f30351c;
        ay ayVar = tzVar.R;
        rx rxVar = tzVar.Q;
        s4.g0 adapter = tzVar.P.getAdapter();
        ty tyVar = tzVar.S;
        if (adapter == tyVar) {
            int j10 = tyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return rxVar.J;
            }
        } else if ((tzVar.f30772d0 && i10 == 0) || i10 == ayVar.d || i10 == ayVar.f24729c || i10 == ayVar.f24730f || ayVar.f24732r.indexOfKey(i10) >= 0 || ayVar.v.indexOfKey(i10) >= 0) {
            return rxVar.J;
        }
        return 1;
    }
}
