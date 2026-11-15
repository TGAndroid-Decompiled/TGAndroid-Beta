package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class kx implements zx {
    public final lx f36647a;

    public kx(lx lxVar) {
        this.f36647a = lxVar;
    }

    @Override
    public final void e() {
        lx lxVar = this.f36647a;
        if (lxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lxVar.G.W.e(true);
        lx.E(lxVar, new vs(7, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f36647a.f36924w;
        vs vsVar = new vs(6, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            av0.G3.c(org.telegram.messenger.m10.f24934t0, str, new gh(3, linkedHashSet, vsVar));
        } else {
            vsVar.run();
        }
    }
}
