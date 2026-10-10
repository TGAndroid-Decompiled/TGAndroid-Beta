package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ht {
    public final int f27140a;
    public final dt f27141b;
    public boolean f27142c;
    public boolean d;
    public boolean f27143e;
    public long f27144f;
    public String f27145g;
    public final ArrayList h = new ArrayList();
    public boolean f27146i = false;

    public ht(int i10, dt dtVar) {
        this.f27140a = i10;
        this.f27141b = dtVar;
    }

    public final void a() {
        if (!this.f27142c && !this.f27143e) {
            this.f27142c = true;
            boolean z10 = this.d;
            int i10 = this.f27140a;
            if (!z10) {
                gt gtVar = new gt(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.f(this, messagesStorage, gtVar, 20));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27145g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
