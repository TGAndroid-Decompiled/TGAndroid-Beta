package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class jy implements yy {
    public final ky f27584a;

    public jy(ky kyVar) {
        this.f27584a = kyVar;
    }

    @Override
    public final void d() {
        ky kyVar = this.f27584a;
        if (kyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        kyVar.F.V.e(true);
        ky.E(kyVar, new zu(5, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f27584a.v;
        zu zuVar = new zu(4, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            vw0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.nf(15, linkedHashSet, zuVar));
        } else {
            zuVar.run();
        }
    }
}
