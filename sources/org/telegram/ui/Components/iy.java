package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class iy implements xy {
    public final jy f25796a;

    public iy(jy jyVar) {
        this.f25796a = jyVar;
    }

    @Override
    public final void d() {
        jy jyVar = this.f25796a;
        if (jyVar.C.S.C) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        jyVar.C.S.e(true);
        jy.E(jyVar, new il(17, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f25796a.v;
        il ilVar = new il(16, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            xw0.f30745v3.fetch(UserConfig.selectedAccount, str, new vk(2, linkedHashSet, ilVar));
        } else {
            ilVar.run();
        }
    }
}
