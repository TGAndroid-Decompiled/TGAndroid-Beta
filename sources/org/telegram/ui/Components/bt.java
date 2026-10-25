package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class bt {
    public final int f26957a;
    public final ys f26958b;
    public boolean f26959c;
    public boolean d;
    public boolean e;
    public long f26960f;
    public String f26961g;
    public final ArrayList h = new ArrayList();
    public boolean f26962i = false;

    public bt(int i10, ys ysVar) {
        this.f26957a = i10;
        this.f26958b = ysVar;
    }

    public final void a() {
        if (!this.f26959c && !this.e) {
            this.f26959c = true;
            boolean z10 = this.d;
            int i10 = this.f26957a;
            if (!z10) {
                at atVar = new at(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new kg(this, messagesStorage, atVar, 6));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f26961g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new b2(this, 3));
        }
    }
}
