package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ky implements zy {
    public final ly f28473a;

    public ky(ly lyVar) {
        this.f28473a = lyVar;
    }

    @Override
    public final void d() {
        ly lyVar = this.f28473a;
        if (lyVar.C.S.C) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lyVar.C.S.e(true);
        ly.E(lyVar, new gm(16, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f28473a.v;
        gm gmVar = new gm(15, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            yw0.f33593v3.fetch(UserConfig.selectedAccount, str, new xk(2, linkedHashSet, gmVar));
        } else {
            gmVar.run();
        }
    }
}
