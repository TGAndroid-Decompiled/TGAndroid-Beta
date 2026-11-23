package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class uw extends py {
    public final qy d;

    public uw(qy qyVar) {
        super(qyVar, 1);
        this.d = qyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f39056g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        qy qyVar = this.d;
        rw rwVar = qyVar.R;
        qyVar.V(rwVar.I0());
        super.b(recyclerView, i7, i10);
        px pxVar = qyVar.T;
        if (pxVar != null && qyVar.Q.getAdapter() == pxVar) {
            px pxVar2 = pxVar.f38609y.f38273a;
            if (!pxVar2.G.W.G && !pxVar2.F) {
                if (rwVar.N0() + 20 > pxVar.b()) {
                    ox oxVar = pxVar.f38609y;
                    Objects.requireNonNull(oxVar);
                    org.telegram.messenger.g0.g3(new zv(oxVar, 1));
                }
            }
        }
    }
}
