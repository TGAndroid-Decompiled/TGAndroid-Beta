package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class zs {
    public final int f33034a;
    public final ws f33035b;
    public boolean f33036c;
    public boolean d;
    public boolean e;
    public long f33037f;
    public String f33038g;
    public final ArrayList h = new ArrayList();
    public boolean f33039i = false;

    public zs(int i10, ws wsVar) {
        this.f33034a = i10;
        this.f33035b = wsVar;
    }

    public final void a() {
        if (!this.f33036c && !this.e) {
            this.f33036c = true;
            boolean z10 = this.d;
            int i10 = this.f33034a;
            if (!z10) {
                ys ysVar = new ys(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new lg(this, messagesStorage, ysVar, 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33038g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
