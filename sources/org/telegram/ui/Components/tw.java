package org.telegram.ui.Components;
public final class tw extends g.p {
    public final ry f40112c;

    public tw(ry ryVar) {
        this.f40112c = ryVar;
    }

    @Override
    public final int i(int i7) {
        ry ryVar = this.f40112c;
        bx bxVar = ryVar.S;
        sw swVar = ryVar.R;
        v4.i0 adapter = ryVar.Q.getAdapter();
        qx qxVar = ryVar.T;
        if (adapter == qxVar) {
            int d = qxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return swVar.J;
            }
        } else if ((ryVar.f39347e0 && i7 == 0) || i7 == bxVar.d || i7 == bxVar.f33801c || i7 == bxVar.f33803f || bxVar.f33805r.indexOfKey(i7) >= 0 || bxVar.f33807w.indexOfKey(i7) >= 0) {
            return swVar.J;
        }
        return 1;
    }
}
