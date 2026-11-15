package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class l41 {
    public boolean f48830a;
    public String f48831b;
    public long f48832c;
    public mg.b d;
    public mg.b f48833e;
    public String f48834f;
    public String f48835g;
    public boolean h;
    public final int f48836i;
    public final String f48837j;
    public boolean f48838k;
    public boolean f48839l;
    public boolean f48840m;
    public boolean f48841n;
    public boolean f48842o;

    public l41(String str, int i7) {
        this.f48837j = str;
        this.f48836i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.r10 r10Var) {
        if (!this.f48838k) {
            this.f48838k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f48834f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new a31(2, this, r10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
