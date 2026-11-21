package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class ix extends v4.w {
    public boolean d;
    public final kx f48834e;

    public ix(kx kxVar) {
        this.f48834e = kxVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59161a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        if (f1Var.f59165f != 3) {
            return v4.w.l(0, 0);
        }
        return v4.w.l(3, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        boolean z10;
        boolean z11 = false;
        if (f1Var.f59165f != f1Var2.f59165f) {
            return false;
        }
        int b10 = f1Var.b();
        int b11 = f1Var2.b();
        kx kxVar = this.f48834e;
        hx hxVar = kxVar.f49393a;
        kx kxVar2 = hxVar.f48538f;
        int i7 = kxVar2.f49398n;
        ArrayList arrayList = kxVar2.f49396e;
        int i10 = b10 - i7;
        int i11 = b11 - i7;
        int i12 = kxVar2.f49399r - i7;
        if (i10 >= 0 && i11 >= 0 && i10 < i12 && i11 < i12) {
            arrayList.set(i10, (Long) arrayList.get(i11));
            arrayList.set(i11, (Long) arrayList.get(i10));
            hxVar.j(b10, b11);
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) f1Var.f59161a;
            if (b11 != kxVar.f49399r - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.setDrawDivider(z10);
            org.telegram.ui.Cells.i4 i4Var2 = (org.telegram.ui.Cells.i4) f1Var2.f59161a;
            if (b10 != kxVar.f49399r - 1) {
                z11 = true;
            }
            i4Var2.setDrawDivider(z11);
            this.d = true;
        }
        return true;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        kx kxVar = this.f48834e;
        if (i7 != 0) {
            kxVar.f49394b.I0(false);
            f1Var.f59161a.setPressed(true);
        } else if (this.d) {
            jx jxVar = kxVar.f49397f;
            if (jxVar != null) {
                jxVar.a();
            }
            this.d = false;
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }
}
