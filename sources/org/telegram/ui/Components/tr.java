package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class tr {
    public final int f38374a;
    public final qr f38375b;
    public boolean f38376c;
    public boolean d;
    public boolean f38377e;
    public long f38378f;
    public String f38379g;
    public final ArrayList h = new ArrayList();
    public boolean f38380i = false;

    public tr(int i7, qr qrVar) {
        this.f38374a = i7;
        this.f38375b = qrVar;
    }

    public final void a() {
        if (!this.f38376c && !this.f38377e) {
            this.f38376c = true;
            boolean z9 = this.d;
            int i7 = this.f38374a;
            if (!z9) {
                sr srVar = new sr(this, 0);
                org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
                a02.f26723a.c(new mg(this, a02, srVar, 4));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f38379g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new w1(this, 2));
        }
    }
}
