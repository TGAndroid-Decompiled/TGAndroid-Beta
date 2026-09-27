package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class az extends s4.v {
    public boolean d;
    public final cz e;

    public az(cz czVar) {
        this.e = czVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f43005a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f43008f != 3) {
            return s4.v.l(0, 0);
        }
        return s4.v.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        boolean z10;
        boolean z11 = false;
        if (c1Var.f43008f != c1Var2.f43008f) {
            return false;
        }
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        cz czVar = this.e;
        zy zyVar = czVar.f32813a;
        cz czVar2 = zyVar.d;
        int i10 = czVar2.f32817n;
        ArrayList arrayList = czVar2.e;
        int i11 = b10 - i10;
        int i12 = b11 - i10;
        int i13 = czVar2.f32818r - i10;
        if (i11 >= 0 && i12 >= 0 && i11 < i13 && i12 < i13) {
            arrayList.set(i11, (Long) arrayList.get(i12));
            arrayList.set(i12, (Long) arrayList.get(i11));
            zyVar.p(b10, b11);
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.f43005a;
            if (b11 != czVar.f32818r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            g4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.g4 g4Var2 = (org.telegram.ui.Cells.g4) c1Var2.f43005a;
            if (b10 != czVar.f32818r - 1) {
                z11 = true;
            }
            g4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        cz czVar = this.e;
        if (i10 != 0) {
            czVar.f32814b.J0(false);
            c1Var.f43005a.setPressed(true);
        } else if (this.d) {
            bz bzVar = czVar.f32816f;
            if (bzVar != null) {
                bzVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }
}
