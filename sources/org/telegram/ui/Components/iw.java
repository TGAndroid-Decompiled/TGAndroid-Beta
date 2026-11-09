package org.telegram.ui.Components;
public final class iw extends g.p {
    public final hy f34865c;

    public iw(hy hyVar) {
        this.f34865c = hyVar;
    }

    @Override
    public final int i(int i7) {
        hy hyVar = this.f34865c;
        qw qwVar = hyVar.R;
        hw hwVar = hyVar.Q;
        v4.g0 adapter = hyVar.P.getAdapter();
        hx hxVar = hyVar.S;
        if (adapter == hxVar) {
            int d = hxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return hwVar.J;
            }
        } else if ((hyVar.f34417d0 && i7 == 0) || i7 == qwVar.d || i7 == qwVar.f37478c || i7 == qwVar.f37480f || qwVar.f37482r.indexOfKey(i7) >= 0 || qwVar.f37484w.indexOfKey(i7) >= 0) {
            return hwVar.J;
        }
        return 1;
    }
}
