package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ts {
    public final int f31154a;
    public final ps f31155b;
    public boolean f31156c;
    public boolean d;
    public boolean f31157e;
    public long f31158f;
    public String f31159g;
    public final ArrayList h = new ArrayList();
    public boolean f31160i = false;

    public ts(int i10, ps psVar) {
        this.f31154a = i10;
        this.f31155b = psVar;
    }

    public final void a() {
        if (!this.f31156c && !this.f31157e) {
            this.f31156c = true;
            boolean z10 = this.d;
            int i10 = this.f31154a;
            if (!z10) {
                ss ssVar = new ss(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, ssVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f31159g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
