package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ox extends jz {
    public final kz d;

    public ox(kz kzVar) {
        super(kzVar, 1);
        this.d = kzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f27969f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        kz kzVar = this.d;
        ky kyVar = kzVar.S;
        lx lxVar = kzVar.Q;
        kzVar.W(lxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (fVar = kzVar.f27983j2) != null) {
            fVar.f(i10, i11);
            kzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (kyVar != null && kzVar.P.getAdapter() == kyVar) {
            ky kyVar2 = kyVar.f27948x.f27611a;
            if (!kyVar2.F.V.F && !kyVar2.E) {
                if (lxVar.N0() + 20 > kyVar.h()) {
                    jy jyVar = kyVar.f27948x;
                    Objects.requireNonNull(jyVar);
                    AndroidUtilities.runOnUIThread(new sw(jyVar, 1));
                }
            }
        }
    }
}
