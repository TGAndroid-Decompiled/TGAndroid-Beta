package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class sy implements hz {
    public final ty f30571a;

    public sy(ty tyVar) {
        this.f30571a = tyVar;
    }

    @Override
    public final void e() {
        ty tyVar = this.f30571a;
        if (tyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        tyVar.F.V.e(true);
        ty.E(tyVar, new yt(6, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f30571a.v;
        yt ytVar = new yt(5, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ux0.f31230z3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.ActionBar.m3(28, linkedHashSet, ytVar));
        } else {
            ytVar.run();
        }
    }
}
