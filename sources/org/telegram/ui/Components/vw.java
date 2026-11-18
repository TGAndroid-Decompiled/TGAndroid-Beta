package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class vw extends qy {
    public final ry d;

    public vw(ry ryVar) {
        super(ryVar, 1);
        this.d = ryVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f39354g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ry ryVar = this.d;
        sw swVar = ryVar.R;
        ryVar.V(swVar.I0());
        super.b(recyclerView, i7, i10);
        qx qxVar = ryVar.T;
        if (qxVar != null && ryVar.Q.getAdapter() == qxVar) {
            qx qxVar2 = qxVar.f38933y.f38591a;
            if (!qxVar2.G.W.G && !qxVar2.F) {
                if (swVar.N0() + 20 > qxVar.b()) {
                    px pxVar = qxVar.f38933y;
                    Objects.requireNonNull(pxVar);
                    org.telegram.messenger.g0.g3(new zv(pxVar, 1));
                }
            }
        }
    }
}
