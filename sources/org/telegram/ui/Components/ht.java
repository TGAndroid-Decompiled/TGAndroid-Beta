package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ht {
    public final int f27230a;
    public final dt f27231b;
    public boolean f27232c;
    public boolean d;
    public boolean f27233e;
    public long f27234f;
    public String f27235g;
    public final ArrayList h = new ArrayList();
    public boolean f27236i = false;

    public ht(int i10, dt dtVar) {
        this.f27230a = i10;
        this.f27231b = dtVar;
    }

    public final void a() {
        if (!this.f27232c && !this.f27233e) {
            this.f27232c = true;
            boolean z10 = this.d;
            int i10 = this.f27230a;
            if (!z10) {
                gt gtVar = new gt(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.f(this, messagesStorage, gtVar, 20));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27235g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
