package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ky implements zy {
    public final ly f25897a;

    public ky(ly lyVar) {
        this.f25897a = lyVar;
    }

    @Override
    public final void d() {
        ly lyVar = this.f25897a;
        if (lyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lyVar.F.V.e(true);
        ly.E(lyVar, new cv(5, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f25897a.v;
        cv cvVar = new cv(4, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            gx0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, cvVar));
        } else {
            cvVar.run();
        }
    }
}
