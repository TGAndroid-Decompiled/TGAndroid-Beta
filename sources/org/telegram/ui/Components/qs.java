package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f27391a;
    public final ms f27392b;
    public boolean f27393c;
    public boolean d;
    public boolean e;
    public long f27394f;
    public String f27395g;
    public final ArrayList h = new ArrayList();
    public boolean f27396i = false;

    public qs(int i10, ms msVar) {
        this.f27391a = i10;
        this.f27392b = msVar;
    }

    public final void a() {
        if (!this.f27393c && !this.e) {
            this.f27393c = true;
            boolean z10 = this.d;
            int i10 = this.f27391a;
            if (!z10) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.q(this, messagesStorage, psVar, 14));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27395g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
