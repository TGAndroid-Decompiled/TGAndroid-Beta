package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class yy implements nz {
    public final zy f33403a;

    public yy(zy zyVar) {
        this.f33403a = zyVar;
    }

    @Override
    public final void d() {
        zy zyVar = this.f33403a;
        if (zyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        zyVar.F.V.e(true);
        zy.E(zyVar, new zr(11, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f33403a.v;
        zr zrVar = new zr(10, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            yx0.f33382w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.pc(22, linkedHashSet, zrVar));
        } else {
            zrVar.run();
        }
    }
}
