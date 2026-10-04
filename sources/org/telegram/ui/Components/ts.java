package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ts {
    public final int f31160a;
    public final ps f31161b;
    public boolean f31162c;
    public boolean d;
    public boolean f31163e;
    public long f31164f;
    public String f31165g;
    public final ArrayList h = new ArrayList();
    public boolean f31166i = false;

    public ts(int i10, ps psVar) {
        this.f31160a = i10;
        this.f31161b = psVar;
    }

    public final void a() {
        if (!this.f31162c && !this.f31163e) {
            this.f31162c = true;
            boolean z10 = this.d;
            int i10 = this.f31160a;
            if (!z10) {
                ss ssVar = new ss(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, ssVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f31165g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
