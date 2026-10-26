package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class i91 {
    public boolean f40186a;
    public String f40187b;
    public long f40188c;
    public lg.b d;
    public lg.b e;
    public String f40189f;
    public String f40190g;
    public boolean h;
    public final int f40191i;
    public final String f40192j;
    public boolean f40193k;
    public boolean f40194l;
    public boolean f40195m;
    public boolean f40196n;
    public boolean f40197o;

    public i91(String str, int i10) {
        this.f40192j = str;
        this.f40191i = i10;
    }

    public final void a(int i10, int i11, int i12, Utilities.Callback0Return callback0Return) {
        if (!this.f40193k) {
            this.f40193k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f40189f;
            ConnectionsManager.getInstance(i10).bindRequestToGuid(ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new l71(3, this, callback0Return), null, null, 0, i12, 1, true), i11);
        }
    }
}
