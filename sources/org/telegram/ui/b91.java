package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class b91 {
    public boolean f35546a;
    public String f35547b;
    public long f35548c;
    public kg.b d;
    public kg.b e;
    public String f35549f;
    public String f35550g;
    public boolean h;
    public final int f35551i;
    public final String f35552j;
    public boolean f35553k;
    public boolean f35554l;
    public boolean f35555m;
    public boolean f35556n;
    public boolean f35557o;

    public b91(String str, int i10) {
        this.f35552j = str;
        this.f35551i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35553k) {
            this.f35553k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35549f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new m71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
