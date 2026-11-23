package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class hx extends v4.w {
    public boolean d;
    public final jx f48642e;

    public hx(jx jxVar) {
        this.f48642e = jxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59245a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        if (f1Var.f59249f != 3) {
            return v4.w.l(0, 0);
        }
        return v4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        boolean z10;
        boolean z11 = false;
        if (f1Var.f59249f != f1Var2.f59249f) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        jx jxVar = this.f48642e;
        gx gxVar = jxVar.f49219a;
        jx jxVar2 = gxVar.f48372f;
        int i7 = jxVar2.f49224n;
        ArrayList arrayList = jxVar2.f49222e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = jxVar2.f49225r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            gxVar.j(b10, b11);
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) f1Var.f59245a;
            if (b11 != jxVar.f49225r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.i4 i4Var2 = (org.telegram.ui.Cells.i4) f1Var2.f59245a;
            if (b10 != jxVar.f49225r - 1) {
                z11 = true;
            }
            i4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        jx jxVar = this.f48642e;
        if (i7 != 0) {
            jxVar.f49220b.I0(false);
            f1Var.f59245a.setPressed(true);
        } else if (this.d) {
            ix ixVar = jxVar.f49223f;
            if (ixVar != null) {
                ixVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }
}
