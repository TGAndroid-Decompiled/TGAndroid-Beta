package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class b91 {
    public boolean f35551a;
    public String f35552b;
    public long f35553c;
    public kg.b d;
    public kg.b e;
    public String f35554f;
    public String f35555g;
    public boolean h;
    public final int f35556i;
    public final String f35557j;
    public boolean f35558k;
    public boolean f35559l;
    public boolean f35560m;
    public boolean f35561n;
    public boolean f35562o;

    public b91(String str, int i10) {
        this.f35557j = str;
        this.f35556i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35558k) {
            this.f35558k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35554f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new m71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
