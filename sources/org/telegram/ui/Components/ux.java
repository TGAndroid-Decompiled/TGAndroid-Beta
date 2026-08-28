package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ux implements ky {
    public final vx f33157a;

    public ux(vx vxVar) {
        this.f33157a = vxVar;
    }

    @Override
    public final void d() {
        vx vxVar = this.f33157a;
        if (vxVar.B.R.B) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        vxVar.B.R.e(true);
        vx.E(vxVar, new zq(11, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f33157a.v;
        zq zqVar = new zq(10, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ew0.f28192u3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.df(17, linkedHashSet, zqVar));
        } else {
            zqVar.run();
        }
    }
}
