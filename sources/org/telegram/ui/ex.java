package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ex extends v4.v {
    public boolean d;
    public final gx f46931e;

    public ex(gx gxVar) {
        this.f46931e = gxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f58535a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        if (e1Var.f58539f != 3) {
            return v4.v.l(0, 0);
        }
        return v4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        boolean z10;
        boolean z11 = false;
        if (e1Var.f58539f != e1Var2.f58539f) {
            return false;
        }
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        gx gxVar = this.f46931e;
        dx dxVar = gxVar.f47536a;
        gx gxVar2 = dxVar.f46499f;
        int i7 = gxVar2.f47541n;
        ArrayList arrayList = gxVar2.f47539e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = gxVar2.f47542r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            dxVar.j(b10, b11);
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) e1Var.f58535a;
            if (b11 != gxVar.f47542r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.h4 h4Var2 = (org.telegram.ui.Cells.h4) e1Var2.f58535a;
            if (b10 != gxVar.f47542r - 1) {
                z11 = true;
            }
            h4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        gx gxVar = this.f46931e;
        if (i7 != 0) {
            gxVar.f47537b.I0(false);
            e1Var.f58535a.setPressed(true);
        } else if (this.d) {
            fx fxVar = gxVar.f47540f;
            if (fxVar != null) {
                fxVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(v4.e1 e1Var) {
    }
}
