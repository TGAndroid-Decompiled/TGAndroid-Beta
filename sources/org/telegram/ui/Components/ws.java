package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class ws {
    public final int f28828a;
    public final ss f28829b;
    public boolean f28830c;
    public boolean d;
    public boolean e;
    public long f28831f;
    public String f28832g;
    public final ArrayList h = new ArrayList();
    public boolean f28833i = false;

    public ws(int i10, ss ssVar) {
        this.f28828a = i10;
        this.f28829b = ssVar;
    }

    public final void a() {
        if (!this.f28830c && !this.e) {
            this.f28830c = true;
            boolean z10 = this.d;
            int i10 = this.f28828a;
            if (!z10) {
                vs vsVar = new vs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new gf(this, messagesStorage, vsVar, 6));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28832g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new z1(this, 3));
        }
    }
}
