package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class rx implements hy {
    public final sx f39323a;

    public rx(sx sxVar) {
        this.f39323a = sxVar;
    }

    @Override
    public final void e() {
        sx sxVar = this.f39323a;
        if (sxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        sxVar.G.W.e(true);
        sx.E(sxVar, new fw(3, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f39323a.f39670w;
        fw fwVar = new fw(2, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            lv0.G3.c(org.telegram.messenger.k10.f24932t0, str, new rh(3, linkedHashSet, fwVar));
        } else {
            fwVar.run();
        }
    }
}
