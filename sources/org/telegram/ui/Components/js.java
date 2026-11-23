package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class js {
    public final int f36546a;
    public final gs f36547b;
    public boolean f36548c;
    public boolean d;
    public boolean f36549e;
    public long f36550f;
    public String f36551g;
    public final ArrayList h = new ArrayList();
    public boolean f36552i = false;

    public js(int i7, gs gsVar) {
        this.f36546a = i7;
        this.f36547b = gsVar;
    }

    public final void a() {
        if (!this.f36548c && !this.f36549e) {
            this.f36548c = true;
            boolean z10 = this.d;
            int i7 = this.f36546a;
            if (!z10) {
                is isVar = new is(this, 0);
                org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i7);
                a02.f27214a.c(new g(this, a02, isVar, 10));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f36551g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new f2(this, 2));
        }
    }
}
