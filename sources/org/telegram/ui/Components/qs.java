package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f27665a;
    public final ms f27666b;
    public boolean f27667c;
    public boolean d;
    public boolean e;
    public long f27668f;
    public String f27669g;
    public final ArrayList h = new ArrayList();
    public boolean f27670i = false;

    public qs(int i10, ms msVar) {
        this.f27665a = i10;
        this.f27666b = msVar;
    }

    public final void a() {
        if (!this.f27667c && !this.e) {
            this.f27667c = true;
            boolean z10 = this.d;
            int i10 = this.f27665a;
            if (!z10) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, psVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27669g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
