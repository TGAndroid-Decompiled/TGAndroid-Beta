package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class rs {
    public final int f28043a;
    public final ns f28044b;
    public boolean f28045c;
    public boolean d;
    public boolean e;
    public long f28046f;
    public String f28047g;
    public final ArrayList h = new ArrayList();
    public boolean f28048i = false;

    public rs(int i10, ns nsVar) {
        this.f28043a = i10;
        this.f28044b = nsVar;
    }

    public final void a() {
        if (!this.f28045c && !this.e) {
            this.f28045c = true;
            boolean z10 = this.d;
            int i10 = this.f28043a;
            if (!z10) {
                qs qsVar = new qs(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.o(this, messagesStorage, qsVar, 17));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f28047g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
