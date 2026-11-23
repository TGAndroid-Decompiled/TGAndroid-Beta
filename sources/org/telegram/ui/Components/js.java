package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class js {
    public final int f36592a;
    public final gs f36593b;
    public boolean f36594c;
    public boolean d;
    public boolean f36595e;
    public long f36596f;
    public String f36597g;
    public final ArrayList h = new ArrayList();
    public boolean f36598i = false;

    public js(int i7, gs gsVar) {
        this.f36592a = i7;
        this.f36593b = gsVar;
    }

    public final void a() {
        if (!this.f36594c && !this.f36595e) {
            this.f36594c = true;
            boolean z10 = this.d;
            int i7 = this.f36592a;
            if (!z10) {
                is isVar = new is(this, 0);
                org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i7);
                a02.f27250a.c(new g(this, a02, isVar, 10));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f36597g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new f2(this, 2));
        }
    }
}
