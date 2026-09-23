package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class rs {
    public final int f27713a;
    public final ns f27714b;
    public boolean f27715c;
    public boolean d;
    public boolean e;
    public long f27716f;
    public String f27717g;
    public final ArrayList h = new ArrayList();
    public boolean f27718i = false;

    public rs(int i10, ns nsVar) {
        this.f27713a = i10;
        this.f27714b = nsVar;
    }

    public final void a() {
        if (!this.f27715c && !this.e) {
            this.f27715c = true;
            boolean z10 = this.d;
            int i10 = this.f27713a;
            if (!z10) {
                qs qsVar = new qs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.p(this, messagesStorage, qsVar, 14));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27717g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
