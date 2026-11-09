package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class gx implements vx {
    public final hx f34069a;

    public gx(hx hxVar) {
        this.f34069a = hxVar;
    }

    @Override
    public final void e() {
        hx hxVar = this.f34069a;
        if (hxVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        hxVar.F.V.e(true);
        hx.E(hxVar, new fq(13, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f34069a.f34400w;
        fq fqVar = new fq(12, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            av0.F3.c(org.telegram.messenger.p10.f24470s0, str, new org.telegram.messenger.voip.k(28, linkedHashSet, fqVar));
        } else {
            fqVar.run();
        }
    }
}
