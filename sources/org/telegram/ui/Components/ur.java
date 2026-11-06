package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ur {
    public final int f38702a;
    public final rr f38703b;
    public boolean f38704c;
    public boolean d;
    public boolean f38705e;
    public long f38706f;
    public String f38707g;
    public final ArrayList h = new ArrayList();
    public boolean f38708i = false;

    public ur(int i7, rr rrVar) {
        this.f38702a = i7;
        this.f38703b = rrVar;
    }

    public final void a() {
        if (!this.f38704c && !this.f38705e) {
            this.f38704c = true;
            boolean z9 = this.d;
            int i7 = this.f38702a;
            if (!z9) {
                tr trVar = new tr(this, 0);
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
                a02.f26688a.c(new ng(this, a02, trVar, 4));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f38707g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new x1(this, 2));
        }
    }
}
