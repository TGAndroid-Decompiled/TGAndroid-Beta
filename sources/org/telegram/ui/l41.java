package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class l41 {
    public boolean f48826a;
    public String f48827b;
    public long f48828c;
    public mg.b d;
    public mg.b f48829e;
    public String f48830f;
    public String f48831g;
    public boolean h;
    public final int f48832i;
    public final String f48833j;
    public boolean f48834k;
    public boolean f48835l;
    public boolean f48836m;
    public boolean f48837n;
    public boolean f48838o;

    public l41(String str, int i7) {
        this.f48833j = str;
        this.f48832i = i7;
    }

    public final void a(int i7, int i10, int i11, org.telegram.messenger.r10 r10Var) {
        if (!this.f48834k) {
            this.f48834k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f48830f;
            ConnectionsManager.getInstance(i7).bindRequestToGuid(ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new a31(2, this, r10Var), null, null, 0, i11, 1, true), i10);
        }
    }
}
