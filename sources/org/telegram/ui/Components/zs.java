package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class zs {
    public final int f33328a;
    public final ws f33329b;
    public boolean f33330c;
    public boolean d;
    public boolean e;
    public long f33331f;
    public String f33332g;
    public final ArrayList h = new ArrayList();
    public boolean f33333i = false;

    public zs(int i10, ws wsVar) {
        this.f33328a = i10;
        this.f33329b = wsVar;
    }

    public final void a() {
        if (!this.f33330c && !this.e) {
            this.f33330c = true;
            boolean z10 = this.d;
            int i10 = this.f33328a;
            if (!z10) {
                ys ysVar = new ys(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new lg(this, messagesStorage, ysVar, 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33332g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
