package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class tx implements jy {
    public final ux f30727a;

    public tx(ux uxVar) {
        this.f30727a = uxVar;
    }

    @Override
    public final void e() {
        ux uxVar = this.f30727a;
        if (uxVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        uxVar.F.V.e(true);
        ux.E(uxVar, new at(7, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f30727a.f31105w;
        at atVar = new at(6, this, str);
        if (org.telegram.messenger.k6.d(str)) {
            cw0.F3.c(org.telegram.messenger.e20.f15506s0, str, new vg(6, linkedHashSet, atVar));
        } else {
            atVar.run();
        }
    }
}
