package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class iw extends dy {
    public final ey d;

    public iw(ey eyVar) {
        super(eyVar, 1);
        this.d = eyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 0) {
            this.d.f33539g0 = false;
        }
        super.a(recyclerView, i3);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        ey eyVar = this.d;
        fw fwVar = eyVar.R;
        eyVar.U(fwVar.I0());
        super.b(recyclerView, i3, i10);
        ex exVar = eyVar.T;
        if (exVar != null && eyVar.Q.getAdapter() == exVar) {
            ex exVar2 = exVar.f33499y.f33204a;
            if (!exVar2.G.W.G && !exVar2.F) {
                if (fwVar.N0() + 20 > exVar.b()) {
                    dx dxVar = exVar.f33499y;
                    Objects.requireNonNull(dxVar);
                    org.telegram.messenger.g0.h3(new nv(dxVar, 1));
                }
            }
        }
    }
}
