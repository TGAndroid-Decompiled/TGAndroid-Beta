package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class gt {
    public final int f26872a;
    public final ct f26873b;
    public boolean f26874c;
    public boolean d;
    public boolean f26875e;
    public long f26876f;
    public String f26877g;
    public final ArrayList h = new ArrayList();
    public boolean f26878i = false;

    public gt(int i10, ct ctVar) {
        this.f26872a = i10;
        this.f26873b = ctVar;
    }

    public final void a() {
        if (!this.f26874c && !this.f26875e) {
            this.f26874c = true;
            boolean z10 = this.d;
            int i10 = this.f26872a;
            if (!z10) {
                ft ftVar = new ft(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.f(this, messagesStorage, ftVar, 19));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f26877g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
