package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class nx extends kz {
    public final lz d;

    public nx(lz lzVar) {
        super(lzVar, 1);
        this.d = lzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f25977f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        lz lzVar = this.d;
        ky kyVar = lzVar.S;
        kx kxVar = lzVar.Q;
        lzVar.U(kxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = lzVar.f25991j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (kyVar != null && lzVar.P.getAdapter() == kyVar) {
            ky kyVar2 = kyVar.f25720x.f25438a;
            if (!kyVar2.F.V.F && !kyVar2.E) {
                if (kxVar.N0() + 20 > kyVar.h()) {
                    jy jyVar = kyVar.f25720x;
                    Objects.requireNonNull(jyVar);
                    AndroidUtilities.runOnUIThread(new sw(jyVar, 1));
                }
            }
        }
    }
}
