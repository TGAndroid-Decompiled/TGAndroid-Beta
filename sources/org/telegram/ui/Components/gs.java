package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class gs {
    public final int f28855a;
    public final ds f28856b;
    public boolean f28857c;
    public boolean d;
    public boolean f28858e;
    public long f28859f;
    public String f28860g;
    public final ArrayList h = new ArrayList();
    public boolean f28861i = false;

    public gs(int i9, ds dsVar) {
        this.f28855a = i9;
        this.f28856b = dsVar;
    }

    public final void a() {
        if (!this.f28857c && !this.f28858e) {
            this.f28857c = true;
            boolean z10 = this.d;
            int i9 = this.f28855a;
            if (!z10) {
                fs fsVar = new fs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.e(this, messagesStorage, fsVar, 19));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28860g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i9).sendRequest(getpopularappbots, new w1(this, 3));
        }
    }
}
