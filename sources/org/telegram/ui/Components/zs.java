package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class zs {
    public final int f33017a;
    public final ws f33018b;
    public boolean f33019c;
    public boolean d;
    public boolean e;
    public long f33020f;
    public String f33021g;
    public final ArrayList h = new ArrayList();
    public boolean f33022i = false;

    public zs(int i10, ws wsVar) {
        this.f33017a = i10;
        this.f33018b = wsVar;
    }

    public final void a() {
        if (!this.f33019c && !this.e) {
            this.f33019c = true;
            boolean z10 = this.d;
            int i10 = this.f33017a;
            if (!z10) {
                ys ysVar = new ys(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new lg(this, messagesStorage, ysVar, 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33021g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
