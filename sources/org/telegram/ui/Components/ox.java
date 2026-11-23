package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class ox implements ey {
    public final px f38273a;

    public ox(px pxVar) {
        this.f38273a = pxVar;
    }

    @Override
    public final void e() {
        px pxVar = this.f38273a;
        if (pxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        pxVar.G.W.e(true);
        px.E(pxVar, new bt(7, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f38273a.f38607w;
        bt btVar = new bt(6, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            kv0.G3.c(org.telegram.messenger.i10.f24637t0, str, new ph(4, linkedHashSet, btVar));
        } else {
            btVar.run();
        }
    }
}
