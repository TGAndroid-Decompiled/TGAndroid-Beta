package org.telegram.ui.Components;
public final class cy extends g.o {
    public final b00 f25347c;

    public cy(b00 b00Var) {
        this.f25347c = b00Var;
    }

    @Override
    public final int i(int i10) {
        b00 b00Var = this.f25347c;
        ky kyVar = b00Var.R;
        ay ayVar = b00Var.Q;
        s4.i0 adapter = b00Var.P.getAdapter();
        az azVar = b00Var.S;
        if (adapter == azVar) {
            int j3 = azVar.j(i10);
            if (j3 == 1 || j3 == 3 || j3 == 2 || j3 == 4 || j3 == 5) {
                return ayVar.J;
            }
        } else if ((b00Var.f24664d0 && i10 == 0) || i10 == kyVar.d || i10 == kyVar.f28105c || i10 == kyVar.f28107f || kyVar.f28109r.indexOfKey(i10) >= 0 || kyVar.v.indexOfKey(i10) >= 0) {
            return ayVar.J;
        }
        return 1;
    }
}
