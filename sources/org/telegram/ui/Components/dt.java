package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class dt {
    public final int f24484a;
    public final zs f24485b;
    public boolean f24486c;
    public boolean d;
    public boolean e;
    public long f24487f;
    public String f24488g;
    public final ArrayList h = new ArrayList();
    public boolean f24489i = false;

    public dt(int i10, zs zsVar) {
        this.f24484a = i10;
        this.f24485b = zsVar;
    }

    public final void a() {
        if (!this.f24486c && !this.e) {
            this.f24486c = true;
            boolean z10 = this.d;
            int i10 = this.f24484a;
            if (!z10) {
                ct ctVar = new ct(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new n2.h(this, messagesStorage, ctVar, 23));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f24488g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
