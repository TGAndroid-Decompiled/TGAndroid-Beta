package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class js {
    public final int f36597a;
    public final gs f36598b;
    public boolean f36599c;
    public boolean d;
    public boolean f36600e;
    public long f36601f;
    public String f36602g;
    public final ArrayList h = new ArrayList();
    public boolean f36603i = false;

    public js(int i7, gs gsVar) {
        this.f36597a = i7;
        this.f36598b = gsVar;
    }

    public final void a() {
        if (!this.f36599c && !this.f36600e) {
            this.f36599c = true;
            boolean z10 = this.d;
            int i7 = this.f36597a;
            if (!z10) {
                is isVar = new is(this, 0);
                org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                a02.f27080a.c(new g(this, a02, isVar, 10));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f36602g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new f2(this, 2));
        }
    }
}
