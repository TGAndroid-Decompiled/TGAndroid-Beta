package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ps {
    public final int f29506a;
    public final ls f29507b;
    public boolean f29508c;
    public boolean d;
    public boolean f29509e;
    public long f29510f;
    public String f29511g;
    public final ArrayList h = new ArrayList();
    public boolean f29512i = false;

    public ps(int i10, ls lsVar) {
        this.f29506a = i10;
        this.f29507b = lsVar;
    }

    public final void a() {
        if (!this.f29508c && !this.f29509e) {
            this.f29508c = true;
            boolean z10 = this.d;
            int i10 = this.f29506a;
            if (!z10) {
                os osVar = new os(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.p(this, messagesStorage, osVar, 14));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f29511g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
