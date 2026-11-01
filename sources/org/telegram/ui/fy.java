package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fy extends s4.u {
    public boolean d;
    public final hy e;

    public fy(hy hyVar) {
        this.e = hyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f47909a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f47912f != 3) {
            return s4.u.l(0, 0);
        }
        return s4.u.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        boolean z10;
        boolean z11 = false;
        if (c1Var.f47912f != c1Var2.f47912f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        hy hyVar = this.e;
        ey eyVar = hyVar.f37882a;
        hy hyVar2 = eyVar.f36925f;
        int i10 = hyVar2.f37886n;
        ArrayList arrayList = hyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = hyVar2.f37887r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            eyVar.j(b10, b11);
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) c1Var.f47909a;
            if (b11 != hyVar.f37887r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.j4 j4Var2 = (org.telegram.ui.Cells.j4) c1Var2.f47909a;
            if (b10 != hyVar.f37887r - 1) {
                z11 = true;
            }
            j4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        hy hyVar = this.e;
        if (i10 != 0) {
            hyVar.f37883b.I0(false);
            c1Var.f47909a.setPressed(true);
        } else if (this.d) {
            gy gyVar = hyVar.f37885f;
            if (gyVar != null) {
                gyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
