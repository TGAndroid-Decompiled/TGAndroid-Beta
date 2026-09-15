package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f27435a;
    public final ms f27436b;
    public boolean f27437c;
    public boolean d;
    public boolean e;
    public long f27438f;
    public String f27439g;
    public final ArrayList h = new ArrayList();
    public boolean f27440i = false;

    public qs(int i10, ms msVar) {
        this.f27435a = i10;
        this.f27436b = msVar;
    }

    public final void a() {
        if (!this.f27437c && !this.e) {
            this.f27437c = true;
            boolean z10 = this.d;
            int i10 = this.f27435a;
            if (!z10) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.ui.ActionBar.p(this, messagesStorage, psVar, 14));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27439g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
