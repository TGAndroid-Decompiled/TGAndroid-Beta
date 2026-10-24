package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class sx extends qz {
    public final rz d;

    public sx(rz rzVar) {
        super(rzVar, 1);
        this.d = rzVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f30319f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        rz rzVar = this.d;
        ry ryVar = rzVar.S;
        px pxVar = rzVar.Q;
        rzVar.U(pxVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (fVar = rzVar.f30333j2) != null) {
            fVar.f(i10, i11);
        }
        super.b(recyclerView, i10, i11);
        if (ryVar != null && rzVar.P.getAdapter() == ryVar) {
            ry ryVar2 = ryVar.f30296x.f30009a;
            if (!ryVar2.F.V.F && !ryVar2.E) {
                if (pxVar.N0() + 20 > ryVar.h()) {
                    qy qyVar = ryVar.f30296x;
                    Objects.requireNonNull(qyVar);
                    AndroidUtilities.runOnUIThread(new xw(qyVar, 1));
                }
            }
        }
    }
}
