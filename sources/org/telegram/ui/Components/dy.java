package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class dy implements sy {
    public final ey f27885a;

    public dy(ey eyVar) {
        this.f27885a = eyVar;
    }

    @Override
    public final void d() {
        ey eyVar = this.f27885a;
        if (eyVar.B.R.B) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        eyVar.B.R.e(true);
        ey.E(eyVar, new gt(8, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f27885a.v;
        gt gtVar = new gt(7, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ow0.f31489u3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.tm(10, linkedHashSet, gtVar));
        } else {
            gtVar.run();
        }
    }
}
