package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class dz extends s4.v {
    public boolean d;
    public final fz e;

    public dz(fz fzVar) {
        this.e = fzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f41610a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f41613f != 3) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        boolean z10;
        boolean z11 = false;
        if (c1Var.f41613f != c1Var2.f41613f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        fz fzVar = this.e;
        cz czVar = fzVar.f32936a;
        fz fzVar2 = czVar.d;
        int i10 = fzVar2.f32940n;
        ArrayList arrayList = fzVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = fzVar2.f32941r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            czVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.f41610a;
            if (b11 != fzVar.f32941r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) c1Var2.f41610a;
            if (b10 != fzVar.f32941r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        fz fzVar = this.e;
        if (i10 != 0) {
            fzVar.f32937b.I0(false);
            c1Var.f41610a.setPressed(true);
        } else if (this.d) {
            ez ezVar = fzVar.f32939f;
            if (ezVar != null) {
                ezVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
