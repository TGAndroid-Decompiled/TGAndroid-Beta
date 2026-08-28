package org.telegram.ui.Components;
public final class yw extends f2.x {
    public final wy f35086c;

    public yw(wy wyVar) {
        this.f35086c = wyVar;
    }

    @Override
    public final int i(int i9) {
        wy wyVar = this.f35086c;
        fx fxVar = wyVar.N;
        xw xwVar = wyVar.M;
        f2.r0 adapter = wyVar.L.getAdapter();
        vx vxVar = wyVar.O;
        if (adapter == vxVar) {
            int j10 = vxVar.j(i9);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return xwVar.J;
            }
        } else if ((wyVar.W && i9 == 0) || i9 == fxVar.d || i9 == fxVar.f28588c || i9 == fxVar.f28590f || fxVar.f28592r.indexOfKey(i9) >= 0 || fxVar.v.indexOfKey(i9) >= 0) {
            return xwVar.J;
        }
        return 1;
    }
}
