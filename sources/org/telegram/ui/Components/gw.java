package org.telegram.ui.Components;
public final class gw extends g.p {
    public final ey f34210c;

    public gw(ey eyVar) {
        this.f34210c = eyVar;
    }

    @Override
    public final int i(int i3) {
        ey eyVar = this.f34210c;
        ow owVar = eyVar.S;
        fw fwVar = eyVar.R;
        u4.h0 adapter = eyVar.Q.getAdapter();
        ex exVar = eyVar.T;
        if (adapter == exVar) {
            int d = exVar.d(i3);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return fwVar.J;
            }
        } else if ((eyVar.f33532e0 && i3 == 0) || i3 == owVar.d || i3 == owVar.f36949c || i3 == owVar.f36951f || owVar.f36953r.indexOfKey(i3) >= 0 || owVar.f36955w.indexOfKey(i3) >= 0) {
            return fwVar.J;
        }
        return 1;
    }
}
