package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ts {
    public final int f31228a;
    public final ps f31229b;
    public boolean f31230c;
    public boolean d;
    public boolean f31231e;
    public long f31232f;
    public String f31233g;
    public final ArrayList h = new ArrayList();
    public boolean f31234i = false;

    public ts(int i10, ps psVar) {
        this.f31228a = i10;
        this.f31229b = psVar;
    }

    public final void a() {
        if (!this.f31230c && !this.f31231e) {
            this.f31230c = true;
            boolean z10 = this.d;
            int i10 = this.f31228a;
            if (!z10) {
                ss ssVar = new ss(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, ssVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f31233g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
