package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
public final class as {
    public final int f33051a;
    public final xr f33052b;
    public boolean f33053c;
    public boolean d;
    public boolean f33054e;
    public long f33055f;
    public String f33056g;
    public final ArrayList h = new ArrayList();
    public boolean f33057i = false;

    public as(int i7, xr xrVar) {
        this.f33051a = i7;
        this.f33052b = xrVar;
    }

    public final void a() {
        if (!this.f33053c && !this.f33054e) {
            this.f33053c = true;
            boolean z10 = this.d;
            int i7 = this.f33051a;
            if (!z10) {
                zr zrVar = new zr(this, 0);
                org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i7);
                a02.f27219a.c(new yf(this, a02, zrVar, 6));
                return;
            }
            TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
            getpopularappbots.limit = 20;
            String str = this.f33056g;
            if (str == null) {
                str = "";
            }
            getpopularappbots.offset = str;
            ConnectionsManager.getInstance(i7).sendRequest(getpopularappbots, new v1(this, 2));
        }
    }
}
