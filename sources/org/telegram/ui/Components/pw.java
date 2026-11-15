package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class pw extends ky {
    public final ly d;

    public pw(ly lyVar) {
        super(lyVar, 1);
        this.d = lyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f36950g0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        ly lyVar = this.d;
        mw mwVar = lyVar.R;
        lyVar.V(mwVar.I0());
        super.b(recyclerView, i7, i10);
        lx lxVar = lyVar.T;
        if (lxVar != null && lyVar.Q.getAdapter() == lxVar) {
            lx lxVar2 = lxVar.f36926y.f36647a;
            if (!lxVar2.G.W.G && !lxVar2.F) {
                if (mwVar.N0() + 20 > lxVar.b()) {
                    kx kxVar = lxVar.f36926y;
                    Objects.requireNonNull(kxVar);
                    org.telegram.messenger.g0.h3(new uv(kxVar, 1));
                }
            }
        }
    }
}
