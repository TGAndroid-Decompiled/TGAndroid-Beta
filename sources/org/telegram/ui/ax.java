package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ax extends u4.v {
    public boolean d;
    public final cx f43853e;

    public ax(cx cxVar) {
        this.f43853e = cxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f55540a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        if (d1Var.f55544f != 3) {
            return u4.v.l(0, 0);
        }
        return u4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        boolean z10;
        boolean z11 = false;
        if (d1Var.f55544f != d1Var2.f55544f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        cx cxVar = this.f43853e;
        zw zwVar = cxVar.f44455a;
        cx cxVar2 = zwVar.f52760f;
        int i3 = cxVar2.f44460n;
        ArrayList arrayList = cxVar2.f44458e;
        int i10 = b10 - i3;
        int i11 = b11 - i3;
        int i12 = cxVar2.f44461r - i3;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            zwVar.j(b10, b11);
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f55540a;
            if (b11 != cxVar.f44461r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.h4 h4Var2 = (org.telegram.ui.Cells.h4) d1Var2.f55540a;
            if (b10 != cxVar.f44461r - 1) {
                z11 = true;
            }
            h4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(u4.d1 d1Var, int i3) {
        cx cxVar = this.f43853e;
        if (i3 != 0) {
            cxVar.f44456b.I0(false);
            d1Var.f55540a.setPressed(true);
        } else if (this.d) {
            bx bxVar = cxVar.f44459f;
            if (bxVar != null) {
                bxVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(u4.d1 d1Var) {
    }
}
