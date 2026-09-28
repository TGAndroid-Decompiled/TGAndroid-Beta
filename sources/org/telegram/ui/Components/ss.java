package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ss {
    public final int f28362a;
    public final os f28363b;
    public boolean f28364c;
    public boolean d;
    public boolean e;
    public long f28365f;
    public String f28366g;
    public final ArrayList h = new ArrayList();
    public boolean f28367i = false;

    public ss(int i10, os osVar) {
        this.f28362a = i10;
        this.f28363b = osVar;
    }

    public final void a() {
        if (!this.f28364c && !this.e) {
            this.f28364c = true;
            boolean z10 = this.d;
            int i10 = this.f28362a;
            if (!z10) {
                rs rsVar = new rs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, rsVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28366g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
