package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class na1 {
    public boolean f35948a;
    public String f35949b;
    public long f35950c;
    public jg.b d;
    public jg.b e;
    public String f35951f;
    public String f35952g;
    public boolean h;
    public final int f35953i;
    public final String f35954j;
    public boolean f35955k;
    public boolean f35956l;
    public boolean f35957m;
    public boolean f35958n;
    public boolean f35959o;

    public na1(String str, int i10) {
        this.f35954j = str;
        this.f35953i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35955k) {
            this.f35955k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35951f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new dc0(24, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
