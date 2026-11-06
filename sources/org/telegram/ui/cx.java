package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class cx extends v4.v {
    public boolean d;
    public final ex f44910e;

    public cx(ex exVar) {
        this.f44910e = exVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f56952a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        if (d1Var.f56956f != 3) {
            return v4.v.l(0, 0);
        }
        return v4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        boolean z9;
        boolean z10 = false;
        if (d1Var.f56956f != d1Var2.f56956f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ex exVar = this.f44910e;
        bx bxVar = exVar.f45423a;
        ex exVar2 = bxVar.f44500f;
        int i7 = exVar2.f45428n;
        ArrayList arrayList = exVar2.f45426e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = exVar2.f45429r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            bxVar.j(b10, b11);
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f56952a;
            if (b11 != exVar.f45429r - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            h4Var.setDrawDivider(z9);
            org.telegram.ui.Cells.h4 h4Var2 = (org.telegram.ui.Cells.h4) d1Var2.f56952a;
            if (b10 != exVar.f45429r - 1) {
                z10 = true;
            }
            h4Var2.setDrawDivider(z10);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        ex exVar = this.f44910e;
        if (i7 != 0) {
            exVar.f45424b.I0(false);
            d1Var.f56952a.setPressed(true);
        } else if (this.d) {
            dx dxVar = exVar.f45427f;
            if (dxVar != null) {
                dxVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }
}
