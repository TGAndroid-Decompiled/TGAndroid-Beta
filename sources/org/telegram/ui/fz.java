package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class fz extends s4.v {
    public boolean d;
    public final hz e;

    public fz(hz hzVar) {
        this.e = hzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f44838a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f44841f != 3) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        boolean z10;
        boolean z11 = false;
        if (b1Var.f44841f != b1Var2.f44841f) {
            return false;
        }
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        hz hzVar = this.e;
        ez ezVar = hzVar.f36670a;
        hz hzVar2 = ezVar.d;
        int i10 = hzVar2.f36674n;
        ArrayList arrayList = hzVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = hzVar2.f36675r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            ezVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) b1Var.f44838a;
            if (b11 != hzVar.f36675r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) b1Var2.f44838a;
            if (b10 != hzVar.f36675r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        hz hzVar = this.e;
        if (i10 != 0) {
            hzVar.f36671b.I0(false);
            b1Var.f44838a.setPressed(true);
        } else if (this.d) {
            gz gzVar = hzVar.f36673f;
            if (gzVar != null) {
                gzVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }
}
