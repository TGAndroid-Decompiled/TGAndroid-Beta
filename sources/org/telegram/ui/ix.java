package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ix extends v4.v {
    public boolean d;
    public final kx f48841e;

    public ix(kx kxVar) {
        this.f48841e = kxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f59111a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        if (e1Var.f59115f != 3) {
            return v4.v.l(0, 0);
        }
        return v4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        boolean z10;
        boolean z11 = false;
        if (e1Var.f59115f != e1Var2.f59115f) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        kx kxVar = this.f48841e;
        hx hxVar = kxVar.f49372a;
        kx kxVar2 = hxVar.f48509f;
        int i7 = kxVar2.f49377n;
        ArrayList arrayList = kxVar2.f49375e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = kxVar2.f49378r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            hxVar.j(b10, b11);
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) e1Var.f59111a;
            if (b11 != kxVar.f49378r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.i4 i4Var2 = (org.telegram.ui.Cells.i4) e1Var2.f59111a;
            if (b10 != kxVar.f49378r - 1) {
                z11 = true;
            }
            i4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        kx kxVar = this.f48841e;
        if (i7 != 0) {
            kxVar.f49373b.I0(false);
            e1Var.f59111a.setPressed(true);
        } else if (this.d) {
            jx jxVar = kxVar.f49376f;
            if (jxVar != null) {
                jxVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(v4.e1 e1Var) {
    }
}
