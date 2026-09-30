package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ly implements az {
    public final my f26174a;

    public ly(my myVar) {
        this.f26174a = myVar;
    }

    @Override
    public final void d() {
        my myVar = this.f26174a;
        if (myVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        myVar.F.V.e(true);
        my.E(myVar, new dv(5, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f26174a.v;
        dv dvVar = new dv(4, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ix0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, dvVar));
        } else {
            dvVar.run();
        }
    }
}
