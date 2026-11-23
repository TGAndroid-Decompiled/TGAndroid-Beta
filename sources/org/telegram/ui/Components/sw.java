package org.telegram.ui.Components;
public final class sw extends g.p {
    public final qy f39722c;

    public sw(qy qyVar) {
        this.f39722c = qyVar;
    }

    @Override
    public final int i(int i7) {
        qy qyVar = this.f39722c;
        ax axVar = qyVar.S;
        rw rwVar = qyVar.R;
        v4.i0 adapter = qyVar.Q.getAdapter();
        px pxVar = qyVar.T;
        if (adapter == pxVar) {
            int d = pxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return rwVar.J;
            }
        } else if ((qyVar.f39049e0 && i7 == 0) || i7 == axVar.d || i7 == axVar.f33566c || i7 == axVar.f33568f || axVar.f33570r.indexOfKey(i7) >= 0 || axVar.f33572w.indexOfKey(i7) >= 0) {
            return rwVar.J;
        }
        return 1;
    }
}
