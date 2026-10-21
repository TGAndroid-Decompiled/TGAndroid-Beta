package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class sy implements hz {
    public final ty f30373a;

    public sy(ty tyVar) {
        this.f30373a = tyVar;
    }

    public final boolean a() {
        return this.f30373a.F.V.F;
    }

    @Override
    public final void e() {
        if (a()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ty tyVar = this.f30373a;
        tyVar.F.V.e(true);
        ty.E(tyVar, new yt(6, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f30373a.v;
        yt ytVar = new yt(5, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            rx0.f30033w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.ActionBar.j3(28, linkedHashSet, ytVar));
        } else {
            ytVar.run();
        }
    }
}
