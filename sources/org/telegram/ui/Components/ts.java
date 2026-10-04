package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ts {
    public final int f31153a;
    public final ps f31154b;
    public boolean f31155c;
    public boolean d;
    public boolean f31156e;
    public long f31157f;
    public String f31158g;
    public final ArrayList h = new ArrayList();
    public boolean f31159i = false;

    public ts(int i10, ps psVar) {
        this.f31153a = i10;
        this.f31154b = psVar;
    }

    public final void a() {
        if (!this.f31155c && !this.f31156e) {
            this.f31155c = true;
            boolean z10 = this.d;
            int i10 = this.f31153a;
            if (!z10) {
                ss ssVar = new ss(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, ssVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f31158g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
