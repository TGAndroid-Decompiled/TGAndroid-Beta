package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class os {
    public final int f27654a;
    public final ls f27655b;
    public boolean f27656c;
    public boolean d;
    public boolean e;
    public long f27657f;
    public String f27658g;
    public final ArrayList h = new ArrayList();
    public boolean f27659i = false;

    public os(int i10, ls lsVar) {
        this.f27654a = i10;
        this.f27655b = lsVar;
    }

    public final void a() {
        if (!this.f27656c && !this.e) {
            this.f27656c = true;
            boolean z4 = this.d;
            int i10 = this.f27654a;
            if (!z4) {
                ns nsVar = new ns(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new hp(this, messagesStorage, nsVar, 1));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27658g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
