package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class rx implements hy {
    public final sx f39358a;

    public rx(sx sxVar) {
        this.f39358a = sxVar;
    }

    @Override
    public final void e() {
        sx sxVar = this.f39358a;
        if (sxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        sxVar.G.W.e(true);
        sx.E(sxVar, new ou(5, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f39358a.f39723w;
        ou ouVar = new ou(4, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            lv0.G3.c(org.telegram.messenger.j10.f24798t0, str, new rh(3, linkedHashSet, ouVar));
        } else {
            ouVar.run();
        }
    }
}
