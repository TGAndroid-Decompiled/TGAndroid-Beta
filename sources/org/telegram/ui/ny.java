package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class ny extends f2.c0 {
    public boolean d;

    public final py f40958e;

    public ny(py pyVar) {
        this.f40958e = pyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.f5789a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        return o1Var.f5793f != 3 ? f2.c0.l(0, 0) : f2.c0.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        if (o1Var.f5793f != o1Var2.f5793f) {
            return false;
        }
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        py pyVar = this.f40958e;
        my myVar = pyVar.f41442a;
        py pyVar2 = myVar.d;
        int i10 = pyVar2.f41447n;
        ArrayList arrayList = pyVar2.f41445e;
        int i11 = iB - i10;
        int i12 = iB2 - i10;
        int i13 = pyVar2.f41448r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            Long l10 = (Long) arrayList.get(i11);
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, l10);
            myVar.p(iB, iB2);
            ((org.telegram.ui.Cells.d4) o1Var.f5789a).setDrawDivider(iB2 != pyVar.f41448r - 1);
            ((org.telegram.ui.Cells.d4) o1Var2.f5789a).setDrawDivider(iB != pyVar.f41448r - 1);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        py pyVar = this.f40958e;
        if (i10 != 0) {
            pyVar.f41443b.I0(false);
            o1Var.f5789a.setPressed(true);
        } else if (this.d) {
            oy oyVar = pyVar.f41446f;
            if (oyVar != null) {
                oyVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}
