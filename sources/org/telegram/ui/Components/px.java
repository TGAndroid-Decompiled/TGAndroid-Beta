package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class px extends lz {
    public final mz d;

    public px(mz mzVar) {
        super(mzVar, 1);
        this.d = mzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f26557f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        mz mzVar = this.d;
        my myVar = mzVar.S;
        mx mxVar = mzVar.Q;
        mzVar.U(mxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (hVar = mzVar.f26571j2) != null) {
            hVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (myVar != null && mzVar.P.getAdapter() == myVar) {
            my myVar2 = myVar.f26537x.f26196a;
            if (!myVar2.F.V.F && !myVar2.E) {
                if (mxVar.N0() + 20 > myVar.h()) {
                    ly lyVar = myVar.f26537x;
                    Objects.requireNonNull(lyVar);
                    AndroidUtilities.runOnUIThread(new tw(lyVar, 1));
                }
            }
        }
    }
}
