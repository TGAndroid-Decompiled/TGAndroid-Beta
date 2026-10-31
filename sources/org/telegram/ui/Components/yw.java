package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class yw extends uy {
    public final vy d;

    public yw(vy vyVar) {
        super(vyVar, 1);
        this.d = vyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f31874f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vy vyVar = this.d;
        vw vwVar = vyVar.Q;
        vyVar.V(vwVar.I0());
        super.b(recyclerView, i10, i11);
        ux uxVar = vyVar.S;
        if (uxVar != null && vyVar.P.getAdapter() == uxVar) {
            ux uxVar2 = uxVar.f31077y.f30694a;
            if (!uxVar2.F.V.F && !uxVar2.E) {
                if (vwVar.N0() + 20 > uxVar.b()) {
                    tx txVar = uxVar.f31077y;
                    Objects.requireNonNull(txVar);
                    org.telegram.messenger.i0.g3(new aw(txVar, 1));
                }
            }
        }
    }
}
