package org.telegram.ui.Components;

import android.os.Build;
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
            this.d.f26827f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        nz nzVar = this.d;
        ny nyVar = nzVar.S;
        nx nxVar = nzVar.Q;
        nzVar.U(nxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = nzVar.f26841j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (nyVar != null && nzVar.P.getAdapter() == nyVar) {
            ny nyVar2 = nyVar.f26805x.f26465a;
            if (!nyVar2.F.V.F && !nyVar2.E) {
                if (nxVar.N0() + 20 > nyVar.h()) {
                    my myVar = nyVar.f26805x;
                    Objects.requireNonNull(myVar);
                    AndroidUtilities.runOnUIThread(new uw(myVar, 1));
                }
            }
        }
    }
}
