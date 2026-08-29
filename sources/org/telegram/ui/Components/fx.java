package org.telegram.ui.Components;
public final class fx extends f2.v {
    public final fz f28558c;

    public fx(fz fzVar) {
        this.f28558c = fzVar;
    }

    @Override
    public final int i(int i10) {
        fz fzVar = this.f28558c;
        nx nxVar = fzVar.N;
        ex exVar = fzVar.M;
        f2.p0 adapter = fzVar.L.getAdapter();
        ey eyVar = fzVar.O;
        if (adapter == eyVar) {
            int j10 = eyVar.j(i10);
            if (j10 == 1 || j10 == 3 || j10 == 2 || j10 == 4 || j10 == 5) {
                return exVar.J;
            }
        } else if ((fzVar.W && i10 == 0) || i10 == nxVar.d || i10 == nxVar.f31158c || i10 == nxVar.f31160f || nxVar.f31162r.indexOfKey(i10) >= 0 || nxVar.v.indexOfKey(i10) >= 0) {
            return exVar.J;
        }
        return 1;
    }
}
