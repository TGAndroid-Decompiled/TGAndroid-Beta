package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ks {
    public final int f30134a;
    public final hs f30135b;
    public boolean f30136c;
    public boolean d;
    public boolean f30137e;
    public long f30138f;
    public String f30139g;
    public final ArrayList h = new ArrayList();
    public boolean f30140i = false;

    public ks(int i10, hs hsVar) {
        this.f30134a = i10;
        this.f30135b = hsVar;
    }

    public final void a() {
        if (!this.f30136c && !this.f30137e) {
            this.f30136c = true;
            boolean z10 = this.d;
            int i10 = this.f30134a;
            if (!z10) {
                js jsVar = new js(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new g(this, messagesStorage, jsVar, 8));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f30139g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new a2(this, 3));
        }
    }
}
