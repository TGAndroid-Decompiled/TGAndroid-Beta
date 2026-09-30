package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class my implements bz {
    public final ny f26465a;

    public my(ny nyVar) {
        this.f26465a = nyVar;
    }

    @Override
    public final void d() {
        ny nyVar = this.f26465a;
        if (nyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        nyVar.F.V.e(true);
        ny.E(nyVar, new xw(4, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f26465a.v;
        xw xwVar = new xw(3, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            jx0.F3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, xwVar));
        } else {
            xwVar.run();
        }
    }
}
