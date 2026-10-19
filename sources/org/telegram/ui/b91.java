package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class b91 {
    public boolean f35535a;
    public String f35536b;
    public long f35537c;
    public kg.b d;
    public kg.b e;
    public String f35538f;
    public String f35539g;
    public boolean h;
    public final int f35540i;
    public final String f35541j;
    public boolean f35542k;
    public boolean f35543l;
    public boolean f35544m;
    public boolean f35545n;
    public boolean f35546o;

    public b91(String str, int i10) {
        this.f35541j = str;
        this.f35540i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35542k) {
            this.f35542k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35538f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new m71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
