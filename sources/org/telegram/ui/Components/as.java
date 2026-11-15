package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class as {
    public final int f33048a;
    public final xr f33049b;
    public boolean f33050c;
    public boolean d;
    public boolean f33051e;
    public long f33052f;
    public String f33053g;
    public final ArrayList h = new ArrayList();
    public boolean f33054i = false;

    public as(int i7, xr xrVar) {
        this.f33048a = i7;
        this.f33049b = xrVar;
    }

    public final void a() {
        if (!this.f33050c && !this.f33051e) {
            this.f33050c = true;
            boolean z10 = this.d;
            int i7 = this.f33048a;
            if (!z10) {
                zr zrVar = new zr(this, 0);
                org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i7);
                a02.f27220a.c(new yf(this, a02, zrVar, 6));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33053g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new v1(this, 2));
        }
    }
}
