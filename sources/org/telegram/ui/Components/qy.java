package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class qy implements fz {
    public final ry f30009a;

    public qy(ry ryVar) {
        this.f30009a = ryVar;
    }

    @Override
    public final void e() {
        ry ryVar = this.f30009a;
        if (ryVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ryVar.F.V.e(true);
        ry.E(ryVar, new wt(6, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f30009a.v;
        wt wtVar = new wt(5, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            tx0.f30910z3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.ActionBar.m3(28, linkedHashSet, wtVar));
        } else {
            wtVar.run();
        }
    }
}
