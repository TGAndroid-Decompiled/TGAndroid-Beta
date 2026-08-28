package org.telegram.ui.Components;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
public final class ax extends vy {
    public final wy d;

    public ax(wy wyVar) {
        super(wyVar, 1);
        this.d = wyVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0) {
            this.d.f34387b0 = false;
        }
        super.a(recyclerView, i9);
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        wy wyVar = this.d;
        vx vxVar = wyVar.O;
        xw xwVar = wyVar.M;
        wyVar.V(xwVar.I0());
        if (Build.VERSION.SDK_INT >= 31 && (eVar = wyVar.f34404f2) != null) {
            eVar.f(i9, i10);
            wyVar.C();
        }
        super.b(recyclerView, i9, i10);
        if (vxVar != null && wyVar.L.getAdapter() == vxVar) {
            vx vxVar2 = vxVar.f34019x.f33157a;
            if (!vxVar2.B.R.B && !vxVar2.A) {
                if (xwVar.N0() + 20 > vxVar.h()) {
                    ux uxVar = vxVar.f34019x;
                    Objects.requireNonNull(uxVar);
                    AndroidUtilities.runOnUIThread(new ew(uxVar, 1));
                }
            }
        }
    }
}
