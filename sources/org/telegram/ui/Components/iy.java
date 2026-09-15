package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class iy implements yy {
    public final jy f25167a;

    public iy(jy jyVar) {
        this.f25167a = jyVar;
    }

    @Override
    public final void d() {
        jy jyVar = this.f25167a;
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
        String str = this.f25167a.v;
        oh ohVar = new oh(28, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ww0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.nf(15, linkedHashSet, ohVar));
        } else {
            ohVar.run();
        }
    }
}
