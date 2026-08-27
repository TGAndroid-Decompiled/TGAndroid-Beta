package org.telegram.ui.Components;

public final class yw extends f2.w {

    public final yy f34968c;

    public yw(yy yyVar) {
        this.f34968c = yyVar;
    }

    @Override
    public final int i(int i10) {
        yy yyVar = this.f34968c;
        gx gxVar = yyVar.N;
        xw xwVar = yyVar.M;
        f2.q0 adapter = yyVar.L.getAdapter();
        wx wxVar = yyVar.O;
        if (adapter == wxVar) {
            int iJ = wxVar.j(i10);
            if (iJ == 1 || iJ == 3 || iJ == 2 || iJ == 4 || iJ == 5) {
                return xwVar.J;
            }
        } else if ((yyVar.W && i10 == 0) || i10 == gxVar.d || i10 == gxVar.f28855c || i10 == gxVar.f28857f || gxVar.f28859r.indexOfKey(i10) >= 0 || gxVar.v.indexOfKey(i10) >= 0) {
            return xwVar.J;
        }
        return 1;
    }
}
