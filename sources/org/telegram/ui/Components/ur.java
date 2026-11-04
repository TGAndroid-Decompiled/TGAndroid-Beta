package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ur {
    public final int f38850a;
    public final rr f38851b;
    public boolean f38852c;
    public boolean d;
    public boolean f38853e;
    public long f38854f;
    public String f38855g;
    public final ArrayList h = new ArrayList();
    public boolean f38856i = false;

    public ur(int i3, rr rrVar) {
        this.f38850a = i3;
        this.f38851b = rrVar;
    }

    public final void a() {
        if (!this.f38852c && !this.f38853e) {
            this.f38852c = true;
            boolean z10 = this.d;
            int i3 = this.f38850a;
            if (!z10) {
                tr trVar = new tr(this, 0);
                org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i3);
                a02.f24934a.c(new e7(this, a02, trVar, 8));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f38855g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i3).sendRequest(getpopularappbots, new w1(this, 2));
        }
    }
}
