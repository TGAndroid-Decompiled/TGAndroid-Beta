package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class px implements fy {
    public final qx f38591a;

    public px(qx qxVar) {
        this.f38591a = qxVar;
    }

    @Override
    public final void e() {
        qx qxVar = this.f38591a;
        if (qxVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        qxVar.G.W.e(true);
        qx.E(qxVar, new dw(3, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f38591a.f38931w;
        dw dwVar = new dw(2, this, str);
        if (org.telegram.messenger.j6.d(str)) {
            iv0.G3.c(org.telegram.messenger.j10.f24770t0, str, new ph(3, linkedHashSet, dwVar));
        } else {
            dwVar.run();
        }
    }
}
