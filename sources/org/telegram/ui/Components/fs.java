package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class fs {
    public final int f26124a;
    public final bs f26125b;
    public boolean f26126c;
    public boolean d;
    public boolean e;
    public long f26127f;
    public String f26128g;
    public final ArrayList h = new ArrayList();
    public boolean f26129i = false;

    public fs(int i10, bs bsVar) {
        this.f26124a = i10;
        this.f26125b = bsVar;
    }

    public final void a() {
        if (!this.f26126c && !this.e) {
            this.f26126c = true;
            boolean z10 = this.d;
            int i10 = this.f26124a;
            if (!z10) {
                es esVar = new es(this, 0);
                org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i10);
                a02.f15938a.c(new jg(this, a02, esVar, 4));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f26128g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 2));
        }
    }
}
