package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ss {
    public final int f28351a;
    public final os f28352b;
    public boolean f28353c;
    public boolean d;
    public boolean e;
    public long f28354f;
    public String f28355g;
    public final ArrayList h = new ArrayList();
    public boolean f28356i = false;

    public ss(int i10, os osVar) {
        this.f28351a = i10;
        this.f28352b = osVar;
    }

    public final void a() {
        if (!this.f28353c && !this.e) {
            this.f28353c = true;
            boolean z10 = this.d;
            int i10 = this.f28351a;
            if (!z10) {
                rs rsVar = new rs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, rsVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28355g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
