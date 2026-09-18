package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class iy implements yy {
    public final jy f25050a;

    public iy(jy jyVar) {
        this.f25050a = jyVar;
    }

    @Override
    public final void d() {
        jy jyVar = this.f25050a;
        if (jyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        jyVar.F.V.e(true);
        jy.E(jyVar, new oh(29, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f25050a.v;
        oh ohVar = new oh(28, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            xw0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.pf(15, linkedHashSet, ohVar));
        } else {
            ohVar.run();
        }
    }
}
