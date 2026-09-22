package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f27432a;
    public final ms f27433b;
    public boolean f27434c;
    public boolean d;
    public boolean e;
    public long f27435f;
    public String f27436g;
    public final ArrayList h = new ArrayList();
    public boolean f27437i = false;

    public qs(int i10, ms msVar) {
        this.f27432a = i10;
        this.f27433b = msVar;
    }

    public final void a() {
        if (!this.f27434c && !this.e) {
            this.f27434c = true;
            boolean z10 = this.d;
            int i10 = this.f27432a;
            if (!z10) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.p(this, messagesStorage, psVar, 14));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27436g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
