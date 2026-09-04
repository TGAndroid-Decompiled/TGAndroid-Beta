package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ps {
    public final int f29478a;
    public final ls f29479b;
    public boolean f29480c;
    public boolean d;
    public boolean f29481e;
    public long f29482f;
    public String f29483g;
    public final ArrayList h = new ArrayList();
    public boolean f29484i = false;

    public ps(int i10, ls lsVar) {
        this.f29478a = i10;
        this.f29479b = lsVar;
    }

    public final void a() {
        if (!this.f29480c && !this.f29481e) {
            this.f29480c = true;
            boolean z10 = this.d;
            int i10 = this.f29478a;
            if (!z10) {
                os osVar = new os(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.p(this, messagesStorage, osVar, 14));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f29483g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
