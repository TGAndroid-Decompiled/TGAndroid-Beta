package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class gs {
    public final int f35523a;
    public final ds f35524b;
    public boolean f35525c;
    public boolean d;
    public boolean f35526e;
    public long f35527f;
    public String f35528g;
    public final ArrayList h = new ArrayList();
    public boolean f35529i = false;

    public gs(int i7, ds dsVar) {
        this.f35523a = i7;
        this.f35524b = dsVar;
    }

    public final void a() {
        if (!this.f35525c && !this.f35526e) {
            this.f35525c = true;
            boolean z10 = this.d;
            int i7 = this.f35523a;
            if (!z10) {
                fs fsVar = new fs(this, 0);
                org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                a02.f27149a.c(new org.telegram.ui.Cells.fa(this, a02, fsVar, 11));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f35528g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new e2(this, 2));
        }
    }
}
