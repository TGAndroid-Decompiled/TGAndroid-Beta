package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class p41 {
    public boolean f48620a;
    public String f48621b;
    public long f48622c;
    public mg.b d;
    public mg.b f48623e;
    public String f48624f;
    public String f48625g;
    public boolean h;
    public final int f48626i;
    public final String f48627j;
    public boolean f48628k;
    public boolean f48629l;
    public boolean f48630m;
    public boolean f48631n;
    public boolean f48632o;

    public p41(String str, int i7) {
        this.f48627j = str;
        this.f48626i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.u10 u10Var) {
        if (!this.f48628k) {
            this.f48628k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f48624f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new o41(0, this, u10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
