package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class zs {
    public final int f33024a;
    public final ws f33025b;
    public boolean f33026c;
    public boolean d;
    public boolean e;
    public long f33027f;
    public String f33028g;
    public final ArrayList h = new ArrayList();
    public boolean f33029i = false;

    public zs(int i10, ws wsVar) {
        this.f33024a = i10;
        this.f33025b = wsVar;
    }

    public final void a() {
        if (!this.f33026c && !this.e) {
            this.f33026c = true;
            boolean z10 = this.d;
            int i10 = this.f33024a;
            if (!z10) {
                ys ysVar = new ys(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new lg(this, messagesStorage, ysVar, 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33028g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
