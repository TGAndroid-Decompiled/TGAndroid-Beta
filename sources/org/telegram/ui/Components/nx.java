package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class nx extends jz {
    public final kz d;

    public nx(kz kzVar) {
        super(kzVar, 1);
        this.d = kzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f25867f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        kz kzVar = this.d;
        ky kyVar = kzVar.S;
        kx kxVar = kzVar.Q;
        kzVar.U(kxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (iVar = kzVar.f25881j2) != null) {
            iVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (kyVar != null && kzVar.P.getAdapter() == kyVar) {
            ky kyVar2 = kyVar.f25846x.f25513a;
            if (!kyVar2.F.V.F && !kyVar2.E) {
                if (kxVar.N0() + 20 > kyVar.h()) {
                    jy jyVar = kyVar.f25846x;
                    Objects.requireNonNull(jyVar);
                    AndroidUtilities.runOnUIThread(new sw(jyVar, 1));
                }
            }
        }
    }
}
