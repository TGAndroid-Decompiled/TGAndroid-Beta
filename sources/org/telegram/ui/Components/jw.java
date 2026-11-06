package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
public final class jw extends fy {
    public final gy d;

    public jw(gy gyVar) {
        super(gyVar, 1);
        this.d = gyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            this.d.f34085f0 = false;
        }
        super.a(recyclerView, i7);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        gy gyVar = this.d;
        gw gwVar = gyVar.Q;
        gyVar.U(gwVar.I0());
        super.b(recyclerView, i7, i10);
        gx gxVar = gyVar.S;
        if (gxVar != null && gyVar.P.getAdapter() == gxVar) {
            gx gxVar2 = gxVar.f34063y.f33708a;
            if (!gxVar2.F.V.F && !gxVar2.E) {
                if (gwVar.N0() + 20 > gxVar.b()) {
                    fx fxVar = gxVar.f34063y;
                    Objects.requireNonNull(fxVar);
                    org.telegram.messenger.g0.h3(new ov(fxVar, 1));
                }
            }
        }
    }
}
