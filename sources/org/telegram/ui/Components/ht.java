package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ht {
    public final int f27071a;
    public final dt f27072b;
    public boolean f27073c;
    public boolean d;
    public boolean f27074e;
    public long f27075f;
    public String f27076g;
    public final ArrayList h = new ArrayList();
    public boolean f27077i = false;

    public ht(int i10, dt dtVar) {
        this.f27071a = i10;
        this.f27072b = dtVar;
    }

    public final void a() {
        if (!this.f27073c && !this.f27074e) {
            this.f27073c = true;
            boolean z10 = this.d;
            int i10 = this.f27071a;
            if (!z10) {
                gt gtVar = new gt(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.f(this, messagesStorage, gtVar, 20));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27076g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
