package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class b91 {
    public boolean f35542a;
    public String f35543b;
    public long f35544c;
    public kg.b d;
    public kg.b e;
    public String f35545f;
    public String f35546g;
    public boolean h;
    public final int f35547i;
    public final String f35548j;
    public boolean f35549k;
    public boolean f35550l;
    public boolean f35551m;
    public boolean f35552n;
    public boolean f35553o;

    public b91(String str, int i10) {
        this.f35548j = str;
        this.f35547i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35549k) {
            this.f35549k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35545f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new m71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
