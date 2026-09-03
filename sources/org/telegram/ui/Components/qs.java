package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f30507a;
    public final ns f30508b;
    public boolean f30509c;
    public boolean d;
    public boolean f30510e;
    public long f30511f;
    public String f30512g;
    public final ArrayList h = new ArrayList();
    public boolean f30513i = false;

    public qs(int i10, ns nsVar) {
        this.f30507a = i10;
        this.f30508b = nsVar;
    }

    public final void a() {
        if (!this.f30509c && !this.f30510e) {
            this.f30509c = true;
            boolean z4 = this.d;
            int i10 = this.f30507a;
            if (!z4) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new jp(this, messagesStorage, psVar, 1));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f30512g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
