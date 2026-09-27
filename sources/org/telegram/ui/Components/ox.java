package org.telegram.ui.Components;

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
            this.d.f26583f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mz mzVar = this.d;
        lx lxVar = mzVar.Q;
        mzVar.U(lxVar.I0());
        super.b(recyclerView, i10, i11);
        my myVar = mzVar.S;
        if (myVar != null && mzVar.P.getAdapter() == myVar) {
            my myVar2 = myVar.f26561x.f26231a;
            if (!myVar2.F.V.F && !myVar2.E) {
                if (lxVar.N0() + 20 > myVar.h()) {
                    ly lyVar = myVar.f26561x;
                    Objects.requireNonNull(lyVar);
                    AndroidUtilities.runOnUIThread(new tw(lyVar, 1));
                }
            }
        }
    }
}
