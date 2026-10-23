package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class zs {
    public final int f33035a;
    public final ws f33036b;
    public boolean f33037c;
    public boolean d;
    public boolean e;
    public long f33038f;
    public String f33039g;
    public final ArrayList h = new ArrayList();
    public boolean f33040i = false;

    public zs(int i10, ws wsVar) {
        this.f33035a = i10;
        this.f33036b = wsVar;
    }

    public final void a() {
        if (!this.f33037c && !this.e) {
            this.f33037c = true;
            boolean z10 = this.d;
            int i10 = this.f33035a;
            if (!z10) {
                ys ysVar = new ys(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new lg(this, messagesStorage, ysVar, 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33039g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
