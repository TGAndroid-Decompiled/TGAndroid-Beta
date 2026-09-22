package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class mx extends jz {
    public final kz d;

    public mx(kz kzVar) {
        super(kzVar, 1);
        this.d = kzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f25709f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        kz kzVar = this.d;
        jy jyVar = kzVar.S;
        jx jxVar = kzVar.Q;
        kzVar.U(jxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = kzVar.f25723j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (jyVar != null && kzVar.P.getAdapter() == jyVar) {
            jy jyVar2 = jyVar.f25453x.f25164a;
            if (!jyVar2.F.V.F && !jyVar2.E) {
                if (jxVar.N0() + 20 > jyVar.h()) {
                    iy iyVar = jyVar.f25453x;
                    Objects.requireNonNull(iyVar);
                    AndroidUtilities.runOnUIThread(new rw(iyVar, 1));
                }
            }
        }
    }
}
