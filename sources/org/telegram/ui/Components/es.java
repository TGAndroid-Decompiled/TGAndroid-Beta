package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;

public final class es {

    public final int f28137a;

    public final bs f28138b;

    public boolean f28139c;
    public boolean d;

    public boolean f28140e;

    public long f28141f;

    public String f28142g;
    public final ArrayList h = new ArrayList();

    public boolean f28143i = false;

    public es(int i10, bs bsVar) {
        this.f28137a = i10;
        this.f28138b = bsVar;
    }

    public final void a() {
        if (this.f28139c || this.f28140e) {
            return;
        }
        this.f28139c = true;
        boolean z10 = this.d;
        int i10 = this.f28137a;
        if (!z10) {
            ds dsVar = new ds(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.i3(this, messagesStorage, dsVar, 13));
            return;
        }
        TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
        getpopularappbots.limit = 20;
        String str = this.f28142g;
        if (str == null) {
            str = "";
        }
        getpopularappbots.offset = str;
        ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new w1(this, 3));
    }
}
