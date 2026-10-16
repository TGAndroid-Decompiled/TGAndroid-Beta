package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class uy implements jz {
    public final vy f29486a;

    public uy(vy vyVar) {
        this.f29486a = vyVar;
    }

    @Override
    public final void e() {
        vy vyVar = this.f29486a;
        if (vyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        vyVar.F.V.e(true);
        vy.E(vyVar, new vm(17, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f29486a.v;
        vm vmVar = new vm(16, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ux0.f29464w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.uc(22, linkedHashSet, vmVar));
        } else {
            vmVar.run();
        }
    }
}
