package org.telegram.ui.Components;
public final class rx extends g.p {
    public final rz f26775c;

    public rx(rz rzVar) {
        this.f26775c = rzVar;
    }

    @Override
    public final int i(int i10) {
        rz rzVar = this.f26775c;
        yx yxVar = rzVar.R;
        qx qxVar = rzVar.Q;
        s4.h0 adapter = rzVar.P.getAdapter();
        ry ryVar = rzVar.S;
        if (adapter == ryVar) {
            int j3 = ryVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return qxVar.J;
            }
        } else if ((rzVar.f26807d0 && i10 == 0) || i10 == yxVar.d || i10 == yxVar.f29517c || i10 == yxVar.f29518f || yxVar.f29520r.indexOfKey(i10) >= 0 || yxVar.v.indexOfKey(i10) >= 0) {
            return qxVar.J;
        }
        return 1;
    }
}
