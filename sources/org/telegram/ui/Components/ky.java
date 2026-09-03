package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ky implements zy {
    public final ly f28513a;

    public ky(ly lyVar) {
        this.f28513a = lyVar;
    }

    @Override
    public final void d() {
        ly lyVar = this.f28513a;
        if (lyVar.C.S.C) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lyVar.C.S.e(true);
        ly.E(lyVar, new eo(15, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f28513a.v;
        eo eoVar = new eo(14, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            xw0.f33191v3.fetch(UserConfig.selectedAccount, str, new xk(2, linkedHashSet, eoVar));
        } else {
            eoVar.run();
        }
    }
}
