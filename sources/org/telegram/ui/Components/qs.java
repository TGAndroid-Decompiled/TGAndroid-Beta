package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f30469a;
    public final ns f30470b;
    public boolean f30471c;
    public boolean d;
    public boolean f30472e;
    public long f30473f;
    public String f30474g;
    public final ArrayList h = new ArrayList();
    public boolean f30475i = false;

    public qs(int i10, ns nsVar) {
        this.f30469a = i10;
        this.f30470b = nsVar;
    }

    public final void a() {
        if (!this.f30471c && !this.f30472e) {
            this.f30471c = true;
            boolean z4 = this.d;
            int i10 = this.f30469a;
            if (!z4) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new jp(this, messagesStorage, psVar, 1));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f30474g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
