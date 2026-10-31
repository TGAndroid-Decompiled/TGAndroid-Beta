package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class tx implements jy {
    public final ux f30694a;

    public tx(ux uxVar) {
        this.f30694a = uxVar;
    }

    @Override
    public final void e() {
        ux uxVar = this.f30694a;
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
        String str = this.f30694a.f31075w;
        at atVar = new at(6, this, str);
        if (org.telegram.messenger.k6.d(str)) {
            bw0.F3.c(org.telegram.messenger.d20.f15147s0, str, new vg(6, linkedHashSet, atVar));
        } else {
            atVar.run();
        }
    }
}
