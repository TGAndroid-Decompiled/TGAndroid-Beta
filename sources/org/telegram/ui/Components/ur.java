package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ur {
    public final int f38780a;
    public final rr f38781b;
    public boolean f38782c;
    public boolean d;
    public boolean f38783e;
    public long f38784f;
    public String f38785g;
    public final ArrayList h = new ArrayList();
    public boolean f38786i = false;

    public ur(int i7, rr rrVar) {
        this.f38780a = i7;
        this.f38781b = rrVar;
    }

    public final void a() {
        if (!this.f38782c && !this.f38783e) {
            this.f38782c = true;
            boolean z9 = this.d;
            int i7 = this.f38780a;
            if (!z9) {
                tr trVar = new tr(this, 0);
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
                a02.f26719a.c(new ng(this, a02, trVar, 4));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f38785g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new x1(this, 2));
        }
    }
}
