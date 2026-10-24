package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class xs {
    public final int f32693a;
    public final us f32694b;
    public boolean f32695c;
    public boolean d;
    public boolean e;
    public long f32696f;
    public String f32697g;
    public final ArrayList h = new ArrayList();
    public boolean f32698i = false;

    public xs(int i10, us usVar) {
        this.f32693a = i10;
        this.f32694b = usVar;
    }

    public final void a() {
        if (!this.f32695c && !this.e) {
            this.f32695c = true;
            boolean z10 = this.d;
            int i10 = this.f32693a;
            if (!z10) {
                ws wsVar = new ws(this, 0);
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                messagesStorage.getStorageQueue().postRunnable(new jg(this, messagesStorage, wsVar, 5));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f32697g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 3));
        }
    }
}
