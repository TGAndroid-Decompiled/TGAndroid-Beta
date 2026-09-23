package org.telegram.ui.Components;
public final class lx extends g.p {
    public final lz f25954c;

    public lx(lz lzVar) {
        this.f25954c = lzVar;
    }

    @Override
    public final int i(int i10) {
        lz lzVar = this.f25954c;
        tx txVar = lzVar.R;
        kx kxVar = lzVar.Q;
        s4.h0 adapter = lzVar.P.getAdapter();
        ky kyVar = lzVar.S;
        if (adapter == kyVar) {
            int j3 = kyVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return kxVar.J;
            }
        } else if ((lzVar.f25970d0 && i10 == 0) || i10 == txVar.d || i10 == txVar.f28323c || i10 == txVar.f28324f || txVar.f28326r.indexOfKey(i10) >= 0 || txVar.v.indexOfKey(i10) >= 0) {
            return kxVar.J;
        }
        return 1;
    }
}
