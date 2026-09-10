package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends qz {
    public final rz d;

    public tx(rz rzVar) {
        super(rzVar, 1);
        this.d = rzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f26814f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        rz rzVar = this.d;
        ry ryVar = rzVar.S;
        qx qxVar = rzVar.Q;
        rzVar.W(qxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = rzVar.f26828j2) != null) {
            eVar.f(i10, i11);
            rzVar.C();
        }
        super.b(recyclerView, i10, i11);
        if (ryVar != null && rzVar.P.getAdapter() == ryVar) {
            ry ryVar2 = ryVar.f26784x.f26493a;
            if (!ryVar2.F.V.F && !ryVar2.E) {
                if (qxVar.N0() + 20 > ryVar.h()) {
                    qy qyVar = ryVar.f26784x;
                    Objects.requireNonNull(qyVar);
                    AndroidUtilities.runOnUIThread(new xw(qyVar, 1));
                }
            }
        }
    }
}
