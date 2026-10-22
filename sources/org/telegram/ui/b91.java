package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class b91 {
    public boolean f35545a;
    public String f35546b;
    public long f35547c;
    public kg.b d;
    public kg.b e;
    public String f35548f;
    public String f35549g;
    public boolean h;
    public final int f35550i;
    public final String f35551j;
    public boolean f35552k;
    public boolean f35553l;
    public boolean f35554m;
    public boolean f35555n;
    public boolean f35556o;

    public b91(String str, int i10) {
        this.f35551j = str;
        this.f35550i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f35552k) {
            this.f35552k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f35548f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new m71(1, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
