package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class fs {
    public final int f26209a;
    public final bs f26210b;
    public boolean f26211c;
    public boolean d;
    public boolean e;
    public long f26212f;
    public String f26213g;
    public final ArrayList h = new ArrayList();
    public boolean f26214i = false;

    public fs(int i10, bs bsVar) {
        this.f26209a = i10;
        this.f26210b = bsVar;
    }

    public final void a() {
        if (!this.f26211c && !this.e) {
            this.f26211c = true;
            boolean z10 = this.d;
            int i10 = this.f26209a;
            if (!z10) {
                es esVar = new es(this, 0);
                org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i10);
                a02.f16331a.c(new jg(this, a02, esVar, 4));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f26213g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new x1(this, 2));
        }
    }
}
