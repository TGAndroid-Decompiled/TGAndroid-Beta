package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class g61 {
    public boolean f37433a;
    public String f37434b;
    public long f37435c;
    public cg.b d;
    public cg.b e;
    public String f37436f;
    public String f37437g;
    public boolean h;
    public final int f37438i;
    public final String f37439j;
    public boolean f37440k;
    public boolean f37441l;
    public boolean f37442m;
    public boolean f37443n;
    public boolean f37444o;

    public g61(String str, int i10) {
        this.f37439j = str;
        this.f37438i = i10;
    }

    public final void a(int i10, int i11, int i12, org.telegram.messenger.i20 i20Var) {
        if (!this.f37440k) {
            this.f37440k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f37436f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ul0(14, this, i20Var), null, null, 0, i12, 1, true), i11);
        }
    }
}
