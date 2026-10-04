package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class qx extends mz {
    public final nz d;

    public qx(nz nzVar) {
        super(nzVar, 1);
        this.d = nzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f29101f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        nz nzVar = this.d;
        nx nxVar = nzVar.Q;
        nzVar.S(nxVar.I0());
        super.b(recyclerView, i10, i11);
        ny nyVar = nzVar.S;
        if (nyVar != null && nzVar.P.getAdapter() == nyVar && !nyVar.f29080x.a() && !nyVar.f29080x.f28748a.E) {
            if (nxVar.N0() + 20 > nyVar.h()) {
                my myVar = nyVar.f29080x;
                Objects.requireNonNull(myVar);
                AndroidUtilities.runOnUIThread(new uw(myVar, 1));
            }
        }
    }
}
