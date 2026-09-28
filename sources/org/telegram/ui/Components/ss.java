package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ss {
    public final int f28361a;
    public final os f28362b;
    public boolean f28363c;
    public boolean d;
    public boolean e;
    public long f28364f;
    public String f28365g;
    public final ArrayList h = new ArrayList();
    public boolean f28366i = false;

    public ss(int i10, os osVar) {
        this.f28361a = i10;
        this.f28362b = osVar;
    }

    public final void a() {
        if (!this.f28363c && !this.e) {
            this.f28363c = true;
            boolean z10 = this.d;
            int i10 = this.f28361a;
            if (!z10) {
                rs rsVar = new rs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, rsVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28365g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
