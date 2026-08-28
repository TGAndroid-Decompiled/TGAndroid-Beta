package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ky extends f2.d0 {
    public boolean d;
    public final my f39945e;

    public ky(my myVar) {
        this.f39945e = myVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.f5501a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        if (q1Var.f5505f != 3) {
            return f2.d0.l(0, 0);
        }
        return f2.d0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        boolean z10;
        boolean z11 = false;
        if (q1Var.f5505f != q1Var2.f5505f) {
            return false;
        }
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        my myVar = this.f39945e;
        jy jyVar = myVar.f40546a;
        my myVar2 = jyVar.d;
        int i9 = myVar2.f40551n;
        ArrayList arrayList = myVar2.f40549e;
        int i10 = b10 - i9;
        int i11 = b11 - i9;
        int i12 = myVar2.f40552r - i9;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            jyVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) q1Var.f5501a;
            if (b11 != myVar.f40552r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) q1Var2.f5501a;
            if (b10 != myVar.f40552r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        my myVar = this.f39945e;
        if (i9 != 0) {
            myVar.f40547b.I0(false);
            q1Var.f5501a.setPressed(true);
        } else if (this.d) {
            ly lyVar = myVar.f40550f;
            if (lyVar != null) {
                lyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }
}
