package org.telegram.ui.Components;
public final class vw extends g.p {
    public final ty f41566c;

    public vw(ty tyVar) {
        this.f41566c = tyVar;
    }

    @Override
    public final int i(int i7) {
        ty tyVar = this.f41566c;
        dx dxVar = tyVar.S;
        uw uwVar = tyVar.R;
        v4.i0 adapter = tyVar.Q.getAdapter();
        sx sxVar = tyVar.T;
        if (adapter == sxVar) {
            int d = sxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return uwVar.J;
            }
        } else if ((tyVar.f40094e0 && i7 == 0) || i7 == dxVar.d || i7 == dxVar.f34596c || i7 == dxVar.f34598f || dxVar.f34600r.indexOfKey(i7) >= 0 || dxVar.f34602w.indexOfKey(i7) >= 0) {
            return uwVar.J;
        }
        return 1;
    }
}
