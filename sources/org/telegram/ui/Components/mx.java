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
            this.d.f26417c0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        kz kzVar = this.d;
        jy jyVar = kzVar.P;
        jx jxVar = kzVar.N;
        kzVar.W(jxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = kzVar.f26432g2) != null) {
            eVar.f(i10, i11);
            kzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (jyVar != null && kzVar.M.getAdapter() == jyVar) {
            jy jyVar2 = jyVar.f26065x.f25796a;
            if (!jyVar2.C.S.C && !jyVar2.B) {
                if (jxVar.N0() + 20 > jyVar.h()) {
                    iy iyVar = jyVar.f26065x;
                    Objects.requireNonNull(iyVar);
                    AndroidUtilities.runOnUIThread(new ow(iyVar, 1));
                }
            }
        }
    }
}
