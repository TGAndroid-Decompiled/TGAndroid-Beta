package org.telegram.ui.Components;
public final class lx extends g.p {
    public final kz f26250c;

    public lx(kz kzVar) {
        this.f26250c = kzVar;
    }

    @Override
    public final int i(int i10) {
        kz kzVar = this.f26250c;
        tx txVar = kzVar.R;
        kx kxVar = kzVar.Q;
        s4.h0 adapter = kzVar.P.getAdapter();
        ky kyVar = kzVar.S;
        if (adapter == kyVar) {
            int j3 = kyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return kxVar.J;
            }
        } else if ((kzVar.f25860d0 && i10 == 0) || i10 == txVar.d || i10 == txVar.f28546c || i10 == txVar.f28547f || txVar.f28549r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return kxVar.J;
        }
        return 1;
    }
}
