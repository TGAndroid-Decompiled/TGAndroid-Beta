package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends rz {
    public final sz d;

    public tx(sz szVar) {
        super(szVar, 1);
        this.d = szVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            this.d.f32722f0 = false;
        }
        super.a(recyclerView, i10);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        sz szVar = this.d;
        qx qxVar = szVar.Q;
        szVar.V(qxVar.I0());
        super.b(recyclerView, i10, i11);
        sy syVar = szVar.S;
        if (syVar != null && szVar.P.getAdapter() == syVar && !syVar.f32701x.a() && !syVar.f32701x.f32398a.E) {
            if (qxVar.N0() + 20 > syVar.h()) {
                ry ryVar = syVar.f32701x;
                Objects.requireNonNull(ryVar);
                AndroidUtilities.runOnUIThread(new yw(ryVar, 1));
            }
        }
    }
}
