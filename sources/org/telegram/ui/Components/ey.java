package org.telegram.ui.Components;
public final class ey extends g.o {
    public final d00 f25804c;

    public ey(d00 d00Var) {
        this.f25804c = d00Var;
    }

    @Override
    public final int i(int i10) {
        d00 d00Var = this.f25804c;
        my myVar = d00Var.R;
        dy dyVar = d00Var.Q;
        s4.i0 adapter = d00Var.P.getAdapter();
        cz czVar = d00Var.S;
        if (adapter == czVar) {
            int j3 = czVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return dyVar.J;
            }
        } else if ((d00Var.f25074d0 && i10 == 0) || i10 == myVar.d || i10 == myVar.f28665c || i10 == myVar.f28667f || myVar.f28669r.indexOfKey(i10) >= 0 || myVar.v.indexOfKey(i10) >= 0) {
            return dyVar.J;
        }
        return 1;
    }
}
