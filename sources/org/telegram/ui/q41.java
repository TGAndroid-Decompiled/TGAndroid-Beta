package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class q41 {
    public boolean f48948a;
    public String f48949b;
    public long f48950c;
    public mg.b d;
    public mg.b f48951e;
    public String f48952f;
    public String f48953g;
    public boolean h;
    public final int f48954i;
    public final String f48955j;
    public boolean f48956k;
    public boolean f48957l;
    public boolean f48958m;
    public boolean f48959n;
    public boolean f48960o;

    public q41(String str, int i7) {
        this.f48955j = str;
        this.f48954i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (!this.f48956k) {
            this.f48956k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f48952f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new p41(0, this, u10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
