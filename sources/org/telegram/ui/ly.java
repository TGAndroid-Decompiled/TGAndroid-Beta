package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ly extends s4.w {
    public boolean d;
    public final ny e;

    public ly(ny nyVar) {
        this.e = nyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47773a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        if (e1Var.f47776f != 3) {
            return s4.w.l(0, 0);
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        boolean z10;
        boolean z11 = false;
        if (e1Var.f47776f != e1Var2.f47776f) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        ny nyVar = this.e;
        ky kyVar = nyVar.f41916a;
        ny nyVar2 = kyVar.f40934f;
        int i10 = nyVar2.f41920n;
        ArrayList arrayList = nyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = nyVar2.f41921r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            kyVar.p(b10, b11);
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) e1Var.f47773a;
            if (b11 != nyVar.f41921r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.k4 k4Var2 = (org.telegram.ui.Cells.k4) e1Var2.f47773a;
            if (b10 != nyVar.f41921r - 1) {
                z11 = true;
            }
            k4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        ny nyVar = this.e;
        if (i10 != 0) {
            nyVar.f41917b.I0(false);
            e1Var.f47773a.setPressed(true);
        } else if (this.d) {
            my myVar = nyVar.f41919f;
            if (myVar != null) {
                myVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }
}
