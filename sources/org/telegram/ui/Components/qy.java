package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class qy implements fz {
    public final ry f26493a;

    public qy(ry ryVar) {
        this.f26493a = ryVar;
    }

    @Override
    public final void d() {
        ry ryVar = this.f26493a;
        if (ryVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ryVar.F.V.e(true);
        ry.E(ryVar, new hy(2, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f26493a.v;
        hy hyVar = new hy(1, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            hx0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.pf(15, linkedHashSet, hyVar));
        } else {
            hyVar.run();
        }
    }
}
