package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class qs {
    public final int f27655a;
    public final ms f27656b;
    public boolean f27657c;
    public boolean d;
    public boolean e;
    public long f27658f;
    public String f27659g;
    public final ArrayList h = new ArrayList();
    public boolean f27660i = false;

    public qs(int i10, ms msVar) {
        this.f27655a = i10;
        this.f27656b = msVar;
    }

    public final void a() {
        if (!this.f27657c && !this.e) {
            this.f27657c = true;
            boolean z10 = this.d;
            int i10 = this.f27655a;
            if (!z10) {
                ps psVar = new ps(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, psVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27659g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
