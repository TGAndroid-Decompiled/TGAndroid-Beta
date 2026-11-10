package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fx extends v4.v {
    public boolean d;
    public final hx f45861e;

    public fx(hx hxVar) {
        this.f45861e = hxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57052a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        if (d1Var.f57056f != 3) {
            return v4.v.l(0, 0);
        }
        return v4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        boolean z9;
        boolean z10 = false;
        if (d1Var.f57056f != d1Var2.f57056f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        hx hxVar = this.f45861e;
        ex exVar = hxVar.f46436a;
        hx hxVar2 = exVar.f45457f;
        int i7 = hxVar2.f46441n;
        ArrayList arrayList = hxVar2.f46439e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = hxVar2.f46442r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            exVar.j(b10, b11);
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f57052a;
            if (b11 != hxVar.f46442r - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            h4Var.setDrawDivider(z9);
            org.telegram.ui.Cells.h4 h4Var2 = (org.telegram.ui.Cells.h4) d1Var2.f57052a;
            if (b10 != hxVar.f46442r - 1) {
                z10 = true;
            }
            h4Var2.setDrawDivider(z10);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        hx hxVar = this.f45861e;
        if (i7 != 0) {
            hxVar.f46437b.I0(false);
            d1Var.f57052a.setPressed(true);
        } else if (this.d) {
            gx gxVar = hxVar.f46440f;
            if (gxVar != null) {
                gxVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }
}
