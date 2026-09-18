package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class jy implements yy {
    public final ky f25479a;

    public jy(ky kyVar) {
        this.f25479a = kyVar;
    }

    @Override
    public final void d() {
        ky kyVar = this.f25479a;
        if (kyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        kyVar.F.V.e(true);
        ky.E(kyVar, new uw(3, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f25479a.v;
        uw uwVar = new uw(2, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ix0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.of(15, linkedHashSet, uwVar));
        } else {
            uwVar.run();
        }
    }
}
