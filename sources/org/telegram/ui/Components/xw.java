package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class xw extends sy {
    public final ty d;

    public xw(ty tyVar) {
        super(tyVar, 1);
        this.d = tyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f40083g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ty tyVar = this.d;
        uw uwVar = tyVar.R;
        tyVar.V(uwVar.I0());
        super.b(recyclerView, i7, i10);
        sx sxVar = tyVar.T;
        if (sxVar != null && tyVar.Q.getAdapter() == sxVar) {
            sx sxVar2 = sxVar.f39672y.f39323a;
            if (!sxVar2.G.W.G && !sxVar2.F) {
                if (uwVar.N0() + 20 > sxVar.b()) {
                    rx rxVar = sxVar.f39672y;
                    Objects.requireNonNull(rxVar);
                    org.telegram.messenger.g0.g3(new bw(rxVar, 1));
                }
            }
        }
    }
}
