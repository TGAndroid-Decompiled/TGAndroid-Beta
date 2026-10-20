package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class b91 {
    public boolean f35541a;
    public String f35542b;
    public long f35543c;
    public kg.b d;
    public kg.b e;
    public String f35544f;
    public String f35545g;
    public boolean h;
    public final int f35546i;
    public final String f35547j;
    public boolean f35548k;
    public boolean f35549l;
    public boolean f35550m;
    public boolean f35551n;
    public boolean f35552o;

    public b91(String str, int i10) {
        this.f35547j = str;
        this.f35546i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35548k) {
            this.f35548k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35544f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new m71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
