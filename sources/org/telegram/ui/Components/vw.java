package org.telegram.ui.Components;
public final class vw extends g.p {
    public final ty f41539c;

    public vw(ty tyVar) {
        this.f41539c = tyVar;
    }

    @Override
    public final int i(int i7) {
        ty tyVar = this.f41539c;
        dx dxVar = tyVar.S;
        uw uwVar = tyVar.R;
        v4.h0 adapter = tyVar.Q.getAdapter();
        sx sxVar = tyVar.T;
        if (adapter == sxVar) {
            int d = sxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return uwVar.J;
            }
        } else if ((tyVar.f40076e0 && i7 == 0) || i7 == dxVar.d || i7 == dxVar.f34586c || i7 == dxVar.f34588f || dxVar.f34590r.indexOfKey(i7) >= 0 || dxVar.f34592w.indexOfKey(i7) >= 0) {
            return uwVar.J;
        }
        return 1;
    }
}
