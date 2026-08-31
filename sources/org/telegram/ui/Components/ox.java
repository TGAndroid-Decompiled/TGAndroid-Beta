package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ox extends lz {
    public final mz d;

    public ox(mz mzVar) {
        super(mzVar, 1);
        this.d = mzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f29271c0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        mz mzVar = this.d;
        ly lyVar = mzVar.P;
        lx lxVar = mzVar.N;
        mzVar.W(lxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = mzVar.f29287g2) != null) {
            eVar.f(i10, i11);
            mzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (lyVar != null && mzVar.M.getAdapter() == lyVar) {
            ly lyVar2 = lyVar.f28849x.f28473a;
            if (!lyVar2.C.S.C && !lyVar2.B) {
                if (lxVar.N0() + 20 > lyVar.h()) {
                    ky kyVar = lyVar.f28849x;
                    Objects.requireNonNull(kyVar);
                    AndroidUtilities.runOnUIThread(new qw(kyVar, 1));
                }
            }
        }
    }
}
