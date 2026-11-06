package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class o41 {
    public boolean f48254a;
    public String f48255b;
    public long f48256c;
    public mg.b d;
    public mg.b f48257e;
    public String f48258f;
    public String f48259g;
    public boolean h;
    public final int f48260i;
    public final String f48261j;
    public boolean f48262k;
    public boolean f48263l;
    public boolean f48264m;
    public boolean f48265n;
    public boolean f48266o;

    public o41(String str, int i7) {
        this.f48261j = str;
        this.f48260i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (!this.f48262k) {
            this.f48262k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f48258f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new n41(0, this, u10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
