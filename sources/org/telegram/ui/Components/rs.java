package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class rs {
    public final int f28042a;
    public final ns f28043b;
    public boolean f28044c;
    public boolean d;
    public boolean e;
    public long f28045f;
    public String f28046g;
    public final ArrayList h = new ArrayList();
    public boolean f28047i = false;

    public rs(int i10, ns nsVar) {
        this.f28042a = i10;
        this.f28043b = nsVar;
    }

    public final void a() {
        if (!this.f28044c && !this.e) {
            this.f28044c = true;
            boolean z10 = this.d;
            int i10 = this.f28042a;
            if (!z10) {
                qs qsVar = new qs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, qsVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28046g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
