package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ex extends v4.v {
    public boolean d;
    public final gx f45524e;

    public ex(gx gxVar) {
        this.f45524e = gxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57056a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        if (d1Var.f57060f != 3) {
            return v4.v.l(0, 0);
        }
        return v4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        boolean z9;
        boolean z10 = false;
        if (d1Var.f57060f != d1Var2.f57060f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        gx gxVar = this.f45524e;
        dx dxVar = gxVar.f46081a;
        gx gxVar2 = dxVar.f45129f;
        int i7 = gxVar2.f46086n;
        ArrayList arrayList = gxVar2.f46084e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = gxVar2.f46087r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            dxVar.j(b10, b11);
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f57056a;
            if (b11 != gxVar.f46087r - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            h4Var.setDrawDivider(z9);
            org.telegram.ui.Cells.h4 h4Var2 = (org.telegram.ui.Cells.h4) d1Var2.f57056a;
            if (b10 != gxVar.f46087r - 1) {
                z10 = true;
            }
            h4Var2.setDrawDivider(z10);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        gx gxVar = this.f45524e;
        if (i7 != 0) {
            gxVar.f46082b.I0(false);
            d1Var.f57056a.setPressed(true);
        } else if (this.d) {
            fx fxVar = gxVar.f46085f;
            if (fxVar != null) {
                fxVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }
}
