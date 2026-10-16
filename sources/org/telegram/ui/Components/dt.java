package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class dt {
    public final int f24178a;
    public final zs f24179b;
    public boolean f24180c;
    public boolean d;
    public boolean e;
    public long f24181f;
    public String f24182g;
    public final ArrayList h = new ArrayList();
    public boolean f24183i = false;

    public dt(int i10, zs zsVar) {
        this.f24178a = i10;
        this.f24179b = zsVar;
    }

    public final void a() {
        if (!this.f24180c && !this.e) {
            this.f24180c = true;
            boolean z10 = this.d;
            int i10 = this.f24178a;
            if (!z10) {
                ct ctVar = new ct(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.f(this, messagesStorage, ctVar, 20));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f24182g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
