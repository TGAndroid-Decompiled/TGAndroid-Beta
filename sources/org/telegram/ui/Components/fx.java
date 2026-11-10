package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class fx implements ux {
    public final gx f33663a;

    public fx(gx gxVar) {
        this.f33663a = gxVar;
    }

    @Override
    public final void e() {
        gx gxVar = this.f33663a;
        if (gxVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        gxVar.F.V.e(true);
        gx.E(gxVar, new ro(14, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f33663a.f34001w;
        ro roVar = new ro(13, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            zu0.F3.c(org.telegram.messenger.p10.f24474s0, str, new org.telegram.messenger.voip.k(28, linkedHashSet, roVar));
        } else {
            roVar.run();
        }
    }
}
