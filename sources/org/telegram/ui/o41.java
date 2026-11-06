package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f48225a;
    public String f48226b;
    public long f48227c;
    public mg.b d;
    public mg.b f48228e;
    public String f48229f;
    public String f48230g;
    public boolean h;
    public final int f48231i;
    public final String f48232j;
    public boolean f48233k;
    public boolean f48234l;
    public boolean f48235m;
    public boolean f48236n;
    public boolean f48237o;

    public o41(String str, int i7) {
        this.f48232j = str;
        this.f48231i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (!this.f48233k) {
            this.f48233k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f48229f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new n41(0, this, u10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
