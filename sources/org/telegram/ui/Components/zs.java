package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class zs {
    public final int f33030a;
    public final ws f33031b;
    public boolean f33032c;
    public boolean d;
    public boolean e;
    public long f33033f;
    public String f33034g;
    public final ArrayList h = new ArrayList();
    public boolean f33035i = false;

    public zs(int i10, ws wsVar) {
        this.f33030a = i10;
        this.f33031b = wsVar;
    }

    public final void a() {
        if (!this.f33032c && !this.e) {
            this.f33032c = true;
            boolean z10 = this.d;
            int i10 = this.f33030a;
            if (!z10) {
                ys ysVar = new ys(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new lg(this, messagesStorage, ysVar, 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33034g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
