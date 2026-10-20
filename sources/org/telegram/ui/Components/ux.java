package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ux extends sz {
    public final tz d;

    public ux(tz tzVar) {
        super(tzVar, 1);
        this.d = tzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f30731f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        tz tzVar = this.d;
        ty tyVar = tzVar.S;
        rx rxVar = tzVar.Q;
        tzVar.U(rxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (fVar = tzVar.f30745j2) != null) {
            fVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (tyVar != null && tzVar.P.getAdapter() == tyVar && !tyVar.f30711x.a() && !tyVar.f30711x.f30372a.E) {
            if (rxVar.N0() + 20 > tyVar.h()) {
                sy syVar = tyVar.f30711x;
                Objects.requireNonNull(syVar);
                AndroidUtilities.runOnUIThread(new zw(syVar, 1));
            }
        }
    }
}
