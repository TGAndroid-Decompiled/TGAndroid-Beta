package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f27730a;
    public final ms f27731b;
    public boolean f27732c;
    public boolean d;
    public boolean e;
    public long f27733f;
    public String f27734g;
    public final ArrayList h = new ArrayList();
    public boolean f27735i = false;

    public qs(int i10, ms msVar) {
        this.f27730a = i10;
        this.f27731b = msVar;
    }

    public final void a() {
        if (!this.f27732c && !this.e) {
            this.f27732c = true;
            boolean z10 = this.d;
            int i10 = this.f27730a;
            if (!z10) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, psVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27734g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
