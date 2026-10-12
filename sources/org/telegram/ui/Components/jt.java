package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class jt {
    public final int f27640a;
    public final et f27641b;
    public boolean f27642c;
    public boolean d;
    public boolean f27643e;
    public long f27644f;
    public String f27645g;
    public final ArrayList h = new ArrayList();
    public boolean f27646i = false;

    public jt(int i10, et etVar) {
        this.f27640a = i10;
        this.f27641b = etVar;
    }

    public final void a() {
        if (!this.f27642c && !this.f27643e) {
            this.f27642c = true;
            boolean z10 = this.d;
            int i10 = this.f27640a;
            if (!z10) {
                ht htVar = new ht(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new org.telegram.tgnet.h(this, messagesStorage, htVar, 18));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f27645g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
        }
    }
}
