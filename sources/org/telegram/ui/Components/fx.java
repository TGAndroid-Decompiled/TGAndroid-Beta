package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class fx implements ux {
    public final gx f33652a;

    public fx(gx gxVar) {
        this.f33652a = gxVar;
    }

    @Override
    public final void e() {
        gx gxVar = this.f33652a;
        if (gxVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        gxVar.F.V.e(true);
        gx.E(gxVar, new fq(13, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f33652a.f34009w;
        fq fqVar = new fq(12, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            yu0.F3.c(org.telegram.messenger.p10.f24459s0, str, new org.telegram.messenger.voip.k(28, linkedHashSet, fqVar));
        } else {
            fqVar.run();
        }
    }
}
