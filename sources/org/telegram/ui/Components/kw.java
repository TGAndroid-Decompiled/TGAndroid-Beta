package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class kw extends gy {
    public final hy d;

    public kw(hy hyVar) {
        super(hyVar, 1);
        this.d = hyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f34424f0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        hy hyVar = this.d;
        hw hwVar = hyVar.Q;
        hyVar.U(hwVar.I0());
        super.b(recyclerView, i7, i10);
        hx hxVar = hyVar.S;
        if (hxVar != null && hyVar.P.getAdapter() == hxVar) {
            hx hxVar2 = hxVar.f34402y.f34069a;
            if (!hxVar2.F.V.F && !hxVar2.E) {
                if (hwVar.N0() + 20 > hxVar.b()) {
                    gx gxVar = hxVar.f34402y;
                    Objects.requireNonNull(gxVar);
                    org.telegram.messenger.g0.h3(new pv(gxVar, 1));
                }
            }
        }
    }
}
