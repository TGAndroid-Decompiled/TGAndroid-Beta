package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ly implements az {
    public final my f26231a;

    public ly(my myVar) {
        this.f26231a = myVar;
    }

    @Override
    public final void d() {
        my myVar = this.f26231a;
        if (myVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        myVar.F.V.e(true);
        my.E(myVar, new jy(1, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f26231a.v;
        jy jyVar = new jy(0, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ix0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.qc(22, linkedHashSet, jyVar));
        } else {
            jyVar.run();
        }
    }
}
