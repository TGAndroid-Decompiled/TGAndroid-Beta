package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ly extends s4.v {
    public boolean d;
    public final ny e;

    public ly(ny nyVar) {
        this.e = nyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f46343a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f46346f != 3) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        boolean z10;
        boolean z11 = false;
        if (b1Var.f46346f != b1Var2.f46346f) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ny nyVar = this.e;
        ky kyVar = nyVar.f40004a;
        ny nyVar2 = kyVar.f39087f;
        int i10 = nyVar2.f40008n;
        ArrayList arrayList = nyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = nyVar2.f40009r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            kyVar.p(b10, b11);
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) b1Var.f46343a;
            if (b11 != nyVar.f40009r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.f4 f4Var2 = (org.telegram.ui.Cells.f4) b1Var2.f46343a;
            if (b10 != nyVar.f40009r - 1) {
                z11 = true;
            }
            f4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ny nyVar = this.e;
        if (i10 != 0) {
            nyVar.f40005b.I0(false);
            b1Var.f46343a.setPressed(true);
        } else if (this.d) {
            my myVar = nyVar.f40007f;
            if (myVar != null) {
                myVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
