package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ur {
    public final int f38713a;
    public final rr f38714b;
    public boolean f38715c;
    public boolean d;
    public boolean f38716e;
    public long f38717f;
    public String f38718g;
    public final ArrayList h = new ArrayList();
    public boolean f38719i = false;

    public ur(int i7, rr rrVar) {
        this.f38713a = i7;
        this.f38714b = rrVar;
    }

    public final void a() {
        if (!this.f38715c && !this.f38716e) {
            this.f38715c = true;
            boolean z9 = this.d;
            int i7 = this.f38713a;
            if (!z9) {
                tr trVar = new tr(this, 0);
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
                a02.f26719a.c(new ng(this, a02, trVar, 4));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f38718g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new x1(this, 2));
        }
    }
}
