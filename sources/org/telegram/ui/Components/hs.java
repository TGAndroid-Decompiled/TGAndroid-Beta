package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class hs {
    public final int f35957a;
    public final es f35958b;
    public boolean f35959c;
    public boolean d;
    public boolean f35960e;
    public long f35961f;
    public String f35962g;
    public final ArrayList h = new ArrayList();
    public boolean f35963i = false;

    public hs(int i7, es esVar) {
        this.f35957a = i7;
        this.f35958b = esVar;
    }

    public final void a() {
        if (!this.f35959c && !this.f35960e) {
            this.f35959c = true;
            boolean z10 = this.d;
            int i7 = this.f35957a;
            if (!z10) {
                gs gsVar = new gs(this, 0);
                org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                a02.f27054a.c(new k7(this, a02, gsVar, 9));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f35962g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new e2(this, 2));
        }
    }
}
