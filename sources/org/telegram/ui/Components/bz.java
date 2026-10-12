package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class bz implements qz {
    public final cz f24776a;

    public bz(cz czVar) {
        this.f24776a = czVar;
    }

    @Override
    public final void d() {
        cz czVar = this.f24776a;
        if (czVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        czVar.F.V.e(true);
        cz.E(czVar, new hu(8, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f24776a.v;
        hu huVar = new hu(7, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ey0.f25804w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.tc(22, linkedHashSet, huVar));
        } else {
            huVar.run();
        }
    }
}
