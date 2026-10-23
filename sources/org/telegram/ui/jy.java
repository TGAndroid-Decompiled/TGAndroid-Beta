package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class jy extends s4.v {
    public boolean d;
    public final ly e;

    public jy(ly lyVar) {
        this.e = lyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45921a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f45924f != 3) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        boolean z10;
        boolean z11 = false;
        if (b1Var.f45924f != b1Var2.f45924f) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        ly lyVar = this.e;
        iy iyVar = lyVar.f39047a;
        ly lyVar2 = iyVar.d;
        int i10 = lyVar2.f39051n;
        ArrayList arrayList = lyVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = lyVar2.f39052r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            iyVar.p(b10, b11);
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) b1Var.f45921a;
            if (b11 != lyVar.f39052r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.f4 f4Var2 = (org.telegram.ui.Cells.f4) b1Var2.f45921a;
            if (b10 != lyVar.f39052r - 1) {
                z11 = true;
            }
            f4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ly lyVar = this.e;
        if (i10 != 0) {
            lyVar.f39048b.I0(false);
            b1Var.f45921a.setPressed(true);
        } else if (this.d) {
            ky kyVar = lyVar.f39050f;
            if (kyVar != null) {
                kyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
