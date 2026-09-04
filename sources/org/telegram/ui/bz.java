package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bz extends s4.v {
    public boolean d;
    public final dz f34945e;

    public bz(dz dzVar) {
        this.f34945e = dzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f45738a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f45742f != 3) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        boolean z10;
        boolean z11 = false;
        if (c1Var.f45742f != c1Var2.f45742f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        dz dzVar = this.f34945e;
        az azVar = dzVar.f35887a;
        dz dzVar2 = azVar.d;
        int i10 = dzVar2.f35892n;
        ArrayList arrayList = dzVar2.f35890e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = dzVar2.f35893r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            azVar.p(b10, b11);
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) c1Var.f45738a;
            if (b11 != dzVar.f35893r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.f4 f4Var2 = (org.telegram.ui.Cells.f4) c1Var2.f45738a;
            if (b10 != dzVar.f35893r - 1) {
                z11 = true;
            }
            f4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        dz dzVar = this.f34945e;
        if (i10 != 0) {
            dzVar.f35888b.I0(false);
            c1Var.f45738a.setPressed(true);
        } else if (this.d) {
            cz czVar = dzVar.f35891f;
            if (czVar != null) {
                czVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
