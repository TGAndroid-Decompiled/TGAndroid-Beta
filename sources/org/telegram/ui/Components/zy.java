package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class zy implements oz {
    public final az f33726a;

    public zy(az azVar) {
        this.f33726a = azVar;
    }

    @Override
    public final void d() {
        az azVar = this.f33726a;
        if (azVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        azVar.F.V.e(true);
        az.E(azVar, new as(11, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f33726a.v;
        as asVar = new as(10, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            zx0.f33705w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.pc(22, linkedHashSet, asVar));
        } else {
            asVar.run();
        }
    }
}
