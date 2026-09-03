package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ns {
    public final int f27357a;
    public final ks f27358b;
    public boolean f27359c;
    public boolean d;
    public boolean e;
    public long f27360f;
    public String f27361g;
    public final ArrayList h = new ArrayList();
    public boolean f27362i = false;

    public ns(int i10, ks ksVar) {
        this.f27357a = i10;
        this.f27358b = ksVar;
    }

    public final void a() {
        if (!this.f27359c && !this.e) {
            this.f27359c = true;
            boolean z4 = this.d;
            int i10 = this.f27357a;
            if (!z4) {
                ms msVar = new ms(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new gp(this, messagesStorage, msVar, 1));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27361g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
