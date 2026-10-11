package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class zy implements oz {
    public final az f33686a;

    public zy(az azVar) {
        this.f33686a = azVar;
    }

    @Override
    public final void d() {
        az azVar = this.f33686a;
        if (azVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        azVar.F.V.e(true);
        az.E(azVar, new bs(10, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f33686a.v;
        bs bsVar = new bs(9, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ay0.f24615w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, bsVar));
        } else {
            bsVar.run();
        }
    }
}
