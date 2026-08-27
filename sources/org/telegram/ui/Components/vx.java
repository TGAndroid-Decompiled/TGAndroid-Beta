package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

public final class vx implements ly {

    public final wx f34062a;

    public vx(wx wxVar) {
        this.f34062a = wxVar;
    }

    @Override
    public final void d() {
        wx wxVar = this.f34062a;
        if (wxVar.B.R.B) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        wxVar.B.R.e(true);
        wx.E(wxVar, new xq(11, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f34062a.v;
        xq xqVar = new xq(10, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            gw0.f28836u3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.df(17, linkedHashSet, xqVar));
        } else {
            xqVar.run();
        }
    }
}
