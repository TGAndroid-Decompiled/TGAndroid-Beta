package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class jy implements zy {
    public final ky f25438a;

    public jy(ky kyVar) {
        this.f25438a = kyVar;
    }

    @Override
    public final void d() {
        ky kyVar = this.f25438a;
        if (kyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        kyVar.F.V.e(true);
        ky.E(kyVar, new ph(29, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f25438a.v;
        ph phVar = new ph(28, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            vw0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, phVar));
        } else {
            phVar.run();
        }
    }
}
