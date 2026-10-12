package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class uy implements jz {
    public final vy f29818a;

    public uy(vy vyVar) {
        this.f29818a = vyVar;
    }

    @Override
    public final void e() {
        vy vyVar = this.f29818a;
        if (vyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        vyVar.F.V.e(true);
        vy.E(vyVar, new sk(22, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f29818a.v;
        sk skVar = new sk(21, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ux0.f29796w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.vc(22, linkedHashSet, skVar));
        } else {
            skVar.run();
        }
    }
}
