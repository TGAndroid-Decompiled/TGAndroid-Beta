package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;
public final class ry implements gz {
    public final sy f32398a;

    public ry(sy syVar) {
        this.f32398a = syVar;
    }

    public final boolean a() {
        return this.f32398a.F.V.F;
    }

    @Override
    public final void e() {
        if (a()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        sy syVar = this.f32398a;
        syVar.F.V.e(true);
        sy.E(syVar, new so(16, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f32398a.v;
        so soVar = new so(15, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            cy0.G3.fetch(UserConfig.selectedAccount, str, new oy(0, linkedHashSet, soVar));
        } else {
            soVar.run();
        }
    }
}
