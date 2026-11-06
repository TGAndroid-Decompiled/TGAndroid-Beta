package org.telegram.ui.Components;
public final class hw extends g.p {
    public final gy f34387c;

    public hw(gy gyVar) {
        this.f34387c = gyVar;
    }

    @Override
    public final int i(int i7) {
        gy gyVar = this.f34387c;
        pw pwVar = gyVar.R;
        gw gwVar = gyVar.Q;
        v4.g0 adapter = gyVar.P.getAdapter();
        gx gxVar = gyVar.S;
        if (adapter == gxVar) {
            int d = gxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return gwVar.J;
            }
        } else if ((gyVar.f34026d0 && i7 == 0) || i7 == pwVar.d || i7 == pwVar.f37061c || i7 == pwVar.f37063f || pwVar.f37065r.indexOfKey(i7) >= 0 || pwVar.f37067w.indexOfKey(i7) >= 0) {
            return gwVar.J;
        }
        return 1;
    }
}
