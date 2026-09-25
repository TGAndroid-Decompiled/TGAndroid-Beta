package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ky implements zy {
    public final ly f25905a;

    public ky(ly lyVar) {
        this.f25905a = lyVar;
    }

    @Override
    public final void d() {
        ly lyVar = this.f25905a;
        if (lyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lyVar.F.V.e(true);
        ly.E(lyVar, new vw(4, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f25905a.v;
        vw vwVar = new vw(3, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            gx0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, vwVar));
        } else {
            vwVar.run();
        }
    }
}
