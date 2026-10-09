package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class az extends s4.w {
    public boolean d;
    public final cz f36074e;

    public az(cz czVar) {
        this.f36074e = czVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47656a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f47660f != 3) {
            return s4.w.l(0, 0);
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        boolean z10;
        boolean z11 = false;
        if (d1Var.f47660f != d1Var2.f47660f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        cz czVar = this.f36074e;
        zy zyVar = czVar.f36751a;
        cz czVar2 = zyVar.d;
        int i10 = czVar2.f36756n;
        ArrayList arrayList = czVar2.f36754e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = czVar2.f36757r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            zyVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) d1Var.f47656a;
            if (b11 != czVar.f36757r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) d1Var2.f47656a;
            if (b10 != czVar.f36757r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        cz czVar = this.f36074e;
        if (i10 != 0) {
            czVar.f36752b.I0(false);
            d1Var.f47656a.setPressed(true);
        } else if (this.d) {
            bz bzVar = czVar.f36755f;
            if (bzVar != null) {
                bzVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
