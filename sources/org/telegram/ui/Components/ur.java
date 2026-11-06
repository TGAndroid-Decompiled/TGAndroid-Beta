package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ur {
    public final int f38698a;
    public final rr f38699b;
    public boolean f38700c;
    public boolean d;
    public boolean f38701e;
    public long f38702f;
    public String f38703g;
    public final ArrayList h = new ArrayList();
    public boolean f38704i = false;

    public ur(int i7, rr rrVar) {
        this.f38698a = i7;
        this.f38699b = rrVar;
    }

    public final void a() {
        if (!this.f38700c && !this.f38701e) {
            this.f38700c = true;
            boolean z9 = this.d;
            int i7 = this.f38698a;
            if (!z9) {
                tr trVar = new tr(this, 0);
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
                a02.f26696a.c(new ng(this, a02, trVar, 4));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f38703g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new x1(this, 2));
        }
    }
}
