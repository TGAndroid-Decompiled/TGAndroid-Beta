package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class kt {
    public final int f27924a;
    public final et f27925b;
    public boolean f27926c;
    public boolean d;
    public boolean f27927e;
    public long f27928f;
    public String f27929g;
    public final ArrayList h = new ArrayList();
    public boolean f27930i = false;

    public kt(int i10, et etVar) {
        this.f27924a = i10;
        this.f27925b = etVar;
    }

    public final void a() {
        if (!this.f27926c && !this.f27927e) {
            this.f27926c = true;
            boolean z10 = this.d;
            int i10 = this.f27924a;
            if (!z10) {
                ht htVar = new ht(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.tgnet.h(this, messagesStorage, htVar, 18));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27929g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
