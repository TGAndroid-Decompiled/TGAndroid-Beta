package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class bt {
    public final int f26959a;
    public final ys f26960b;
    public boolean f26961c;
    public boolean d;
    public boolean e;
    public long f26962f;
    public String f26963g;
    public final ArrayList h = new ArrayList();
    public boolean f26964i = false;

    public bt(int i10, ys ysVar) {
        this.f26959a = i10;
        this.f26960b = ysVar;
    }

    public final void a() {
        if (!this.f26961c && !this.e) {
            this.f26961c = true;
            boolean z10 = this.d;
            int i10 = this.f26959a;
            if (!z10) {
                at atVar = new at(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new kg(this, messagesStorage, atVar, 6));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f26963g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new b2(this, 3));
        }
    }
}
