package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ts {
    public final int f28649a;
    public final ps f28650b;
    public boolean f28651c;
    public boolean d;
    public boolean e;
    public long f28652f;
    public String f28653g;
    public final ArrayList h = new ArrayList();
    public boolean f28654i = false;

    public ts(int i10, ps psVar) {
        this.f28649a = i10;
        this.f28650b = psVar;
    }

    public final void a() {
        if (!this.f28651c && !this.e) {
            this.f28651c = true;
            boolean z10 = this.d;
            int i10 = this.f28649a;
            if (!z10) {
                ss ssVar = new ss(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, ssVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28653g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
