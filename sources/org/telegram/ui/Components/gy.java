package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class gy extends c00 {
    public final d00 d;

    public gy(d00 d00Var) {
        super(d00Var, 1);
        this.d = d00Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f25090f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        d00 d00Var = this.d;
        cz czVar = d00Var.S;
        dy dyVar = d00Var.Q;
        d00Var.U(dyVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = d00Var.f25104j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (czVar != null && d00Var.P.getAdapter() == czVar) {
            cz czVar2 = czVar.f25058x.f24776a;
            if (!czVar2.F.V.F && !czVar2.E) {
                if (dyVar.N0() + 20 > czVar.h()) {
                    bz bzVar = czVar.f25058x;
                    Objects.requireNonNull(bzVar);
                    AndroidUtilities.runOnUIThread(new kx(bzVar, 1));
                }
            }
        }
    }
}
