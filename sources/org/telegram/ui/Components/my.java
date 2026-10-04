package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class my implements bz {
    public final ny f28754a;

    public my(ny nyVar) {
        this.f28754a = nyVar;
    }

    public final boolean a() {
        return this.f28754a.F.V.F;
    }

    @Override
    public final void d() {
        if (a()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ny nyVar = this.f28754a;
        nyVar.F.V.e(true);
        ny.E(nyVar, new yw(3, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f28754a.v;
        yw ywVar = new yw(2, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            rx0.F3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.qc(22, linkedHashSet, ywVar));
        } else {
            ywVar.run();
        }
    }
}
