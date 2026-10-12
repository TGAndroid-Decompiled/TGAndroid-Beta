package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class cz extends s4.w {
    public boolean d;
    public final ez f36583e;

    public cz(ez ezVar) {
        this.f36583e = ezVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47897a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f47901f != 3) {
            return s4.w.l(0, 0);
        }
        return s4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        boolean z10;
        boolean z11 = false;
        if (d1Var.f47901f != d1Var2.f47901f) {
            return false;
        }
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        ez ezVar = this.f36583e;
        bz bzVar = ezVar.f37570a;
        ez ezVar2 = bzVar.d;
        int i10 = ezVar2.f37575n;
        ArrayList arrayList = ezVar2.f37573e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = ezVar2.f37576r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            bzVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) d1Var.f47897a;
            if (b11 != ezVar.f37576r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) d1Var2.f47897a;
            if (b10 != ezVar.f37576r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        ez ezVar = this.f36583e;
        if (i10 != 0) {
            ezVar.f37571b.I0(false);
            d1Var.f47897a.setPressed(true);
        } else if (this.d) {
            dz dzVar = ezVar.f37574f;
            if (dzVar != null) {
                dzVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }
}
