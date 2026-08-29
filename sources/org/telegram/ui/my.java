package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class my extends f2.b0 {
    public boolean d;
    public final oy f40651e;

    public my(oy oyVar) {
        this.f40651e = oyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.f6432a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        if (n1Var.f6436f != 3) {
            return f2.b0.l(0, 0);
        }
        return f2.b0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        boolean z10;
        boolean z11 = false;
        if (n1Var.f6436f != n1Var2.f6436f) {
            return false;
        }
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        oy oyVar = this.f40651e;
        ly lyVar = oyVar.f41237a;
        oy oyVar2 = lyVar.d;
        int i10 = oyVar2.f41242n;
        ArrayList arrayList = oyVar2.f41240e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = oyVar2.f41243r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            lyVar.p(b10, b11);
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) n1Var.f6432a;
            if (b11 != oyVar.f41243r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            e4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.e4 e4Var2 = (org.telegram.ui.Cells.e4) n1Var2.f6432a;
            if (b10 != oyVar.f41243r - 1) {
                z11 = true;
            }
            e4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        oy oyVar = this.f40651e;
        if (i10 != 0) {
            oyVar.f41238b.I0(false);
            n1Var.f6432a.setPressed(true);
        } else if (this.d) {
            ny nyVar = oyVar.f41241f;
            if (nyVar != null) {
                nyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(f2.n1 n1Var) {
    }
}
